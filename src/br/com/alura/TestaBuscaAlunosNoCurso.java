package br.com.alura;

public class TestaBuscaAlunosNoCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Rodrigo Turini", 278927);
        Aluno a2 = new Aluno("Kassio Fernandes", 782034);
        Aluno a3 = new Aluno("Breno Fernandes", 811027);
        Aluno a4 = new Aluno("Bruno Silva", 782034);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        javaColecoes.matricula(a4);

        System.out.println(javaColecoes.getAlunos());
        System.out.println("Quem é o aluno com matricula 782034?");
        Aluno aluno = javaColecoes.buscaMatriculado(782034);
        System.out.println("aluno: " + aluno);
    }
}
