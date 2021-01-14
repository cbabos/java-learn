package com.todo.csb.todo.data.entity;

import javax.persistence.*;

@Entity
@Table(name="todos")
public class Todo {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="description")
    private String description;
    @Column(name="created")
    private String created;

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    @Column(name="completed")
    private byte completed;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte getCompleted() {
        return completed;
    }

    public void setCompleted(byte completed) {
        this.completed = completed;
    }
}
