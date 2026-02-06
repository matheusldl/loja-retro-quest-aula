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

        if (precoTotalCarrinho < 0) {
            precoTotalCarrinho = 0;
        }

        if (precoTotalCarrinho <= 150) {
            this.jaDeuDesconto = false;
            this.precoTotalCarrinho = precoTotalCarrinho;
            return this.precoTotalCarrinho;
        }

        if (!isJaDeuDesconto()) {
            this.jaDeuDesconto = true;
            precoTotalCarrinho = precoTotalCarrinho * 0.85;
        }

        this.precoTotalCarrinho = precoTotalCarrinho;
        return this.precoTotalCarrinho;
    }


    public boolean isJaDeuDesconto() {
        return jaDeuDesconto;
    }



}
