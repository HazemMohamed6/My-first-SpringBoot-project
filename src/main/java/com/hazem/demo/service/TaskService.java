/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hazem.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hazem.demo.repository.TaskRepository;
import com.hazem.demo.model.Task;
/**
 *
 * @author METRO
 */
@Service
public class TaskService { 
    @Autowired
    private TaskRepository repo;  
    
//    public TaskService(TaskRepository taskRepository){
//        this.taskRepository=taskRepository;
//    }
    public void addTask(Task task){
        repo.getTasks().add(task);
    }
    public List<Task> getAll(){
        return repo.getTasks();
    }
    public void delete(int index){
        if(index >= repo.getTasks().size() )
            throw new RuntimeException("Task not found");
        repo.getTasks().remove(index);
    }
//    public void createTask(String title){
//        taskRepository.addTask(new Task(title));   
//    }
//    public void printTasks(){
//        taskRepository.getTasks()
//                .forEach(task -> System.out.println(task.getTitle()));
//    }
//    public void deleteTask(int index){
//        taskRepository.getTasks().remove(index);
//    }
//    public void updateTask(int index , String newTitle){
//        taskRepository.getTasks().set(index, new Task(newTitle));
//    }
}


