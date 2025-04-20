package com.walking.l040t01;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

public class TaskStorage {
    private Queue<Task> tasks = new ArrayDeque<>();

    public Queue<Task> getTasks() {
        return tasks;
    }

    public void addTask(String name, Complexity complexity) {
        if (tasks.offer(new Task(name, complexity))) {
            System.out.printf("\n Задание \"%s\" добавлено", name);
        }
    }

    public void doTask() {
        Task task;
        Queue<Integer> s = new ArrayDeque<>();
        
        if ((task = tasks.poll()) != null) System.out.printf("Задание \"%s\" выполнено", task.getName());
    }

}
