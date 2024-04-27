package exercicio13_14_15;

public class Teste {

    public static void main(String[] args) {
        FilaEncadeada<String> fila = new FilaEncadeada<>();

        fila.enqueue("Walter");
        fila.enqueue("Lucas");
        fila.enqueue("Matheus");

        fila.dequeue();

        fila.percorrerFila();
        String nome = "Matheus";
        System.out.println();
        String posicao = fila.posicaoFila(nome) == -1 ? "Posicao nao encontrada" : "Posicao: " + fila.posicaoFila(nome);
        System.out.println(posicao);
        System.out.println();
        String ultimo = fila.ultimoElemento() == null ? "Fila vazia!" : "Ultimo: " + fila.ultimoElemento();
        System.out.println(ultimo);
        System.out.println();
        String qtdElementos = fila.quantidadeElementos() == 0 ? "Fila vazia!" : "Quantidade de elementos: " + fila.quantidadeElementos();
        System.out.println(qtdElementos);

    }
}
