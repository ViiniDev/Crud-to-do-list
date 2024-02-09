package com.desafio.todolist.todolist.controller;

import com.desafio.todolist.todolist.entity.Todo;
import com.desafio.todolist.todolist.service.TodoServive;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("/todos")
public class TodoController {
    private TodoServive todoServive;
    @PostMapping
    List<Todo> create(@RequestBody Todo todo){
        return todoServive.create(todo);
    }
    @GetMapping
    List<Todo> list(){
        return todoServive.list();
    }
    @PutMapping
    List<Todo> update(@RequestBody Todo todo){
        return todoServive.update(todo);
    }
    @DeleteMapping("{id}")

    List<Todo> delete(@PathVariable("id") Long id){
        return todoServive.delete(id);
    }
}
