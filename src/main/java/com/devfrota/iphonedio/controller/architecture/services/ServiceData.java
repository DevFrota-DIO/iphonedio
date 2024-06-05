package com.devfrota.iphonedio.controller.architecture.services;

import com.devfrota.iphonedio.controller.architecture.dao.DaoImplements;
import com.devfrota.iphonedio.controller.architecture.model.pacbrowser.Bookmark;
import com.devfrota.iphonedio.controller.architecture.model.pacplayer.Media;
import com.devfrota.iphonedio.controller.architecture.model.pactelephone.Contact;
import com.devfrota.iphonedio.controller.architecture.work.interfaces.IDao;

import java.util.List;

/**
 *
 * @author Tymba
 */
public class ServiceData {
    private final IDao obtainData = new DaoImplements();


    public List<Bookmark> getDataBookmarks() {
        return obtainData.getDataBookmarks();
    }

    public List<Media> getDataPlaylist() {
        return obtainData.getDataPlaylist();
    }

    public List<Contact> getDataContacts() {
        return obtainData.getDataContacts();
    }



}
