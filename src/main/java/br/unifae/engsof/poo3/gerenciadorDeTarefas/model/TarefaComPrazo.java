package br.unifae.engsof.poo3.gerenciadorDeTarefas.model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.Tarefa;
import java.time.LocalDate;

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
        if(super.equals(obj)){
            if(this.prazo.equals(((TarefaComPrazo)obj).prazo))
                return true;
            }
            return false;
        };
        
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


    
    
    

