package com.devfrota.iphonedio.controller.architecture.data;

import com.devfrota.iphonedio.controller.architecture.model.pactelephone.Contact;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class DataTelephone {
    @Getter
    private List<Contact> telephoneList;
    String[] names = {
            "Ana", "Bruno", "Carla", "Daniel", "Eliana",
            "Felipe", "Gabriela", "Henrique", "Isabela", "João"
    };
    String[] telephones = new String[10];

    public DataTelephone() {
        this.telephoneList = new ArrayList<>();
        setTelephoneList();
    }

    void setTelephones(){
            for (int i = 0; i < telephones.length; i++) {
                telephones[i] = generateRandomPhoneNumber();
            }
        }


    public static String generateRandomPhoneNumber() {
        String[] areaCodes = {"11", "21", "31", "41", "51", "61", "71", "81", "91", "99"};
        String areaCode = areaCodes[(int) (Math.random() * areaCodes.length)];
        String firstPart = String.format("%04d", (int) (Math.random() * 10000));
        String secondPart = String.format("%04d", (int) (Math.random() * 10000));
        return areaCode + "-" + firstPart + "-" + secondPart;
    }

    void setTelephoneList() {
        setTelephones();
        int id;
        for (int i = 0; i < names.length; i++) {
            id = i + 1;
            telephoneList.add(new Contact(id, names[i], telephones[i]));
        }
    }

}
