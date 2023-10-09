public class Item {
    //atributos da classe
    private String nome = "";
    private double preco = 0;
    private int quantidade = 0;

    //getters and setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //construtor
    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    @Override
    public String toString() {
        return "Item [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }

    

    

    
}
