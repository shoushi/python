package com.iecas.label.model;

import org.springframework.data.annotation.Id;

public class Qa {
    @Id
    Long id;
    String question;
    String answer;
    int answer_start;
    String type;
    Long user_id;

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getAnswer_start() {
        return answer_start;
    }

    public void setAnswer_start(int answer_start) {
        this.answer_start = answer_start;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "qa{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", answer_start=" + answer_start +
                ", type='" + type + '\'' +
                '}';
    }
}
