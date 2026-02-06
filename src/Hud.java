import javax.swing.*;
import java.awt.*;

public class Hud extends JFrame {


    public Hud(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(850, 650);


        add(painelCard());



        setVisible(true);

    }




    private JPanel painelCard(JLabel nome, JLabel no){
        //bastante dificuldade aqui, tive que pesquisar como alinhar etc, mas sem consultar codigos prontos(usar gpt no caso)

        JPanel janela = new JPanel();
        janela.setLayout(new BoxLayout(janela, BoxLayout.Y_AXIS));

        JLabel img = (JLabel) janela.add(imagemJogo("src/fotosJogo/Photos_zJP17y7dSM.png"));
        JLabel nome = (JLabel) janela.add(nomeJogo("Arata Gamer"));
        JButton botao = (JButton) janela.add(botaoAdd());

        img.setAlignmentX(Component.CENTER_ALIGNMENT);
        nome.setAlignmentX(Component.CENTER_ALIGNMENT);
        botao.setAlignmentX(Component.CENTER_ALIGNMENT);

        janela.setVisible(true);
        return janela;
    }


    private JButton botaoAdd(){
        JButton botao = new JButton();
        botao.setText("Adicionar ao Carrinho");
        botao.setSize(200, 40);
        botao.setBackground(Color.green);

        return botao;
    }

    private final JLabel nomeJogo(String texto){
        JLabel escrita = new JLabel();
        escrita.setText(texto);

        return escrita;
    }

    private final JLabel imagemJogo(String endereco){
        JLabel fotoCriar = new JLabel();
        ImageIcon fotoJogo = new ImageIcon(endereco);
        fotoCriar.setIcon(fotoJogo);
        return fotoCriar;
    }

    private JLabel valorCarrinho(){
        JLabel valor = new JLabel();
        valor.setText("0");

        return valor;
    }


}
