package com.example.demo;

import java.util.ArrayList;

public class task {
    String name;
    ArrayList<String> task;
    int taskCount;
    ArrayList<Boolean> status;
    ArrayList<String> description;

    public task(String name) {
        this.name = name;
        this.taskCount = 0;
    }

    public ArrayList<String> getTask() {
        return task;
    }

    public ArrayList<String> getDescription() {
        return description;
    }

    public void addTask(String name, String desc){
        task.add(name);
        description.add(desc);
        this.taskCount++;
    }
}
