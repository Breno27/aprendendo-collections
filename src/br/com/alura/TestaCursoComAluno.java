package br.com.alura;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class TestaCursoComAluno {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Rodrigo Turini", 278927);
        Aluno a2 = new Aluno("Kassio Fernandes", 782034);
        Aluno a3 = new Aluno("Breno Fernandes", 811027);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos os alunos matriculados: ");
        //javaColecoes.getAlunos().forEach(System.out::println);

        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterator = alunos.iterator();
        while (iterator.hasNext()) {
            Aluno proximo = iterator.next();
            System.out.println(proximo);
        }

        Vector<Aluno> vetor = new Vector<>();

        /*for (Aluno a: javaColecoes.getAlunos()) {
            System.out.println(a);
        }*/

        System.out.println("O aluno" + a1 + " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));

        Aluno turini = new Aluno("Rodrigo Turini", 811027);
        System.out.println("E esse turini, está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(turini));

        System.out.println("O a1 é eaquals ao turini?");
        System.out.println(a1.equals(turini));

        // obrigatóriamente o seguinte é true:

        System.out.println(a1.hashCode() == turini.hashCode());
    }
}
