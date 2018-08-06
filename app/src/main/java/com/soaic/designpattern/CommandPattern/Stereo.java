package com.soaic.designpattern.CommandPattern;

public class Stereo {
    private String name;
    public Stereo(String name){
        this.name = name;
    }

    public void on(){
        System.out.println(name+" stereo is on");
    }

    public void off(){
        System.out.println(name+" stereo is off");
    }

    public void setCd(){
        System.out.println(name+" stereo is set for CD input");
    }

    public void setDvd(){
        System.out.println(name+" stereo is set for DVD input");
    }

    public void setRadio(){
        System.out.println(name+" stereo is set for Radio input");
    }

    public void setVolume(int volume){
        System.out.println(name+" stereo is volume set to "+volume);
    }
}
