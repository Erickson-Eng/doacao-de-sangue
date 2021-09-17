package br.edu.ifpb.utils;

public class ValideInput {

    //valida um nome sendo só o primeiro ou primeiro + até 5 sobrenomes
    public static boolean validateName(String name){
        return name.matches("^[a-zA-Z-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ]+|[a-zA-Z]+(\\s[a-zA-Z]+){0,5}$");
    }
    public static boolean validateTrueOrFalse(String obj){
        return obj.matches("[VF]");
    }
}
