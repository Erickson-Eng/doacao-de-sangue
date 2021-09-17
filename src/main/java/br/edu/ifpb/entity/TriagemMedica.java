package br.edu.ifpb.entity;

import br.edu.ifpb.entity.Doador;
import br.edu.ifpb.entity.enums.GeneroEnum;

import java.util.ArrayList;

public class TriagemMedica {

    public String verificacaoMedica (Doador d) {
        if (verificarFebre(d) == true){
            return "Não é possível doar sangue, pois " + d.getName() + " está com febre!";
        }else if (verificarGravidez(d) == true) {
            return "Não é possível doar sangue, pois " + d.getName() + " está grávida!";
        }else if (verificarAmamentacao(d) == true) {
            return "Não é possível doar sangue, pois " + d.getName() + " o período de amamentação não é maior que 12 meses.";
        }else {
            return "Por favor, aguarde na fila para doação.";
        }
    }

    public boolean verificarFebre (Doador d){
        if (d.getSituacaoMedica().getFebre() == "V"){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean verificarGravidez (Doador d){
        if (d.getSituacaoMedica().getGravida() == "V"){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean verificarAmamentacao (Doador d){
        if (d.getSituacaoMedica().getAmamentando() == "V" && d.getSituacaoMedica().getPeriodoPosParto() <= 12){
            return true;
        }
        else {
            return false;
        }
    }
}
