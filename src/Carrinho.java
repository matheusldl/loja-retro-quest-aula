import java.util.ArrayList;

public class Carrinho {
    private ArrayList<ProdutoJogo> carrinho = new ArrayList<>();
    private double totalCarrinho = 0;

    public double total(double resultado){
        for (ProdutoJogo p: carrinho) {
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
            return total = (total - (total * 0.15));
        }
        else return total;
    }



    public ArrayList<ProdutoJogo> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(ArrayList<ProdutoJogo> carrinho) {
        carrinho = carrinho;
    }

    public double getTotalCarrinho() {
        return totalCarrinho;
    }

    public void setTotalCarrinho(double totalCarrinho) {
        this.totalCarrinho = totalCarrinho;
    }
}
