package com.editor;

import com.types.Task;

public interface TaskEditor {
    void addTask(Task task);
    void removeTask(Task task);
    void modifyTask(Task task);
    void saveToFile();
    void loadFromFile();
}