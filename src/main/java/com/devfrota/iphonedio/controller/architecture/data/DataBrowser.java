package com.devfrota.iphonedio.controller.architecture.data;


import java.util.ArrayList;
import java.util.List;
import com.devfrota.iphonedio.controller.architecture.model.pacbrowser.Bookmark;
import com.devfrota.iphonedio.controller.architecture.model.pacbrowser.Page;
import lombok.Getter;


public class DataBrowser {
    @Getter
    private List<Bookmark> bookmarkList;
    int id;
    String[] urls = {
            "https://www.example.com",
            "https://www.sample.org",
            "https://www.testsite.net",
            "https://www.website.com",
            "https://www.mysite.org",
            "https://www.onlineservice.net",
            "https://www.randompage.com",
            "https://www.placeholder.org",
            "https://www.testpage.net",
            "https://www.demowebsite.com"
    };

    String[] names = {
            "Example Site",
            "Sample Organization",
            "Test Site",
            "Website",
            "My Site",
            "Online Service",
            "Random Page",
            "Placeholder Organization",
            "Test Page",
            "Demo Website"
    };

    public DataBrowser() {
        this.bookmarkList = new ArrayList<>();
        setBookmarkList();
    }

    void setBookmarkList(){
        int id;
        for (int i = 0; i < names.length; i++) {
            id = i + 1;
            bookmarkList.add(new Bookmark(id, new Page(id, urls[i],names[i])));
        }
    }


}
