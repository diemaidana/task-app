package com.diemaidev.task.domain;

import com.diemaidev.task.domain.entity.TaskPriority;
import com.diemaidev.task.domain.entity.TaskStatus;

import java.time.LocalDate;

public record UpdateTaskRequest(
        String title,
        String description,
        LocalDate dueDate,
        TaskPriority priority,
        TaskStatus status
) {
}
