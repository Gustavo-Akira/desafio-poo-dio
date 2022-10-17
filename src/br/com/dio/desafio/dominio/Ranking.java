package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ranking {
    private List<Dev> devs = new ArrayList<>();

    public Ranking(List<Dev> devs){
        this.devs = devs.stream().sorted((x,y) -> (int) x.calcularTotalXp()).collect(Collectors.toList());
    }

    public void printRanking(){
        int x = 1;
        System.out.println("Ranking");
        for (Dev dev: devs) {
            System.out.println(x +"º Nome: " + dev.getNome()+ " XP: "+ dev.calcularTotalXp());
            x++;
        }
    }
}
