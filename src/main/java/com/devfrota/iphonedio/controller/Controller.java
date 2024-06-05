package com.devfrota.iphonedio.controller;

import com.devfrota.iphonedio.controller.architecture.model.pacbrowser.Bookmark;
import com.devfrota.iphonedio.controller.architecture.model.pacplayer.Media;
import com.devfrota.iphonedio.controller.architecture.model.pactelephone.Contact;
import com.devfrota.iphonedio.controller.architecture.services.ServiceApp;
import java.util.List;

/**
 *
 * @author Dev Frota
 * 
 * 
 */
public class Controller{
    private final ServiceApp serviceApp = new ServiceApp();

    public List<Media> playList(){
        return serviceApp.getPlaylist();
    }
    public List<Bookmark> bookmarkList(){
        return serviceApp.getBookmarks();
    }
    public List<Contact> contactList(){
        return serviceApp.getContactless();
    }

}
