package com.example.challengepraktikum;

public class email {
    private String time,message;
    private int pp;

    public email(String time, String message, int pp) {
        this.time = time;
        this.message = message;
        this.pp = pp;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }
}
