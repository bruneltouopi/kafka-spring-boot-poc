package com.example.demo.models;

import java.io.Serializable;

/**
 * Created by fabrice on 9/1/19.
 */
public class Foo {

    private String name;
    private String description;

    public Foo() {
    }

    public Foo(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}