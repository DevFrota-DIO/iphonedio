package com.devfrota.iphonedio.controller.architecture.dao;

import com.devfrota.iphonedio.controller.architecture.model.pacbrowser.Bookmark;
import com.devfrota.iphonedio.controller.architecture.model.pacplayer.Media;
import com.devfrota.iphonedio.controller.architecture.model.pactelephone.Contact;
import com.devfrota.iphonedio.controller.architecture.data.DataBrowser;
import com.devfrota.iphonedio.controller.architecture.data.DataMusic;
import com.devfrota.iphonedio.controller.architecture.data.DataTelephone;
import com.devfrota.iphonedio.controller.architecture.work.interfaces.IDao;
import java.util.List;

public class DaoImplements implements IDao {
    DataMusic dataMusic;
    DataTelephone dataTelephone;
    DataBrowser dataBrowser;


    @Override
    public List<Bookmark> getDataBookmarks() {
        dataBrowser = new DataBrowser();
        return dataBrowser.getBookmarkList();
    }

    @Override
    public List<Media> getDataPlaylist() {
        dataMusic = new DataMusic();
        return dataMusic.getPlayList();
    }

    @Override
    public List<Contact> getDataContacts() {
        dataTelephone = new DataTelephone();
        return dataTelephone.getTelephoneList();
    }


}
