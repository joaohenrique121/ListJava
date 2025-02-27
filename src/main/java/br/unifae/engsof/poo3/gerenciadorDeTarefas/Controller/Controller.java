/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unifae.engsof.poo3.gerenciadorDeTarefas.Controller;

import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.GerenciaTarefas;
import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.TarefaSimples;
import java.time.LocalDate;

/**
 *
 * @author android
 */
public class Controller {
    public boolean saveTarefa(String descricao, int prioridade, LocalDate data){
        GerenciaTarefas.addTask(new TarefaSimples(descricao,  prioridade, data));
        return true;
    }
    
     
}
