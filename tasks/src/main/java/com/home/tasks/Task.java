package com.home.tasks;

import com.home.results.model.TaskResults;

import java.util.concurrent.Callable;

public interface Task extends Callable<TaskResults> {
      TaskResults call() throws Exception;
}
