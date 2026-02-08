package com.diemaidev.task.mapper.impl;

import com.diemaidev.task.domain.CreateTaskRequest;
import com.diemaidev.task.domain.dto.CreateTaskRequestDto;
import com.diemaidev.task.domain.dto.TaskDto;
import com.diemaidev.task.domain.entity.Task;
import com.diemaidev.task.mapper.TaskMapper;
import org.springframework.stereotype.Component;

@Component
public class TaskMapperImpl implements TaskMapper {

    @Override
    public CreateTaskRequest fromDto(CreateTaskRequestDto request) {
        return new CreateTaskRequest(
                request.title(),
                request.description(),
                request.dueDate(),
                request.priority()
        );
    }

    @Override
    public TaskDto toDto(Task task) {
        return new TaskDto(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getDueDate(),
                task.getPriority(),
                task.getStatus()
        );
    }
}
