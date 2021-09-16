package br.edu.ifpb.entity;

import br.edu.ifpb.utils.ValideInput;
import lombok.ToString;

import java.time.LocalDate;

@ToString
public class SituacaoMedica {

    private String gravida;
    private String amamentando;
    private LocalDate diaDoParto;
    private Integer periodoPosParto;
    private String febre;

    public SituacaoMedica() {
    }

    public SituacaoMedica(String gravida, String amamentando, LocalDate diaDoParto, Integer periodoPosParto, String febre) {
        this.gravida = gravida;
        this.amamentando = amamentando;
        this.diaDoParto = diaDoParto;
        this.periodoPosParto = periodoPosParto;
        this.febre = febre;
    }

    public String getGravida() {
        return gravida;
    }

    public void setGravida(String gravida) {
        this.gravida = gravida;
    }

    public String getAmamentando() {
        return amamentando;
    }

    public void setAmamentando(String amamentando) {
        this.amamentando = amamentando;
    }

    public LocalDate getDiaDoParto() {
        return diaDoParto;
    }

    public void setDiaDoParto(LocalDate diaDoParto) {
        this.diaDoParto = diaDoParto;
    }

    public Integer getPeriodoPosParto() {
        return periodoPosParto;
    }

    public void setPeriodoPosParto(Integer periodoPosParto) {
        this.periodoPosParto = periodoPosParto;
    }

    public String getFebre() {
        return febre;
    }

    public void setFebre(String febre) {
        if (ValideInput.validateTrueOrFalse(febre)){
            this.febre = febre;
        }
    }
}
