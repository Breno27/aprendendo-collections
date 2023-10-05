package br.com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("Breno Fernandes");
        alunos.add("Breno Fernandes");
        alunos.add("Leonardo Ramos");
        alunos.add("José Cestaro");
        alunos.add("Ronaldo Aleo");
        alunos.add("Guilherme Lima");
        alunos.add("Luciano Lopes");

        boolean brenoEstaMatriculado = alunos.contains("Breno Fernandes");
        alunos.remove("Luciano Lopes");
        System.out.println(brenoEstaMatriculado);

        System.out.println(alunos.size());

        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        alunos.forEach(System.out::println);

        System.out.println(alunos);

        //caso muuuito necessário que seja transformado numa lista, pode ser passado o conjunto para o construtos da lista
        List<String> alunosEmLista = new ArrayList<>(alunos);
        System.out.println(alunosEmLista.get(2));
    }
}
