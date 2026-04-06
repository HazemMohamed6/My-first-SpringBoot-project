/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hazem.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 *
 * @author METRO
 */
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
// ---- For Console Code ----
//public class main {
//    public static void main(String[] args) {
//        ApplicationContext context=
//                new AnnotationConfigApplicationContext(AppConfig.class);
//        
//        TaskService taskService = context.getBean(TaskService.class);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("\n1. Add Task");
//        System.out.println("2. View Tasks");
//        System.out.println("3. Delete Task");
//        System.out.println("4. Update Task");
//        System.out.println("5. Exit");
//        
//        int choice = sc.nextInt();
//        sc.nextLine();
//        
//        switch (choice){
//            case 1:
//                System.out.print("Enter task: ");
//                String title = sc.nextLine();
//                taskService.createTask(title);
//                break;
//                
//            case 2:
//                taskService.printTasks();
//                break;
//                
//            case 3:
//                System.out.print("Enter index: ");
//                int index = sc.nextInt();
//                taskService.deleteTask(index);
//                break;
//                
//            case 4:
//                System.out.print("Enter index: ");
//                int i = sc.nextInt();
//                sc.nextLine();
//                System.out.print("Enter new title: ");
//                String newTitle = sc.nextLine();
//                taskService.updateTask(i, newTitle);
//                break;
//                
//            case 5:
//                System.exit(0);
//        }
//    }
//}


