package com.bluemorphost.demo;

import javax.persistence.*;


@Entity
public class Participant {

    @Id
    @GeneratedValue
    private long id;

    private String participantName;
    private String participantType;



    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public String getParticipantType() {
        return participantType;
    }

    public void setParticipantType(String participantType) {
        this.participantType = participantType;
    }
}
