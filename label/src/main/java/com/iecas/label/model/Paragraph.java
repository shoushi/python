package com.iecas.label.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Paragraph {


    @Id
    Long id;
    String context;
    String type;
    List<Qa> qas;
    int state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Qa> getQas() {
        return qas;
    }

    public void setQas(List<Qa> qas) {
        this.qas = qas;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Paragraph{" +
                "id=" + id +
                ", context='" + context + '\'' +
                ", type='" + type + '\'' +
                ", qas=" + qas +
                ", state=" + state +
                '}';
    }
}
