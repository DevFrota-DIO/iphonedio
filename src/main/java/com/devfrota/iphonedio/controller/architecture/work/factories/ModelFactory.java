package com.devfrota.iphonedio.controller.architecture.work.factories;

import com.devfrota.iphonedio.controller.architecture.model.pacbrowser.Bookmarks;
import com.devfrota.iphonedio.controller.architecture.model.paciphone.Iphone;
import com.devfrota.iphonedio.controller.architecture.model.pacplayer.Playlist;
import com.devfrota.iphonedio.controller.architecture.model.pactelephone.Contacts;

/**
 *
 * @author Dev Frota
 */
public class ModelFactory {

    public static Bookmarks newBook() {
        Bookmarks book = new Bookmarks();
        return book;
    }

    public static Playlist newPlayList() {
        Playlist list = new Playlist();
        return list;
    }

    public static Contacts newContacts() {
        Contacts list = new Contacts();
        return list;
    }

    public static Iphone newIphone() {
        Iphone app = new Iphone();
        return app;
    }
}
