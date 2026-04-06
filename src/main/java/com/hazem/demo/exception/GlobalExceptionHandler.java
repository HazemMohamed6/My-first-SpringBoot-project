/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hazem.demo.exception;
import org.springframework.web.bind.annotation.*;
/**
 *
 * @author METRO
 */
@RestControllerAdvice 
public class GlobalExceptionHandler {
    @ExceptionHandler(RuntimeException.class) 
    public String handle(RuntimeException ex){
        return ex.getMessage();
    }
}
