package com.devfrota.iphonedio.controller.architecture.services;

import com.devfrota.iphonedio.controller.architecture.model.pacbrowser.Bookmark;
import com.devfrota.iphonedio.controller.architecture.model.paciphone.Iphone;
import com.devfrota.iphonedio.controller.architecture.model.pacplayer.Media;
import com.devfrota.iphonedio.controller.architecture.model.pactelephone.Contact;
import lombok.Getter;

import java.util.List;

@Getter
public class ServiceApp {
    private final Iphone newIphone;

    public ServiceApp() {
        newIphone = new Iphone();

    }

    public void print() {
        //phone().print();
    }

    public List<Media> getPlaylist() {
        return newIphone.getPlayList();
    }

    public List<Bookmark> getBookmarks() {
        return newIphone.getBookmarkList();
    }

    public List<Contact> getContactless() {
        return newIphone.getContactList();
    }
}
