package com.diemaidev.task.mapper;

import com.diemaidev.task.domain.CreateTaskRequest;
import com.diemaidev.task.domain.UpdateTaskRequest;
import com.diemaidev.task.domain.dto.CreateTaskRequestDto;
import com.diemaidev.task.domain.dto.TaskDto;
import com.diemaidev.task.domain.dto.UpdateTaskRequestDto;
import com.diemaidev.task.domain.entity.Task;

public interface TaskMapper {
    CreateTaskRequest fromDto(CreateTaskRequestDto dto);

    UpdateTaskRequest fromDto(UpdateTaskRequestDto dto);

    TaskDto toDto(Task task);
}
