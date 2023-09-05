package exercicio3;

public class Estudante {
    private String nome;
    private int idade;

    public Estudante(String estudante, int idade){
        this.idade = idade;
        this.nome = estudante;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
