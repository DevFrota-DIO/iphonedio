package com.devfrota.iphonedio.controller.architecture.model.pacplayer;

import com.devfrota.iphonedio.controller.architecture.services.ServiceData;
import com.devfrota.iphonedio.controller.architecture.work.interfaces.IPlayer;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Playlist implements IPlayer {
    private List<Media> playList;


    public Playlist() {
        ServiceData newData = new ServiceData();
        this.playList = new ArrayList<>();
        setPlayList(newData.getDataPlaylist());

    }
    public void addMedia(Media media) {
        playList.add(media);
    }

}

