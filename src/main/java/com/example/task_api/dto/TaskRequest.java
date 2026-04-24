package com.example.task_api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskRequest {

    private String title;

    public TaskRequest(String title) {
        this.title = title;
    }
    public TaskRequest() {
    }
}
