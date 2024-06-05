package com.devfrota.iphonedio.controller.architecture.model.pactelephone;


import lombok.*;

@Getter
@Setter
public class Contact {
    private int id;
    private String name;
    private String phoneNumber;


    public Contact(int id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;

    }

    @Override
    public String toString() {
        return  name  +
                "\nphoneNumber = " + phoneNumber;
    }
}

