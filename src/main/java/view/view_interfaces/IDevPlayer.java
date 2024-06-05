package view.view_interfaces;


import com.devfrota.iphonedio.controller.architecture.model.pacplayer.Media;

import java.util.List;

public interface IDevPlayer {

    void play();

    void playPlaylist(Media media);


    void pause();

    void selectMusic(int id);

    List<Media> getPlaylist();
}

