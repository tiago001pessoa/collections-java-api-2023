import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributos da classe
    private List<Item> itemList;

    //construtor
    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    //metodos da classe

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item i : itemList) {
            if(i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            }
        }
        itemList.removeAll(itensParaRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for(Item i : itemList) {
            valorTotal = valorTotal + i.getPreco()*i.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(itemList); // este print funciona corretamente por causa do metodo
                                        // ToString na classe Item
    }

    //testando os metodos
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras1 = new CarrinhoDeCompras();

        carrinhoDeCompras1.adicionarItem("leite", 5.0, 2);
        System.out.println("o valor total do carrinho eh " + carrinhoDeCompras1.calcularValorTotal());
        carrinhoDeCompras1.exibirItens();
    }

    
}
 