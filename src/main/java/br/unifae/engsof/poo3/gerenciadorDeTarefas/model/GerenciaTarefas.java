/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unifae.engsof.poo3.gerenciadorDeTarefas.model;

import java.util.List;
import java.util.ArrayList;




/**
 *
 * @author android
 */
public class GerenciaTarefas {
    private List<Tarefa> t = new ArrayList<Tarefa>();

    public boolean addTask(Tarefa tarefa){
        if(!t.contains(tarefa)) return false;
        
        return t.add(tarefa);
    } 
    
    public boolean remove(Tarefa tarefa){
        if(!t.contains(tarefa)) return false;
        
        return t.remove(tarefa);
    }
    
    public List<Tarefa> show(){
        if(!t.isEmpty())return this.t;
        
        return (List<Tarefa>) t.get(0);

    }
}
