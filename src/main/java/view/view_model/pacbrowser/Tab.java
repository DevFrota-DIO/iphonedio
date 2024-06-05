package view.view_model.pacbrowser;

import lombok.*;

@Setter
@Getter
public class Tab {
    private int id;
    private String url;
    private String contentPage;

    public Tab(int id, String url, String contentPage) {
        this.id = id;
        this.url = url;
        this.contentPage = url + " Carregando... \n" + contentPage;
    }

    public Tab() {
    }

}

