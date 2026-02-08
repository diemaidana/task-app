package com.diemaidev.task.mapper;

import com.diemaidev.task.domain.CreateTaskRequest;
import com.diemaidev.task.domain.dto.CreateTaskRequestDto;
import com.diemaidev.task.domain.dto.TaskDto;
import com.diemaidev.task.domain.entity.Task;

public interface TaskMapper {
    CreateTaskRequest fromDto(CreateTaskRequestDto request);

    TaskDto toDto(Task task);
}
