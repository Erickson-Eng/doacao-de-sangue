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

    public Doador(String name, GeneroEnum genero, Double peso, String dataNascimento, String novoDoador, SituacaoMedica situacaoMedica) {
        this.setName(name);
        this.setGenero(genero);
        this.setPeso(peso);
        this.setDataNascimento(dataNascimento);
        this.setNovoDoador(novoDoador);
        this.setSituacaoMedica(situacaoMedica);
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

    public void setGenero(GeneroEnum genero) {
        this.genero = genero;
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

    public void setDataNascimento(String dataNascimento) {
        LocalDate dataDeNascimento = TrataDatas.stringToLocalDate(dataNascimento);
        if (TrataDatas.localDateToIntegerIdade(dataDeNascimento)<124 && TrataDatas.localDateToIntegerIdade(dataDeNascimento)>= 0){
            this.setDataNascimento(dataNascimento);
            this.setIdade(TrataDatas.localDateToIntegerIdade(dataDeNascimento));
        }
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
