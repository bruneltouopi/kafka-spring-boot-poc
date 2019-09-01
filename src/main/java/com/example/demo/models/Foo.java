package com.example.demo.models;

import java.io.Serializable;

/**
 * Created by fabrice on 9/1/19.
 */
public class Foo implements Serializable{
    private String name;

    public Foo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Foo{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
