package com.example.task_api.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ErrorMessage {

    private int status;
    private String message;
    private LocalDateTime timestamp;

    public ErrorMessage(int status, String message, LocalDateTime timestamp) {
        this.status = status;
        this.message = message;
        this.timestamp = timestamp;
    }
}
