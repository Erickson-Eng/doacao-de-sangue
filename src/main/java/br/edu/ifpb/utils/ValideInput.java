package br.edu.ifpb.utils;

public class ValideInput {

    //valida um nome sendo só o primeiro ou primeiro + até 5 sobrenomes
    public static boolean validateName(String name){
        return name.matches("[A-Z][a-zA-Z]+|[a-zA-Z]+(\\s[a-zA-Z]+){0,5}");
    }
}
