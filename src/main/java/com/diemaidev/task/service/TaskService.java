package com.diemaidev.task.service;

import com.diemaidev.task.domain.CreateTaskRequest;
import com.diemaidev.task.domain.UpdateTaskRequest;
import com.diemaidev.task.domain.entity.Task;

import java.util.List;
import java.util.UUID;

public interface TaskService {
    Task createTask(CreateTaskRequest request);
    List<Task> listTasks();
    Task updateTask(UUID taskId, UpdateTaskRequest request);
}
