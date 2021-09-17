package br.edu.ifpb.entity;

import br.edu.ifpb.utils.TrataDatas;
import lombok.ToString;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

@ToString
public class SituacaoMedica {

    private String gravida;
    private String amamentando;
    private LocalDate diaDoParto;
    private Integer periodoPosParto;
    private String febre;

    public SituacaoMedica() {
    }

    public SituacaoMedica(String gravida, String amamentando,
                          String diaDoParto, String febre) {
        this.setGravida(gravida);
        this.setAmamentando(amamentando);
        this.setDiaDoParto(diaDoParto);
        this.setFebre(febre);
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

    public void setDiaDoParto(String obj) {
        try{
            LocalDate diaDoParto = TrataDatas.stringToLocalDate(obj);
            if (diaDoParto != null){
                this.setDiaDoParto(diaDoParto);
                this.setPeriodoPosParto(TrataDatas.localDateToIntegerMeses(diaDoParto));
            }
        }catch (DateTimeParseException e){
            this.diaDoParto = null;
            this.setPeriodoPosParto(null);
        }

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
        this.febre = febre;
    }


    public void setDiaDoParto(LocalDate diaDoParto) {
        this.diaDoParto = diaDoParto;
    }
}
