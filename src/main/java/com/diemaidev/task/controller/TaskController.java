package com.diemaidev.task.controller;

import com.diemaidev.task.domain.CreateTaskRequest;
import com.diemaidev.task.domain.dto.CreateTaskRequestDto;
import com.diemaidev.task.domain.dto.TaskDto;
import com.diemaidev.task.domain.entity.Task;
import com.diemaidev.task.mapper.TaskMapper;
import com.diemaidev.task.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/tasks")
public class TaskController {

    private final TaskService taskService;
    private final TaskMapper taskMapper;

    public TaskController(TaskService taskService, TaskMapper taskMapper) {
        this.taskService = taskService;
        this.taskMapper = taskMapper;
    }

    @PostMapping
    public ResponseEntity<TaskDto> createTask(@Valid @RequestBody CreateTaskRequestDto  createTaskRequestDto) {
        CreateTaskRequest createTaskRequest = taskMapper.fromDto(createTaskRequestDto);
        Task task = taskService.createTask(createTaskRequest);
        TaskDto taskDto = taskMapper.toDto(task);
        return new ResponseEntity<>(taskDto, HttpStatus.CREATED);
    }
}
