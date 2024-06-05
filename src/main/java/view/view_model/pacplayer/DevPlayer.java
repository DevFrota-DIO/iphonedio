package view.view_model.pacplayer;

import com.devfrota.iphonedio.controller.architecture.model.pacplayer.Media;
import view.view_interfaces.IDevPlayer;

import java.util.List;

public class DevPlayer implements IDevPlayer {
    private final DevPlayerAction devPlayerAction;

    public DevPlayer() {
        this.devPlayerAction = new DevPlayerAction();
    }

    @Override
    public void play() {
        devPlayerAction.play();
    }

    @Override
    public void playPlaylist(Media media) {
        devPlayerAction.playPlaylist(media);
    }

    @Override
    public void pause() {
        devPlayerAction.pause();
    }

    @Override
    public void selectMusic(int id) {
        devPlayerAction.selectMusic(id);
    }

    @Override
    public List<Media> getPlaylist(){
        return devPlayerAction.getMediaList();
    }

}


