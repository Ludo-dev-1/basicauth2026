package co.simplon.basicauth.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.basicauth.entity.TodoEntity;
import co.simplon.basicauth.repository.TodoRepository;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepositoryInjected) {
        this.todoRepository = todoRepositoryInjected;
    }

    @GetMapping("")
    public List<TodoEntity> getAll() {
        return this.todoRepository.findAll();
    }

    @PostMapping("")
    public TodoEntity create(@RequestBody TodoEntity entity) {
        return this.todoRepository.save(entity);
    }
}
