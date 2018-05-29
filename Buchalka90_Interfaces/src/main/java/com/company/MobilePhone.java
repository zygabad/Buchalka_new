package com.company;

public class MobilePhone implements ITelephone{
    private String phoneName;
    private int phoneNumber;


    public MobilePhone(String phoneName, int phoneNumber) {
        this.phoneName = phoneName;
        this.phoneNumber = phoneNumber;

    }

    @Override
    public void powerOn() {
        System.out.println("Turning on the phone");
    }

    @Override
    public void dial(int number) {
        System.out.println("Dialing number: " + number );
    }

    @Override
    public boolean addContact(String contectName) {
        return false;
    }

    @Override
    public boolean removeContact(String contactName) {
        return false;
    }

    @Override
    public void answerCall() {

    }

    @Override
    public void shutdownPhone() {

    }

    @Override
    public boolean ring() {
        return false;
    }
}
