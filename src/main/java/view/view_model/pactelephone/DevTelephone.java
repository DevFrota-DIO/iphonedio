package view.view_model.pactelephone;

import com.devfrota.iphonedio.controller.architecture.model.pactelephone.Contact;
import view.view_principal.View;
import view.view_interfaces.IDevTelephone;

import java.util.List;

public class DevTelephone implements IDevTelephone {
    private Call call;
    private final Contacts contacts;

    public DevTelephone() {
        this.contacts = new Contacts();

    }

    @Override
    public void makeCall(Contact contact) {
        View view = new View();
        view.printMakeCall(contact);

    }

    @Override
    public void answerCall(String number) {
        View view = new View();
        view.printMenssage(number);

    }

    @Override
    public void voiceMail() {
        View view = new View();
        view.printVoiceMail();
    }

    @Override
    public List<Contact> getContacts() {
        return this.contacts.getContactList();
    }
}
