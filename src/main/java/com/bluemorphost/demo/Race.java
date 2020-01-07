package com.bluemorphost.demo;

public class Race {
    private String id = "";
    private String raceName = "";
    private String startDateTime = "";
    public Race(String id){
        this.id = id;
        this.raceName = "Guinea Pig Race 1";
        this.startDateTime = "2020.02.02 02:02";

    }

    public String getId() {
        return id;
    }

    public String getRaceName() {
        return raceName;
    }

    public String getStartDateTime() {
        return startDateTime;
    }

    private void setRaceDataById(String id){

    }
}
