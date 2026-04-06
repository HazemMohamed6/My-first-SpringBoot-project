/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hazem.demo.controller;
import java.util.List;
import com.hazem.demo.model.Task;
import com.hazem.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
/**
 *
 * @author METRO
 */
@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired  
    private TaskService service;
    
    @GetMapping("/hello")
    public String hello(){
    return "Hello from Spring Boot";
    }

    @PostMapping
    public String add(@Valid @RequestBody Task task){
        service.addTask(task); 
        return "Task added";
    }
    @GetMapping
    public List<Task> getAll(){
        return service.getAll();
    }
    @DeleteMapping("/{index}")
    public String delete(@PathVariable int index){
        service.delete(index); 
        return "Deleted";
    }
}

