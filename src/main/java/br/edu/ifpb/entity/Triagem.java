package br.edu.ifpb.entity;

import br.edu.ifpb.entity.enums.GeneroEnum;

import java.util.ArrayList;

public class Triagem {

    public String verificarDoador (Doador d) {
        if ( verificarIdade(d) == false) {
            return  d.getName() + " não está apto para doação! " +
                    "Não tem idade permitida para doação de sangue!";
        } else if (verificarIdadeMaior60(d) == false) {
            return d.getName() + " não está apto para doação! " +
                    "Pessoas maiores de 60 precisam ter doado uma vez antes dessa idade!";
        }else if (verificarPeso(d) == false) {
            return d.getName() + " não está apto para doação! " +
                    "Não tem o peso permitido para doação!";
        }else {
            return d.getName() + " Você está apto(a) para a Etapa 2.";
        }
    }

    public boolean verificarIdade (Doador d) {
        if (16 <= d.getIdade() && d.getIdade() <= 69){
           return true;
        }else{
            return false;
        }
    }

    public boolean verificarIdadeMaior60 (Doador d) {
        if (d.getIdade() > 60 && d.getNovoDoador() == "F"){
            return true;
        }else {
            return false;
        }
    }

    public boolean verificarPeso (Doador d){
        if (d.getGenero() == GeneroEnum.MASCULINO && d.getPeso() >= 60.00){
            return true;
        }
        else if (d.getGenero() == GeneroEnum.FEMININO && d.getPeso() >= 50.00){
            return true;
        }
        else {
            return false;
        }
    }
}
