package view.view_interfaces;

import com.devfrota.iphonedio.controller.architecture.model.pactelephone.Contact;

import java.util.List;

public interface IDevTelephone {

        void makeCall(Contact contact);
        void answerCall(String number);
        void voiceMail();
        List<Contact> getContacts();


}
