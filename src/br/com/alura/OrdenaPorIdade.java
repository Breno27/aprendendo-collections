package br.com.alura;

import java.util.Comparator;

public class OrdenaPorIdade implements Comparator<Funcionario> {
    private Funcionario funcionario;

    @Override
    public int compare(Funcionario o1, Funcionario o2) {
        Integer idade1 = o1.getIdade();
        return idade1.compareTo(o2.getIdade());
    }
}
