package br.edu.ifpb.utils;

public class ValideInput {

    //valida um nome sendo só o primeiro ou primeiro + até 5 sobrenomes
    public static boolean validateName(String name){
        return name.matches("[A-Z][a-zA-Z]+|[a-zA-Z]+(\\s[a-zA-Z]+){0,5}");
    }

//    "\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");

    public static void main(String[] args) {
        String nome = "Erickson Tulio Rodrigues Azevedo Erickson";
        String nome2 = "123ERAS";
        String nome3 = "";
        System.out.println(ValideInput.validateName(nome));
        System.out.println(ValideInput.validateName(nome2));
        System.out.println(ValideInput.validateName(nome3));

    }
}
