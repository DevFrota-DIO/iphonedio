package view.view_config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.*;

public class DevConfigLanguage {
    private String language = "enUS";
    private String activeLanguage;
    private static int on = 0;
    static final Logger logger = Logger.getLogger(DevConfigLanguage.class.getName());
    private static String PATCH_MENU_FILE;
    private static String PATCH_STRING_FILE;
    private static String LANGUAGE_DIRECTORY;
    private static Properties languagesProperties;
    private static Properties menuProperties;
    private static Properties stringsProperties;

    public DevConfigLanguage() {

    }

    public String getLanguage() {
        return this.language;
    }

    public String getActiveLanguage() {
        return this.activeLanguage;
    }

    public void setActiveLanguage(String activeLanguage) {
        this.activeLanguage = activeLanguage;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public static void runProperties(String patchDir, Properties props) {
        try (InputStream inputStream = new FileInputStream(patchDir)) {
            props.load(inputStream);
        }  catch (IOException e) {
            logger.log(Level.SEVERE, "Ocorreu um erro na classe runProperties(String patchProperties) durante a execução.\n", e);
        }
    }

    public Properties getStringsProperties() {
        return stringsProperties;
    }

    public void setStringsProperties(String patchProperties) {
        stringsProperties = new Properties();
        PATCH_STRING_FILE = patchProperties;
        runProperties(PATCH_STRING_FILE, getStringsProperties());
    }

    public Properties getLanguagesProperties() {
        return languagesProperties;
    }

    public void setLanguagesProperties(String languageDirectory){
        languagesProperties = new Properties();
        LANGUAGE_DIRECTORY = languageDirectory;
        runProperties(LANGUAGE_DIRECTORY, languagesProperties);
    }

    public Properties getMenuProperties() {
        return menuProperties;
    }

    public void setMenuProperties(String patchMenu) {
        menuProperties = new Properties();
        PATCH_MENU_FILE = patchMenu;
        runMenu();   
    }
    
    public void runMenu() {
        runProperties(PATCH_MENU_FILE, menuProperties);
    }

    public int getOn() {
        return on;
    }

    public void setOn(int b) {
        on = b;
    }
}
