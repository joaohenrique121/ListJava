/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unifae.engsof.poo3.gerenciadorDeTarefas.model;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author android
 */
public abstract class Tarefa {
    private String descricao;
    private boolean concluida;
    private int prioridade;
    private LocalDate dataCriacao;

    public Tarefa(){};

    public Tarefa(String descricao, int prioridade, LocalDate dataCriacao) {
        this.descricao = descricao;
        this.concluida = false;
        this.prioridade = prioridade;
        this.dataCriacao = dataCriacao;
    }

    @Override
    public String toString() {
        return "Tarefa:" + "descricao=" + descricao + ", concluida=" + concluida + ", prioridade=" + prioridade + ", dataCriacao=" + dataCriacao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.descricao);
        hash = 47 * hash + (this.concluida ? 1 : 0);
        hash = 47 * hash + this.prioridade;
        hash = 47 * hash + Objects.hashCode(this.dataCriacao);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tarefa other = (Tarefa) obj;
        if (this.concluida != other.concluida) {
            return false;
        }
        if (this.prioridade != other.prioridade) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        return Objects.equals(this.dataCriacao, other.dataCriacao);
    }

 
    
    

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
  
    
}
