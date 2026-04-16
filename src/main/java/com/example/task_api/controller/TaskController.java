package com.example.task_api.controller;

import com.example.task_api.model.Task;
import com.example.task_api.service.TaskService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Tasks", description = "")
@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @Operation(summary = "Retornar todas as tasks")
    @GetMapping
    public List<Task> getAll() {
        return service.findAll();
    }

    @Operation(summary = "Criar uma nova task")
    @PostMapping
    public Task create(@RequestBody Task task) {
        return service.create(task);
    }

    @Operation(summary = "Atualizar task de acordo com seu ID")
    @PutMapping("/{id}/done")
    public Task markDone(@PathVariable Long id) {
        return service.markDone(id);
    }

    @Operation(summary = "Deletar task de acordo com seu ID")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
