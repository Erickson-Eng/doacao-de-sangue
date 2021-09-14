package br.edu.ifpb.entity;

import br.edu.ifpb.entity.enums.GeneroEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doador {
    private String name;
    private Double peso;
    private LocalDate dataNascimento;
    private GeneroEnum genero;
    private boolean novoDoador;
    private boolean estaDoente;
}
