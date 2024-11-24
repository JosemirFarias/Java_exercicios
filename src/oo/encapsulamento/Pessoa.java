package oo.encapsulamento;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        setIdade(idade);
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Getters para ler a idade
    public int getIdade() {
        return idade;
    }

    //Setters para alterar a idade
    public void setIdade(int novaIdade) {
        novaIdade = Math.abs(novaIdade); //Inverte de negativo para positívo
        if (novaIdade > 0 && novaIdade <= 150) {
            this.idade = novaIdade;
        }
    }

    @Override
    public String toString() {
        return "Pessoa{" + "Meu nome é " + nome + " e tenho " + idade + '}';
    }
}
