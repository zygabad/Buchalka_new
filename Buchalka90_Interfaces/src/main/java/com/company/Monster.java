package com.company;

import java.util.ArrayList;

public class Monster implements ISaveble{
    private String monsterName;
    private int lifePercent;

    public Monster(String monsterName, int lifePercent) {
        this.monsterName = monsterName;
        this.lifePercent = lifePercent;
    }

    public String getMonsterName() {
        return monsterName;
    }


    public int getLifePercent() {
        return lifePercent;
    }

    public void setLifePercent(int lifePercent) {
        this.lifePercent = lifePercent;
    }

    @Override
    public ArrayList<Object> saveObject(Object object) {
        return null;
    }

    @Override
    public Object getObject(ArrayList<Object> arrayList, int field) {
        return null;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "monsterName='" + monsterName + '\'' +
                ", lifePercent=" + lifePercent +
                '}';
    }
}
