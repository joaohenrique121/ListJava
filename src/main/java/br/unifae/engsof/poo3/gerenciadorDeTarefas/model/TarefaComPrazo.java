package br.unifae.engsof.poo3.gerenciadorDeTarefas.model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.Tarefa;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author android
 */
public class TarefaComPrazo extends Tarefa{
    private LocalDate prazo;

    public TarefaComPrazo(LocalDate prazo, String descricao, int prioridade, LocalDate dataCriacao) {
        super(descricao, prioridade, dataCriacao);
        this.prazo = prazo;
    }
    
    public TarefaComPrazo() {
        
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
        final TarefaComPrazo other = (TarefaComPrazo) obj;
        return Objects.equals(this.prazo, other.prazo);
    }



    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.prazo);
        return hash;
    }
        
      @Override
    public String toString() {
        return super.toString() + "prazo=" + this.prazo + '}';
    }
    
    
    
    public LocalDate getPrazo() {
        return prazo;
    }

    public void setPrazo(LocalDate prazo) {
        this.prazo = prazo;
    }

    
    }


    
    
    

