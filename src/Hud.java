import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Hud extends JFrame {
    Carrinho carrinho;
    Loja loja;

    ArrayList<Carrinho> cartaz = new ArrayList<>();

    private JLabel totalTextoCarrinho = new JLabel();


    public Hud() {

        this.carrinho = new Carrinho();
        this.loja = new Loja();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(850, 650);
        setLocationRelativeTo(null);
        add(telaPrincipal());

        setVisible(true);
    }


    private JPanel telaPrincipal(){
        JPanel telaPrincipal = new JPanel();
        telaPrincipal.setLayout(new GridLayout(0, 4, 10, 10));

        for(ProdutoJogo jogo : loja.getJogosVenda()){
            telaPrincipal.add(Card(jogo));
        }

        totalTextoCarrinho.setText("Total: " + carrinho.getPrecoTotalCarrinho());
        telaPrincipal.add(totalTextoCarrinho);


        return telaPrincipal;
    }



    private JPanel Card(ProdutoJogo jogo) {
        //bastante dificuldade aqui, tive que pesquisar com o tio GPT como funciona essa parte, mas sem ele dar a resposta)

        JPanel janela = new JPanel();
        janela.setLayout(new BoxLayout(janela, BoxLayout.Y_AXIS));

        JLabel preco = precoJogo(jogo.getPreco()); janela.add(preco);

        JLabel img = imagemJogo(jogo.getImagem()); janela.add(img);

        JLabel nome = nomeJogo(jogo.getNome());  janela.add(nome);

        JButton add = botaoAdd(jogo.getPreco()); janela.add(add);
        JButton remover = botaoRemover(jogo.getPreco());  janela.add(remover);

        preco.setAlignmentX(Component.CENTER_ALIGNMENT);
        img.setAlignmentX(Component.CENTER_ALIGNMENT);
        nome.setAlignmentX(Component.CENTER_ALIGNMENT);
        add.setAlignmentX(Component.CENTER_ALIGNMENT);
        remover.setAlignmentX(Component.CENTER_ALIGNMENT);


        return janela;
    }


    private final JButton botaoAdd(double valor) {
        JButton botao = new JButton();
        botao.setText("Adicionar");
        botao.setSize(200, 40);
        botao.setBackground(Color.green);

        botao.addActionListener(e -> {
            carrinho.setPrecoTotalCarrinho(carrinho.getPrecoTotalCarrinho() + valor);
            totalTextoCarrinho.setText(String.valueOf("R$ " + carrinho.getPrecoTotalCarrinho()));
        });


        return botao;
    }

    private final JButton botaoRemover(double valor) {
        JButton botao = new JButton();
        botao.setText("Remover");
        botao.setSize(200, 40);
        botao.setBackground(Color.red);

        botao.addActionListener(e -> {
            carrinho.setPrecoTotalCarrinho(carrinho.getPrecoTotalCarrinho() - valor);
        });

        return botao;
    }

    private final JLabel nomeJogo(String texto) {
        JLabel escrita = new JLabel();
        escrita.setText(texto);

        return escrita;
    }

    private final JLabel imagemJogo(ImageIcon icon) {
        JLabel fotoCriar = new JLabel();
        fotoCriar.setIcon(icon);
        return fotoCriar;
    }

    private final JLabel precoJogo(double preco) {
        JLabel precoGame = new JLabel();
        precoGame.setText(String.format("R$ %.2f", preco).replace(".", ","));

        return precoGame;
    }

}







