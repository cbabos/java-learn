package com.todo.csb.todo;

import com.todo.csb.todo.data.entity.Todo;
import com.todo.csb.todo.data.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@RestController
public class TodoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @RestController
    @RequestMapping("/todos")
    public class TodoController {
        @Autowired
        private TodoRepository todoRepository;

        @GetMapping
        public Iterable<Todo> getTodos() {
            return this.todoRepository.findAll();
        }

        @GetMapping("/add")
        public void AddTodoItem(@RequestParam(value = "description", defaultValue = "New Task") String description) {
            Todo newTodo = new Todo();
            newTodo.setDescription(description);
            newTodo.setCreated(GetTimestamp());
            todoRepository.save(newTodo);
        }

        private String GetTimestamp() {
            Date date = new Date();
            Timestamp ts = new Timestamp(date.getTime());
            return ts.toString();
        }
    }
}
