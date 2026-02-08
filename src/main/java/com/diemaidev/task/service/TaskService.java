package com.diemaidev.task.service;

import com.diemaidev.task.domain.CreateTaskRequest;
import com.diemaidev.task.domain.entity.Task;

import java.util.List;

public interface TaskService {
    Task createTask(CreateTaskRequest request);
    List<Task> listTasks();
}
