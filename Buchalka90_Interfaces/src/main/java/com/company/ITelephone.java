package com.company;

public interface ITelephone {
    void powerOn();
    void dial(int number);
    boolean addContact(String contectName);
    boolean removeContact(String contactName);
    void answerCall();
    void shutdownPhone();
    boolean ring();


}
