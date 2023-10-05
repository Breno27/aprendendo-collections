package br.com.alura;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TesteMap {
    public static void main(String[] args) {
        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);

        Set<String> chaves = nomesParaIdade.keySet();
        chaves.forEach(System.out::println);

        for (String chave : chaves) {
            System.out.println(chave);
        }

        Collection<Integer> valores = nomesParaIdade.values();
        valores.forEach(System.out::println);

        for (Integer valor : valores) {
            System.out.println(valor);
        }

        Set<Map.Entry<String, Integer>> chavesValores = nomesParaIdade.entrySet();
        chavesValores.forEach(System.out::println);

        for (Map.Entry<String, Integer> chaveValor : chavesValores){
            String mensagem = String.format("chave: %s - valor: %s", chaveValor.getKey(), chaveValor.getValue());
            System.out.println(mensagem);
        }
    }
}
