/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unifae.engsof.poo3.gerenciadorDeTarefas.model;

import java.time.LocalDate;

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
    public boolean equals(Object obj) {
        if(!this.equals(obj)) return false;
        
        if(!(obj instanceof Tarefa))return false;
        
        if(!(this.descricao.equals(((Tarefa)obj).descricao))) return false;
        if(!((this.prioridade != ((Tarefa)obj).prioridade))) return false;
        if(!((this.concluida != ((Tarefa)obj).concluida))) return false;
        if(!(this.dataCriacao.equals(((Tarefa)obj).dataCriacao))) return false;
        
        return true;
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
