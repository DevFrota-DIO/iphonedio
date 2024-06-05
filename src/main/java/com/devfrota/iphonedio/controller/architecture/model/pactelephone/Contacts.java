package com.devfrota.iphonedio.controller.architecture.model.pactelephone;


import com.devfrota.iphonedio.controller.architecture.services.ServiceData;
import com.devfrota.iphonedio.controller.architecture.work.interfaces.ITelephone;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Contacts implements ITelephone {
    List<Contact> contactList;
    ServiceData newData = new ServiceData();


    public Contacts() {
        setContactList(newData.getDataContacts());
    }

}

