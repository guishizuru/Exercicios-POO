package exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Turma {
   private List<Estudante> estudantes = new ArrayList<>();

    public  void adicionarEstudante(List<Estudante>minhaListaDeEstudantes, int idade, String nome) {
        Estudante estudante = new Estudante(nome, idade);
         minhaListaDeEstudantes.add(estudante);
    }

    public  int getIdadeMediaDosEstudantes(List<Estudante>minhaListaDeEstudantes) {
        if (minhaListaDeEstudantes == null || minhaListaDeEstudantes.isEmpty()) {
            throw new IllegalArgumentException("A lista esta vazia ou nula");
        }
        int guardarValorDasoma = 0;

        for( Estudante estudante : minhaListaDeEstudantes ) {
            guardarValorDasoma += estudante.getIdade();
        }
        return guardarValorDasoma / minhaListaDeEstudantes.size();
    }

    public int getIdadeEstudanteMaisVelho(List<Estudante> minhaListaDeEstudantes){
        int maiorIdade = 0;
        for( Estudante estudante : minhaListaDeEstudantes ){
           if (estudante.getIdade() > maiorIdade){
               maiorIdade = estudante.getIdade();
           }
        }

        return maiorIdade;
    }
}

