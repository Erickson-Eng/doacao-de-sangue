package br.edu.ifpb.entity;

import br.edu.ifpb.entity.enums.GeneroEnum;
import br.edu.ifpb.utils.TrataDatas;
import br.edu.ifpb.utils.ValideInput;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Objects;

@ToString
public class Doador {
    private String name;
    private GeneroEnum genero;
    private Double peso;
    private LocalDate dataNascimento;
    private int idade = 0;
    private String novoDoador;

    private SituacaoMedica situacaoMedica;

    public Doador() {
    }

    public Doador(String name, Integer genero, Double peso, String dataNascimento, String novoDoador, SituacaoMedica situacaoMedica) {
        this.setName(name);
        this.setGenero(genero);
        this.setPeso(peso);
        this.setDataDeNascimento(dataNascimento);
        this.setNovoDoador(novoDoador);
        this.setSituacaoMedica(situacaoMedica);
        if (getGenero().equals(GeneroEnum.MASCULINO)){
            situacaoMedica.setGravida("F");
            situacaoMedica.setAmamentando("F");
            situacaoMedica.setMesesPosParto(null);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (ValideInput.validateName(name)){
            this.name = name;
        }
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        if (peso > 0){
            this.peso = peso;
        }
    }

    public GeneroEnum getGenero() {
        return genero;
    }

    public void setGenero(Integer codigo) {
        if (codigo != null){
            this.genero = GeneroEnum.valueOf(codigo);
        }
    }


    public String getNovoDoador() {
        return novoDoador;
    }

    public void setNovoDoador(String novoDoador) {
        if (ValideInput.validateTrueOrFalse(novoDoador)){
            this.novoDoador = novoDoador;
        }
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setDataDeNascimento(String obj) {
        LocalDate dataDeNascimento = TrataDatas.stringToLocalDate(obj);
        if (TrataDatas.localDateToIntegerAnos(dataDeNascimento)<124 && TrataDatas.localDateToIntegerAnos(dataDeNascimento)>= 0){
            this.setDataNascimento(dataDeNascimento);
            this.setIdade(TrataDatas.localDateToIntegerAnos(dataDeNascimento));
        }
    }

    private void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    public SituacaoMedica getSituacaoMedica() {
        return situacaoMedica;
    }

    public void setSituacaoMedica(SituacaoMedica situacaoMedica) {
        this.situacaoMedica = situacaoMedica;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doador doador = (Doador) o;
        return Objects.equals(getName(), doador.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }


}
