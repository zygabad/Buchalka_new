package com.company;

import java.util.ArrayList;

public interface ISaveble {
    ArrayList<Object> saveObject(Object object);
    Object getObject(ArrayList<Object> arrayList, int field);
}
