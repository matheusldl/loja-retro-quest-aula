import java.util.ArrayList;

public class Loja {

     private final ArrayList<ProdutoJogo> jogosVenda = new ArrayList<>();

    public Loja() {
        jogosVenda.add(new ProdutoJogo("Arata", 11.99, "src/fotosJogo/aventura.png"));
        jogosVenda.add(new ProdutoJogo("Arata", 22.99, "src/fotosJogo/aventura.png"));
        jogosVenda.add(new ProdutoJogo("Arata", 33.99, "src/fotosJogo/aventura.png"));
    }

    public ArrayList<ProdutoJogo> getJogosVenda() {
        return jogosVenda;
    }
}
