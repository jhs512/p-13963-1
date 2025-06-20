package com.back.domain.wiseSaying.wiseSaying.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
public class WiseSaying {
    @Setter
    private int id;
    private String content;
    private String author;

    public WiseSaying(String content, String author) {
        this.content = content;
        this.author = author;
    }

    public void modify(String content, String author) {
        this.content = content;
        this.author = author;
    }

    public boolean isNew() {
        return id == 0;
    }
}
