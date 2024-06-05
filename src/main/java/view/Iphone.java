package view;


import com.devfrota.iphonedio.controller.architecture.model.pacbrowser.Bookmark;
import com.devfrota.iphonedio.controller.architecture.model.pacbrowser.Page;
import com.devfrota.iphonedio.controller.architecture.model.pacplayer.Media;
import com.devfrota.iphonedio.controller.architecture.model.pactelephone.Contact;
import view.view_interfaces.IDevBrowser;
import view.view_interfaces.IDevPlayer;
import view.view_interfaces.IDevTelephone;
import view.view_model.pacbrowser.DevBrowser;
import view.view_model.pacplayer.DevPlayer;
import view.view_model.pactelephone.DevTelephone;

import java.util.List;

public class Iphone {

    private final IDevPlayer iplayer;
    private final IDevBrowser ibrowser;
    private final IDevTelephone itelephone;

    public Iphone() {
        this.iplayer = new DevPlayer();
        this.ibrowser = new DevBrowser();
        this.itelephone = new DevTelephone();
    }


    public void loadPage(Page page) {

        ibrowser.loadPage(page);
    }

    public void updatePage(Page page) {
        ibrowser.updatePage(page);
    }

    public void newTab(int id, String url, String content) {
        ibrowser.newTab(id,url,content);
    }

    public List<Bookmark> getDevListBookmarks() {
        return ibrowser.getDevListBookmarks();
    }

    public void play() {
        iplayer.play();
    }

    public void pause() {
        iplayer.pause();
    }

    public void selectMusic(int id) {
        iplayer.selectMusic(id);
    }

    public List<Media> getPlaylist() {
        return iplayer.getPlaylist();
    }

    public void makeCall(Contact contact) {
        itelephone.makeCall(contact);
    }

    public void answerCall(String number) {
        itelephone.answerCall(number);
    }

    public void voiceMail() {
        itelephone.voiceMail();
    }

    public List<Contact> getContacts() {
        return itelephone.getContacts();
    }


    public void playPlaylist(Media media) {
        iplayer.playPlaylist(media);
    }
}
