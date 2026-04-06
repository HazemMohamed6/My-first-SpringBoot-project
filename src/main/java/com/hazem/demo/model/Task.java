/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hazem.demo.model;
import jakarta.validation.constraints.NotBlank;
/**
 *
 * @author METRO
 */
public class Task {
    @NotBlank(message="Task title must not be empty") 
    private String title;
    
    public Task(){
        
    }
    public Task(String title){
        this.title=title;
    }
    
    public String getTitle(){
        return title;
    }
}


