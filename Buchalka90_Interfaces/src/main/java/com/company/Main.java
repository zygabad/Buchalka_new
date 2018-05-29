package com.company;

public class Main {
    public static void main(String[] args) {
        ITelephone mojTelefon;
        mojTelefon = new MobilePhone("Telefon Zygmunta", 604325682);
        mojTelefon.powerOn();
        mojTelefon.dial(600250555);

    }
}
