import javax.swing.*;

public class ProdutoJogo {
    private String nome;
    private ImageIcon imagem;
    private double preco;

    public ProdutoJogo(String nome, double preco, String caminhoImagem) {
        this.nome = nome;
        this.imagem = new ImageIcon(caminhoImagem);
        this.preco = preco;
    }

    public String getNome() { return nome; }
    public ImageIcon getImagem() { return imagem; }
    public double getPreco() { return preco; }
}
