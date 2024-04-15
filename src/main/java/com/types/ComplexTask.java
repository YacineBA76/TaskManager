package com.types;

public class ComplexTask implements Task {
           private String description;
           private List<Task> subtasks;
           private int progress;
           private Priority priority;
           private Duration duration;
           private Date endDate;

           public ComplexTask(String description, List<Task> subtasks, int progress, Priority priority, Duration duration, Date endDate) {
               this.description = description;
               this.subtasks = subtasks;
               this.progress = progress;
               this.priority = priority;
               this.duration = duration;
               this.endDate = endDate;
           }

           public String getDescription() {
               return description;
           }

           public void setDescription(String description) {
               this.description = description;
           }

           public List<Task> getSubtasks() {
               return subtasks;
           }

           public void setSubtasks(List<Task> subtasks) {
               this.subtasks = subtasks;
           }

           public int getProgress() {
               return progress;
           }

           public void setProgress(int progress) {
               this.progress = progress;
           }

           public Priority getPriority() {
               return priority;
           }

           public void setPriority(Priority priority) {
               this.priority = priority;
           }

           public Duration getDuration() {
               return duration;
           }

           public void setDuration(Duration duration) {
               this.duration = duration;
           }

           public Date getEndDate() {
               return endDate;
           }

           public void setEndDate(Date endDate) {
               this.endDate = endDate;
           }

           public int calculeProg() {
               // Implémentation
               return 0;
           }

           public boolean isCompleted() {
               // Implémentation
               return false;
           }

           public void markCompleted() {
               // Implémentation
           }

           public void addSubtask(Task task) {
               // Implémentation
           }

           public void deleteSubtask(Task task) {
               // Implémentation
           }
       }