/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hazem.demo.repository;
import java.util.ArrayList;
import java.util.List;
import com.hazem.demo.model.Task;
import org.springframework.stereotype.Repository;
/**
 *
 * @author METRO
 */
@Repository 
public class TaskRepository {
    private List<Task> tasks=new ArrayList<>();
    
//    public void addTask(Task task){
//        tasks.add(task);
//    }
    
    public List<Task> getTasks(){
        return tasks;
    }
}

