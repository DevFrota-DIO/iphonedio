package view.view_model.pacplayer;


import com.devfrota.iphonedio.controller.Controller;
import com.devfrota.iphonedio.controller.architecture.model.pacplayer.Media;
import lombok.*;

import java.util.List;

@Getter
public class DevPlaylist {
    private final List<Media> mediaList;

    public DevPlaylist() {
        Controller controller = new Controller();
        this.mediaList = controller.playList();
    }

    public void addMedia(Media media) {
        mediaList.add(media);
    }

}

