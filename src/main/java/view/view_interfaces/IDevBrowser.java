package view.view_interfaces;


import com.devfrota.iphonedio.controller.architecture.model.pacbrowser.Bookmark;
import com.devfrota.iphonedio.controller.architecture.model.pacbrowser.Page;

import java.util.List;

public interface IDevBrowser {
        void loadPage(Page page);
        void updatePage(Page page);
        void newTab(int id, String url, String content);
        List<Bookmark> getDevListBookmarks();
}

