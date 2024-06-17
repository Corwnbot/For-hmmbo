package com.yourname.autospawnerarea.utils;

public class Area {
    private String name;
    private String typeMob;
    private int delayTime;

    public Area(String name, String typeMob, int delayTime) {
        this.name = name;
        this.typeMob = typeMob;
        this.delayTime = delayTime;
    }

    public String getName() {
        return name;
    }

    public String getTypeMob() {
        return typeMob;
    }

    public void setTypeMob(String typeMob) {
        this.typeMob = typeMob;
    }

    public int getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(int delayTime) {
        this.delayTime = delayTime;
    }
}