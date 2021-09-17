package br.edu.ifpb.entity.enums;

public enum GeneroEnum {
    FEMININO(1),
    MASCULINO(2);

    private int code;

    private GeneroEnum(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }

    public static GeneroEnum valueOf(int code){
        for (GeneroEnum value: GeneroEnum.values()) {
            if (value.getCode() == code){
                return value;
            }
        }throw new IllegalArgumentException("Código invalido");
    }
}
