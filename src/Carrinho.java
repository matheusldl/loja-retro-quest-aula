import java.util.ArrayList;

public class Carrinho {
    private ArrayList<ProdutoJogo> carrinhoUser = new ArrayList<>();

    private double precoTotalCarrinho = 0;
    private boolean jaDeuDesconto = false;





    public ArrayList<ProdutoJogo> getCarrinhoUser() {
        return carrinhoUser;
    }


    public double getPrecoTotalCarrinho() {
        return precoTotalCarrinho;
    }



    public double setPrecoTotalCarrinho(double precoTotalCarrinho) {
        if (precoTotalCarrinho > 150 && !isJaDeuDesconto()){
            this.jaDeuDesconto = true;
            return this.precoTotalCarrinho = (getPrecoTotalCarrinho() - (getPrecoTotalCarrinho() * 0.15));

        }
        return this.precoTotalCarrinho = precoTotalCarrinho;
    }

    public boolean isJaDeuDesconto() {
        return jaDeuDesconto;
    }



}
