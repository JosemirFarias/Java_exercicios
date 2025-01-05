package generics;

public class CaixaTeste {
    public static void main(String[] args) {

        Caixa<String> caixaA = new Caixa<>();
        caixaA.adicionar("Bicicleta");

        Object conteudoA = caixaA.obterConteudo();
        System.out.println(conteudoA);

        Caixa<Integer> caixaB = new Caixa<>();
        caixaB.adicionar(10);

        Object conteudoB = caixaB.obterConteudo();
        System.out.println(conteudoB);
    }
}
