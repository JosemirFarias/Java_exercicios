package generics;

public class Caixa<TIPO> {
    private Object conteudo;

    public void adicionar(Object conteudo){
        this.conteudo = conteudo;
    }

    public Object obterConteudo(){
        return conteudo;
    }
}
