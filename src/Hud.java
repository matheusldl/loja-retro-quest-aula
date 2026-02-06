import javax.swing.*;
import java.awt.*;

public class Hud extends JFrame {
    Carrinho carrinho = new Carrinho();
    private JLabel totalTextoCarrinho = new JLabel();


    public Hud() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(850, 650);
        setLocationRelativeTo(null);
        add(telaPrincipal());

        setVisible(true);
    }


    private JPanel telaPrincipal(){
        JPanel telaPrincipal = new JPanel();
        telaPrincipal.setLayout(new GridLayout(1, 4, 10, 10));

        telaPrincipal.add(Card(nomeJogoEPreco("Arata"), preco(51.99), imagemJogo("src/fotosJogo/aventura.png")));
        telaPrincipal.add(Card(nomeJogoEPreco("Arata"), preco(51.99), imagemJogo("src/fotosJogo/aventura.png")));
        telaPrincipal.add(Card(nomeJogoEPreco("Arata"), preco(51.99), imagemJogo("src/fotosJogo/aventura.png")));
        telaPrincipal.add(totalTextoCarrinho);
        totalTextoCarrinho.setText("R$ 0,00");



        return telaPrincipal;
    }

    private JPanel Card(JLabel nome, JLabel preco, JLabel img) {
        //bastante dificuldade aqui, tive que pesquisar com o tio GPT como funciona essa parte, mas sem ele dar a resposta)

        JPanel janela = new JPanel();
        janela.setLayout(new BoxLayout(janela, BoxLayout.Y_AXIS));

        janela.add(nome);
        janela.add(img);
        janela.add(preco);
        JButton add = botaoAdd();
        JButton remover = botaoRemover();
        janela.add(add);
        janela.add(remover);

        preco.setAlignmentX(Component.CENTER_ALIGNMENT);
        img.setAlignmentX(Component.CENTER_ALIGNMENT);
        nome.setAlignmentX(Component.CENTER_ALIGNMENT);
        add.setAlignmentX(Component.CENTER_ALIGNMENT);
        remover.setAlignmentX(Component.CENTER_ALIGNMENT);


        return janela;
    }


    private final JButton botaoAdd() {
        JButton botao = new JButton();
        botao.setText("Adicionar");
        botao.setSize(200, 40);
        botao.setBackground(Color.green);

        botao.addActionListener(e -> {
            carrinho.setPrecoTotalCarrinho(carrinho.getPrecoTotalCarrinho() + 5);
            totalTextoCarrinho.setText(String.valueOf("R$ " + carrinho.getPrecoTotalCarrinho()));
        });


        return botao;
    }

    private final JButton botaoRemover() {
        JButton botao = new JButton();
        botao.setText("Remover");
        botao.setSize(200, 40);
        botao.setBackground(Color.red);
        carrinho.setPrecoTotalCarrinho(carrinho.getPrecoTotalCarrinho());

        return botao;
    }

    private final JLabel nomeJogoEPreco(String texto) {
        JLabel escrita = new JLabel();
        escrita.setText(texto);

        return escrita;
    }

    private final JLabel imagemJogo(String endereco) {
        JLabel fotoCriar = new JLabel();
        ImageIcon fotoJogo = new ImageIcon(endereco);
        fotoCriar.setIcon(fotoJogo);
        return fotoCriar;
    }

    private final JLabel preco(double preco) {
        JLabel precoGame = new JLabel();
        precoGame.setText(new String("R$ " + Double.toString(preco)));

        return precoGame;
    }


}




