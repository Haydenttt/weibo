package com.unicom.model;

import java.util.Date;

public class ConvergenceTopWordsCopy {
    private String word;
    private Integer num;
    public ConvergenceTopWordsCopy( String word, Integer num) {
        this.word = word;
        this.num = num;
    }

    public ConvergenceTopWordsCopy() {
        super();
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word == null ? null : word.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ConvergenceTopWordsCopy{" +
                "word='" + word + '\'' +
                ", num=" + num +
                '}';
    }
}