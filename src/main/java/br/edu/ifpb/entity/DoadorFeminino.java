package br.edu.ifpb.entity;

import lombok.*;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoadorFeminino extends Doador{
    private boolean periodoDeAmamentacao;
    private LocalDate diaParto;
}
