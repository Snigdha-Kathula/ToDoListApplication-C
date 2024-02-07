package org.example.todolistappl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    private  List<String> tasks;
    public Application() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter Title of Task : ");
        String taskName = scanner.nextLine();
        tasks.add(taskName);
        System.out.println("Task has Added Successfully");

    }
    public void updateTask(){
        Scanner scanner = new Scanner(System.in);
        if (tasks.isEmpty()){
            System.out.println("N0 Tasks present in the ToDoApplication");
            return;
        }
        System.out.println("Please Enter Task Number to Update: ");
        int taskNumber = Integer.parseInt(String.valueOf(scanner.nextInt()));
        if(taskNumber > tasks.size() || taskNumber < 1){
            System.out.println("Entered Task Number is Invalid");
            return;
        }
        scanner = new Scanner(System.in);
        System.out.println("Please Enter Updated Title of Task : ");
        String taskName = scanner.nextLine();
        tasks.set(taskNumber-1, taskName);
        System.out.println("Task has Updated Successfully");
    }
    public void removeTask() {
        Scanner scanner = new Scanner(System.in);
        if (tasks.isEmpty()){
            System.out.println("N0 Tasks present in the ToDoApplication");
            return;
        }
        System.out.println("Please Enter Task Number to Remove/Delete: ");
        int taskNumber = scanner.nextInt();
        if(taskNumber > tasks.size() || taskNumber < 1){
            System.out.print("Entered Task Number is Invalid.");
            return;
        }
        tasks.remove(taskNumber-1);
        System.out.println("Task has Removed/Deleted Successfully");
    }
    public void showAllTasks(){

        if(tasks.isEmpty()){
            System.out.println("No Tasks Added");
        }else{
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
    public void display(){
        System.out.println("TODO LIST MENU:");
        System.out.println("1. Add Task");
        System.out.println("2. Edit Task");
        System.out.println("3. Delete Task");
        System.out.println("4. View Tasks");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }
    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean running =true;
        display();
        while(running){
            int n = Integer.parseInt(String.valueOf(scanner.nextInt()));
            switch (n) {
                case 1:
                    addTask();
                    break;
                case 2:
                    updateTask();
                    break;
                case 3:
                    removeTask();
                    break;
                case 4:
                    showAllTasks();
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting.....");
                default:
                    System.out.println("Invalid Input : Please Give Valid Input.");
            }
        }
    }

}
