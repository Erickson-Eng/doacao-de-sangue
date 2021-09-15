package br.edu.ifpb.entity;

import br.edu.ifpb.entity.enums.GeneroEnum;
import br.edu.ifpb.utils.ValideInput;
import lombok.ToString;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

@ToString
public class Doador {
    private String name;
    private Double peso;
    private LocalDate dataNascimento;
    private GeneroEnum genero;
    private String estaDoente;
    private String novoDoador;
    private int idade = 0;

    public Doador() {
    }

    public Doador(String name, Double peso, String dataNascimento, GeneroEnum genero, String novoDoador, String estaDoente) {
        this.setName(name);
        this.setPeso(peso);
        this.setDataNascimento(dataNascimento);
        this.setGenero(genero);
        this.setNovoDoador(novoDoador);
        this.setEstaDoente(estaDoente);
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

    public String getEstaDoente() {
        return estaDoente;
    }

    public void setEstaDoente(String estaDoente) {
        if (ValideInput.validateTrueOrFalse(estaDoente)){
            this.estaDoente = estaDoente;
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

    public void setDataNascimento(String dataNascimento) {
        LocalDate dataDeNascimento = setDate(dataNascimento);
        if (setIdade(dataDeNascimento)<124 && setIdade(dataDeNascimento)>= 0){
        this.dataNascimento = setDate(dataNascimento);
        this.idade = setIdade(dataDeNascimento);
        }
    }

    private Integer setIdade(LocalDate dataNascimento){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    private LocalDate setDate (String date){
        return LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doador doador = (Doador) o;
        return Objects.equals(name, doador.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
