package com.devfrota.iphonedio.controller.architecture.model.pacplayer;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Media {
    private int id;
    private String title;
    private String artist;
    private int duration;

    public Media(int id, String title, String artist, int duration) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return title +
                "\nArtist = '" + artist +
                "\nDuration = " + duration + "seconds";
    }
}

