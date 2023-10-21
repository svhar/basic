package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Todo {

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    // Create a list of tasks.
    List<Task> tasks = new ArrayList<>();

    // Add some tasks to the list.
    tasks.add(new Task("shopping"));
    tasks.add(new Task("trip "));
    tasks.add(new Task("Write a report"));

    // Print the list of tasks.
    System.out.println("To-do list:");
    for (Task task : tasks) {
      System.out.println(task);
    }

    // Get the user's input for a new task.
    System.out.print("Enter a new task: ");
    String newTask = scanner.nextLine();

    // Add the new task to the list.
    tasks.add(new Task(newTask));

    // Print the updated list of tasks.
    System.out.println("To-do list:");
    for (Task task : tasks) {
      System.out.println(task);
    }
  }

}

class Task {

  private String name;

  public Task(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String toString() {
    return name;
  }

}