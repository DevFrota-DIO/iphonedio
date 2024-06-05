package view.view_model.pacbrowser;

import com.devfrota.iphonedio.controller.architecture.model.pacbrowser.Bookmark;
import lombok.Getter;

import java.util.List;


@Getter
public class DevBookmarks {
    private final List<Bookmark> listBookmarks;

    public DevBookmarks(List<Bookmark> listBookmarks) {
        this.listBookmarks = listBookmarks;
    }

}
