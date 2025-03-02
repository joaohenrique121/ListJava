/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unifae.engsof.poo3.gerenciadorDeTarefas.Controller;

import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.TarefaComPrazo;
import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.GerenciaTarefas;
import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.Tarefa;
import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.TarefaSimples;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author android
 */
public class Controller {
    public boolean saveTarefa(String descricao, int prioridade, LocalDate data, LocalDate prazo){
        if(prazo == null){
            GerenciaTarefas.addTask(new TarefaSimples(descricao,  prioridade, data));
            return true;
        }else{
            GerenciaTarefas.addTask(new TarefaComPrazo(prazo, descricao,  prioridade, data));
            return true;
        }
    }
    
    public List<Tarefa> showList(){
        List Tarefas = GerenciaTarefas.show();
        return Tarefas;
    }
    
     
}
