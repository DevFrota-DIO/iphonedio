package com.devfrota.iphonedio.controller.architecture.model.pacbrowser;

import com.devfrota.iphonedio.controller.architecture.services.ServiceData;
import com.devfrota.iphonedio.controller.architecture.work.interfaces.IBrowser;
import lombok.Getter;
import java.util.List;

@Getter
public class Bookmarks implements IBrowser {

    private List<Bookmark> bookmarkList;
    private final ServiceData newData = new ServiceData();


    public Bookmarks() {
        setBookmarkList(newData.getDataBookmarks());
    }

    private void setBookmarkList(List<Bookmark> bookmarkList) {
        this.bookmarkList = bookmarkList;
    }

}
