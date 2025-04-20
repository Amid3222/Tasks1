package com.walking.l040t01;

public class Main {
    public static void main(String[] args) {
        TaskStorage taskStorage = new TaskStorage();
        taskStorage.addTask("задолбать Стаса", Complexity.HARD);
        taskStorage.addTask("задолбать Стаса2", Complexity.HARD);
        taskStorage.addTask("задолбать Стаса3", Complexity.HARD);
        System.out.println("\n");
        System.out.println(taskStorage.getTasks());
        taskStorage.doTask();
        System.out.println("\n");
        System.out.println(taskStorage.getTasks());
    }
}
