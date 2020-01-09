package com.bluemorphost.demo;

import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;


@Entity
public class Participant {

    @Id
    @GeneratedValue
    private long id;

    private String participantName;



    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

}