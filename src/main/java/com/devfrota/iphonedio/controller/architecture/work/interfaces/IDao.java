package com.devfrota.iphonedio.controller.architecture.work.interfaces;

import com.devfrota.iphonedio.controller.architecture.model.pacbrowser.Bookmark;
import com.devfrota.iphonedio.controller.architecture.model.pacplayer.Media;
import com.devfrota.iphonedio.controller.architecture.model.pactelephone.Contact;

import java.util.List;

/**
 *
 * @author Tymba
 *
 */
public interface IDao{

    public List<Bookmark> getDataBookmarks();
    public List<Media> getDataPlaylist();
    public List<Contact> getDataContacts();
}
