package view.view_model.pacplayer;

import com.devfrota.iphonedio.controller.architecture.model.pacplayer.Media;
import view.view_principal.View;

import java.util.List;

public class DevPlayerAction {
    private final DevPlaylist devPlaylist;

    public DevPlayerAction() {
        this.devPlaylist = new DevPlaylist();
    }

    public void playPlaylist(Media media) {
        selectMusic(media.getId());

    }
    public void play() {

    }
    public void pause() {
        System.out.println("Música pausada...");
    }

    public void selectMusic(int id) {
        View view = new View();
        view.printMedia(devPlaylist.getMediaList().get(id - 1));
    }


    public List<Media> getMediaList() {
        return devPlaylist.getMediaList();
    }
}

