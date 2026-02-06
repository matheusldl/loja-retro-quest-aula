import java.util.ArrayList;

public class Loja {

     private final ArrayList<ProdutoJogo> jogosVenda = new ArrayList<>();

    public Loja() {
        jogosVenda.add(new ProdutoJogo("Super Aventura 64", 45.00, "src/fotosJogo/aventura.png"));
        jogosVenda.add(new ProdutoJogo("Combate Espacial", 60.00, "src/fotosJogo/espacial.png"));
        jogosVenda.add(new ProdutoJogo("Corrida Turbo", 50.00, "src/fotosJogo/corrida.png"));
    }

    public ArrayList<ProdutoJogo> getJogosVenda() {
        return jogosVenda;
    }
}
