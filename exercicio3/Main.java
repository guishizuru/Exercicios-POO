package exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Turma turma = new Turma();
        List<Estudante>lista = new ArrayList<>();

        turma.adicionarEstudante( lista,10, "luan");
        turma.adicionarEstudante( lista,11, "luana");
        turma.adicionarEstudante( lista,10, "julio");
        turma.adicionarEstudante( lista,15, "cleber");


        System.out.println(turma.getIdadeEstudanteMaisVelho(lista));



    }
}
