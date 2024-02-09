package com.desafio.todolist.todolist.repository;

import com.desafio.todolist.todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
