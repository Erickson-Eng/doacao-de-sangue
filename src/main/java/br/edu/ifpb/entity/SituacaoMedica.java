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
    private Integer anosPosparto;
    private Integer mesesPosParto;
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
                this.setMesesPosParto(TrataDatas.localDateToIntegerMeses(diaDoParto));
                this.setAnosPosparto(TrataDatas.localDateToIntegerAnos(diaDoParto));
            }
        }catch (DateTimeParseException e){
            this.diaDoParto = null;
            this.setMesesPosParto(null);
        }

    }

    public Integer getAnosPosparto() {
        return anosPosparto;
    }

    public void setAnosPosparto(Integer anosPosparto) {
        this.anosPosparto = anosPosparto;
    }

    public Integer getMesesPosParto() {
        return mesesPosParto;
    }

    public void setMesesPosParto(Integer mesesPosParto) {
        this.mesesPosParto = mesesPosParto;
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
