package view.view_principal;

import com.devfrota.iphonedio.controller.architecture.model.pacbrowser.Bookmark;
import com.devfrota.iphonedio.controller.architecture.model.pacplayer.Media;
import com.devfrota.iphonedio.controller.architecture.model.pactelephone.Contact;
import view.view_config.DevConfigLanguage;
import view.view_config.DevConfigView;
import view.Iphone;
import lombok.Getter;

import java.util.*;

import static com.devfrota.iphonedio.controller.architecture.work.factories.ServiceFactory.sView;

@Getter
public class View {
    private final Iphone iphone = new Iphone();
    private DevConfigView configView;
    private DevConfigLanguage newLang;

    public View() {
    }

    public String searchMessages(String str) {
        configView = sView();
        Properties props = configView.searchStrings(this.newLang.getActiveLanguage());
        return props.getProperty(str);
    }

    public void print(String str, DevConfigLanguage newLang) {
        this.newLang = newLang;
        System.out.println(searchMessages(str));
    }

    public void printListMedia(List<Media> mediaList) {
        for (Media media : mediaList) {
            System.out.println(media.getId() + " - " + media.getTitle() + "-> " + media.getArtist());
        }
    }

    public void printListContacts(List<Contact> contactList) {
        for (Contact contact : contactList) {
            System.out.println(contact.getId() + " - " + contact.getName() + "-> " + contact.getPhoneNumber());
        }
    }

    public void printListBookmarks(List<Bookmark> bookmarkList) {
        for (Bookmark bookmark : bookmarkList) {
            System.out.println(bookmark.getId() + " - " + bookmark.getPage().getTitle() + "-> " + bookmark.getPage().getUrl());
        }
    }

    public void printMedia(Media media) {
        System.out.println("Executando a mídia...");
        System.out.println(media.toString());
    }

    public void printMakeCall(Contact contact) {
        System.out.println("Ligando para ♪");
        System.out.println(contact.toString());
    }

    public void printMenssage(String number) {
        System.out.println("Ligando para - " + number);
    }

    public void printVoiceMail() {
        System.out.println("Enviando um correio de voz... ☺");
    }

    public void printList(String value) {

        switch (value) {
            case ("Contacts"):
                printListContacts(iphone.getContacts());
                iphone.makeCall(iphone.getContacts().get(caseScan()));
                break;
            case ("Bookmarks"):
                printListBookmarks(iphone.getDevListBookmarks());
                iphone.loadPage(iphone.getDevListBookmarks().get(caseScan()).getPage());
                break;
            case ("PlayList"):
                printListMedia(iphone.getPlaylist());
                iphone.playPlaylist(iphone.getPlaylist().get(caseScan()));
                break;
            default:
                throw new IllegalStateException("Valor inexistente: " + value);
        }
        iphoneContinue();

    }

    private int caseScan() {
        Scanner scan = new Scanner(System.in);
        int opt = scan.nextInt() - 1;
            while(opt < 0 || opt > 9){
                System.out.println("----- Opção não encontrada -----");
                System.out.println("--- Digite uma opção válida ----");
                opt = scan.nextInt() - 1;
            }
        return opt;
    }

    public void iphoneContinue() {
        Scanner scan = new Scanner(System.in);
        System.out.println("------------------------------------------------------------");
        System.out.println("Digite ENTER para continuar");
        String key = scan.nextLine();
        System.out.println("----- C O N T I N U A N D O -----");

    }

    public void printAcction(String key, String value, String cache) {
        if(cache.equals("player")){
            if(key.equals("1"))printList("PlayList");
            else {
                iphone.pause();
                iphoneContinue();
            }
        }else if (cache.equals("phone")){
            if (key.equals("1"))printList("Contacts");
            else {
                iphone.answerCall("(92) 99999-3333");
                iphoneContinue();
            }
        } else if (cache.equals("browser")) {
            if (key.equals("1"))printList("Bookmarks");
            else {
                iphone.newTab(1, "http://content.com", "Conteúdo da nova aba");
                iphoneContinue();
            }
        }

    }
}
