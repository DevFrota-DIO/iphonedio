package com.devfrota.iphonedio.controller.architecture.model.paciphone;

import com.devfrota.iphonedio.controller.architecture.model.pacbrowser.Bookmark;
import com.devfrota.iphonedio.controller.architecture.model.pacbrowser.Bookmarks;
import com.devfrota.iphonedio.controller.architecture.model.pacplayer.Media;
import com.devfrota.iphonedio.controller.architecture.model.pacplayer.Playlist;
import com.devfrota.iphonedio.controller.architecture.model.pactelephone.Contact;
import com.devfrota.iphonedio.controller.architecture.model.pactelephone.Contacts;
import com.devfrota.iphonedio.controller.architecture.work.interfaces.IBrowser;
import com.devfrota.iphonedio.controller.architecture.work.interfaces.IPlayer;
import com.devfrota.iphonedio.controller.architecture.work.interfaces.ITelephone;

import java.util.List;


public class Iphone {

    private final IPlayer iplayer;
    private final IBrowser ibrowser;
    private final ITelephone iphone;


    public Iphone() {
        this.iplayer = new Playlist();
        this.ibrowser = new Bookmarks();
        this.iphone = new Contacts();
    }

    public List<Bookmark> getBookmarkList() {
        return ibrowser.getBookmarkList();
    }

    public List<Media> getPlayList() {
        return iplayer.getPlayList();
    }

    public List<Contact> getContactList() {
        return iphone.getContactList();
    }
}
