package view.view_config;

import view.view_principal.View;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

import static com.devfrota.iphonedio.controller.architecture.work.factories.ServiceFactory.sLang;
import static com.devfrota.iphonedio.controller.architecture.work.factories.ViewFactory.view;


public class DevConfigView {

    private Properties langProps;
    private Properties menuProps;
    @Getter
    private final DevConfigLanguage newLang = sLang();
    @Getter
    private final View oneView = view();

    private static final String LANGUAGE_DIRECTORY = "src/main/resources/properties/languages/";
    private static final String LANGUAGE_FILE = "languages.properties";
    private static final String STRINGS_FILE = "/stringsview.properties";
    private static final String MENU_FILE = ".properties";
    private static final String PATCH_LANGUAGE = LANGUAGE_DIRECTORY + LANGUAGE_FILE;
    private static String STRING_DIRECTORY = LANGUAGE_DIRECTORY;
    private static String PATCH_MENU;

    public DevConfigView() {
    }


    public void start() {
        displayMenu();
    }

    public void setStringDirectory(String dir) {
        STRING_DIRECTORY = LANGUAGE_DIRECTORY + dir;
    }

    public String getStringDirectory() {
        return STRING_DIRECTORY;
    }

    public String option(ArrayList<String> keys) {
        String keyOption = "";
        Scanner scan = new Scanner(System.in);
        oneView.print("message_option", getNewLang());
        oneView.print("message_exit", getNewLang());
        String key = scan.nextLine();
		if (key.equalsIgnoreCase("Sair") || key.equalsIgnoreCase("exit")) {
            System.out.println("Obrigado por usar o App Simulador Básico de Iphone");
            System.exit(0);
        }
        try {
            keyOption = keys.get(Integer.parseInt(key) - 1);
        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            System.out.println("*** E R R O R ***");

        }

        return keyOption;
    }

    // Executa a thread menus
    public void displayMenu() {
        newLang.setActiveLanguage("enUS");
        String key = printAllMenu(configLanguage());
        newLang.setActiveLanguage(key);
        //newLang.setLanguage(key);
        setPatchMenu("principal");
        newLang.setMenuProperties(PATCH_MENU);
        configMenu();
    }

    private void setPatchMenu(String file) {
        PATCH_MENU = LANGUAGE_DIRECTORY + newLang.getLanguage() + "/";
        PATCH_MENU += file + MENU_FILE;
    }

    private void configMenu() {
        String key = "";
        String[] values = new String[]{"title_menu", "player", "phone", "browser", "principal"};
        String[] valuesBr = new String[]{"principal",
                "Dispositivo de Reprodução",
                "Dispositivo Telefônico",
                "Navegador de Internet",
                "Menu Principal"};
        ArrayList<String> keys;
        String cacheValue = "";
        while (!key.equalsIgnoreCase("5")) {
            menuProps = newLang.getMenuProperties();
            key = printAllMenu(menuProps);
            String value = menuProps.getProperty(key);
            if (valuesBr[Integer.parseInt(key)].equalsIgnoreCase(value)) {
                setPatchMenu(values[Integer.parseInt(key)]);
                cacheValue = values[Integer.parseInt(key)];
                newLang.setMenuProperties(PATCH_MENU);
            } else if (key.equals("1") || key.equals("2")) {
                userActionOne(key, value, cacheValue);
            } else {
                userActionTwo(key, value);
            }
        }
    }

    private void userActionOne(String key, String value, String cache) {
        oneView.printAcction(key, value, cache);
    }


    private void userActionTwo(String key, String value) {
        oneView.printList(value);
    }

    public Properties searchStrings(String str) {
        newLang.setActiveLanguage(str);
        setStringDirectory(newLang.getActiveLanguage());
        newLang.setStringsProperties(getStringDirectory() + STRINGS_FILE);
        return newLang.getStringsProperties();
    }

    public String printAllMenu(Properties props) {
        int cod = 0;
        String str = "";
        String key = "";
        boolean set = true;
        while (set) {
            oneView.print(props.getProperty("0"), getNewLang());
            ArrayList<String> keys = printAllProperties(props);
            key = option(keys);
            if (keys.contains(key)) {
                set = false;
            } else {
                oneView.print("message_invalid_option", getNewLang());
                System.out.println("Pressione qualquer tecla para continuar...");

            }

        }

        if (newLang.getOn() == 1) {
            newLang.setOn(2);
            newLang.setActiveLanguage(key);
            newLang.setLanguage(key);
        }
        return key;
    }

    public static ArrayList<String> printAllProperties(Properties properties) {
        final int[] cod = {1};
        ArrayList<String> arrayKeys = new ArrayList<>();
        properties.entrySet().stream()
                .skip(1)
                .forEach(entry ->
                        arrayKeys.add(String.valueOf(entry.getKey())));

        properties.entrySet().stream()
                .skip(1)
                .forEach(entry -> System.out.println((cod[0]++) + " - " + entry.getValue()));
        return arrayKeys;
    }

    private Properties configLanguage() {
        newLang.setLanguagesProperties(PATCH_LANGUAGE);
        newLang.setOn(1);
        langProps = newLang.getLanguagesProperties();
        return langProps;
    }

}
