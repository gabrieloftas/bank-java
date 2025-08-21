package br.com.study;

import java.util.*;

public class TestSet {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Gabriel");
        nomes.add("Antonio");
        nomes.add("Marcus");
        nomes.add("João Pedro");
        nomes.add("Gabriel");

        nomes.forEach(nome->{
            System.out.println(nome);
        });

        Set<String> nomesSet = new HashSet<>();
        //for (int i=0;i<nomes.size();i++){
        //    nomesSet.add(nomes.get(i));
        //}
        nomes.forEach(nome->{
            nomesSet.add(nome);
        });
        System.out.println("--------------");
        nomesSet.forEach(nome->{
            System.out.println(nome);
        });
        for (String nome:nomesSet){
            System.out.println(nome);
        }
        System.out.println("-----------------");
        Iterator<String> nomesIterator = nomesSet.iterator();
        while(nomesIterator.hasNext()){
            String nome = nomesIterator.next();
            System.out.println(nome);
        }
    }
}
