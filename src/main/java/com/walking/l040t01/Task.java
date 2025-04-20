package com.walking.l040t01;

public class Task {
    private String name;
    public Complexity complexity;
    private Status status = Status.NOT_COMPLETED;

    public enum Status {
        DONE, NOT_COMPLETED;
    }

    public String getName() {
        return name;
    }

    public void setStatus(String status) {
        this.status = Status.valueOf(status);
    }

    public Status getStatus() {
        return status;
    }

    public Task(String name, Complexity complexity) {
        this.name = name;
        this.complexity = complexity;
    }
}
