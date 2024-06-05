package view.view_model.pacbrowser;

import com.devfrota.iphonedio.controller.Controller;
import com.devfrota.iphonedio.controller.architecture.model.pacbrowser.Bookmark;
import com.devfrota.iphonedio.controller.architecture.model.pacbrowser.Page;
import view.view_interfaces.IDevBrowser;
import java.util.ArrayList;
import java.util.List;
import lombok.*;


@Setter
@Getter
public class DevBrowser implements IDevBrowser {
    private DevBookmarks devBookmarks;
    private Page page;
    private Tab tab;

    public DevBrowser() {
        Controller controller = new Controller();
        List<Bookmark> list = new ArrayList<>();
        this.devBookmarks = new DevBookmarks(controller.bookmarkList());
    }

    @Override
    public void loadPage(Page page) {
        System.out.println("Carregando a página...");
        System.out.println(page.getTitle() + " ► " + page.getUrl());


    }

    @Override
    public void updatePage(Page page) {
        System.out.println("Atualizando a página...");
        System.out.println(page.getTitle() + " ► " + page.getUrl());

    }

    @Override
    public void newTab(int id, String url, String content) {
        System.out.println("Abrindo nova aba... - " + url);
        System.out.println(content);

    }

    @Override
    public List<Bookmark> getDevListBookmarks() {
        return getDevBookmarks().getListBookmarks();
    }

}

