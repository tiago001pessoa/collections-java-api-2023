import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //propriedades da classe
    private List<Integer> lista = new ArrayList<Integer>();

    //getters and setters
    public List<Integer> getLista() {
        return lista;
    }

    public void setLista(List<Integer> lista) {
        this.lista = lista;
    }

    //construtor
    public SomaNumeros() {
        this.lista = new ArrayList<>();
    }

    //metodos da classe
    public void adicionarNumero(int numero) {
        lista.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for(int n : lista) {
            soma += n;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = 0;
        for (int n : lista) {
            if (n > maiorNumero) {
                maiorNumero = n;
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = encontrarMaiorNumero();
        for (int n : lista) {
            if (n < menorNumero) {
                menorNumero = n;
            }
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        System.out.println(lista);
    }

    public static void main(String[] args) {
        SomaNumeros lista1 = new SomaNumeros();
        lista1.adicionarNumero(1);
        lista1.adicionarNumero(2);
        lista1.adicionarNumero(3);
        
        lista1.exibirNumeros();
        System.out.println("o maior numero eh " + lista1.encontrarMaiorNumero());
        System.out.println("o menor numero eh " + lista1.encontrarMenorNumero());
    }
    
    
}
