import java.util.ArrayList;

public class Carrinho {
    private ArrayList<ProdutoJogo> cartazLista = new ArrayList<>();

    private double precoTotalCarrinho = total(0);




    public double total(double resultado){
        for (ProdutoJogo p: cartazLista) {
            resultado += p.getPreco();
        }
        aplicarDesconto(resultado);
        return resultado;

    }

    private boolean podeAplicarDesconto(double total){
       return total > 150;
    }

    private double aplicarDesconto(double total){
        if (podeAplicarDesconto(total)) {
            return (total - (total * 0.15));
        }
        else return total;
    }



    public ArrayList<ProdutoJogo> getCartazLista() {
        return cartazLista;
    }

    public void setCartazLista(ArrayList<ProdutoJogo> cartazLista) {
        cartazLista = cartazLista;
    }

    public double getPrecoTotalCarrinho() {
        return precoTotalCarrinho;
    }

    public void setPrecoTotalCarrinho(double precoTotalCarrinho) {
        this.precoTotalCarrinho = precoTotalCarrinho;
    }


}
