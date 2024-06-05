package com.devfrota.iphonedio.controller.architecture.model.pacbrowser;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Page {
    private int id;
    private String url;
    private String title;

    public Page(int id, String url, String title) {
        this.id = id;
        this.url = url;
        this.title = title;
    }
    public Page() {

    }

}

