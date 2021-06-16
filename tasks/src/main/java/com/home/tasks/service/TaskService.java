package com.home.tasks.service;

import com.home.results.model.TaskResults;
import com.home.tasks.Task;
import com.home.tasks.annotation.Case;
import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class TaskService {

    public List<CompletableFuture<TaskResults>> runTasks() {
        Reflections reflections = new Reflections("com.home.tasks");
        Set<Class<?>> annotated = reflections.getTypesAnnotatedWith(Case.class);
        List<CompletableFuture<TaskResults>> tasks = new ArrayList<>();
        for (Class<?> aClass : annotated) {
            try {
                tasks.add(CompletableFuture.supplyAsync(new TaskSupplier((Task) aClass.getDeclaredConstructor().newInstance())));
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {

            }
        }
        return tasks;
    }

    private class TaskSupplier implements Supplier<TaskResults> {

        private final Task task;

        private TaskSupplier(Task task) {
            this.task = task;
        }

        @Override
        public TaskResults get() {
            try {
                return task.call();
            } catch (Exception e) {
                //TODO create failed TaskResults
                return new TaskResults();
            }
        }
    }

}
