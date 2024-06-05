package com.devfrota.iphonedio.controller.architecture.model.pacbrowser;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Bookmark {
    private int id;
    private Page page;

    public Bookmark() {
    }

    public Bookmark(int id, Page page) {
        this.id = id;
        this.page = page;
    }

}
