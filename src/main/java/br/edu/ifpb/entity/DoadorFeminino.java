package br.edu.ifpb.entity;

import lombok.*;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoadorFeminino extends Doador{
    private Boolean estaGravida;
    private Boolean periodoDeAmamentacao;
    private LocalDate diaParto;
    private Integer periodoParto;
}
