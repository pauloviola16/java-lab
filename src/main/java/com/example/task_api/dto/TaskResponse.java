package com.example.task_api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskResponse {

    private Long id;
    private String title;
    private boolean done;

    public TaskResponse(String title) {
        this.title = title;
    }
    public TaskResponse(){
    }

}
