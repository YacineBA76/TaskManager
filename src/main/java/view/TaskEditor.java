package view;

import models.Task;

public interface TaskEditor {
    void addTask(Task task);
    void removeTask(Task task);
    void modifyTask(Task task);
    void saveToFile();
    void loadFromFile();
}