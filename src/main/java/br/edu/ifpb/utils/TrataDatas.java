package br.edu.ifpb.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TrataDatas {

    public static Integer localDateToIntegerAnos(LocalDate dataNascimento){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    public static Integer localDateToIntegerMeses(LocalDate date){
        return Period.between(date, LocalDate.now()).getMonths();
    }

    public static LocalDate stringToLocalDate(String date){
        return LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
