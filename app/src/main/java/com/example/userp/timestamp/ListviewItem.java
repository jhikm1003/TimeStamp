package com.example.userp.timestamp;

/**
 * Created by userp on 2018-07-12.
 */

public class ListviewItem {
    private String time;
    private String situation;

    public ListviewItem(String time, String situation) {
        this.time = time;
        this.situation = situation;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }
}
