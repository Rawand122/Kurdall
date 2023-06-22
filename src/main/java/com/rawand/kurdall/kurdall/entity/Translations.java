package com.rawand.kurdall.kurdall.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Translations {
    @Id
    @GeneratedValue
    private Long id;
    private String initial;
    private String result;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Translations(Long id, String initial, String result) {
        this.id = id;
        this.initial = initial;
        this.result = result;
    }
}