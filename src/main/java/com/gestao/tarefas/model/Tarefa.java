package com.gestao.tarefas.model;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private boolean concluida;
}
