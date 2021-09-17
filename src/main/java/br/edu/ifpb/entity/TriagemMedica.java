package br.edu.ifpb.entity;

import java.util.Objects;

public class TriagemMedica {

    public String verificacaoMedica (Doador d) {
        if (verificarFebre(d)){
            return "Não é possível doar sangue, pois " + d.getName() + " está com febre!";
        }else if (verificarGravidez(d)) {
            return "Não é possível doar sangue, pois " + d.getName() + " está grávida!";
        }else if (verificarAmamentacao(d)) {
            return "Não é possível doar sangue, pois " + d.getName() + " o período de amamentação não é maior que 12 meses.";
        }else {
            return "Por favor, aguarde na fila para doação.";
        }
    }

    public boolean verificarFebre (Doador d){
        return Objects.equals(d.getSituacaoMedica().getFebre(), "V");
    }

    public boolean verificarGravidez (Doador d){
        return Objects.equals(d.getSituacaoMedica().getGravida(), "V");
    }

    public boolean verificarAmamentacao (Doador d){
        return Objects.equals(d.getSituacaoMedica().getAmamentando(), "V") && (d.getSituacaoMedica().getMesesPosParto() <= 12 && d.getSituacaoMedica().getAnosPosparto() < 1);
    }
}
