package com.bluemorphost.demo;

import javax.persistence.*;

@Entity
public class ParticipantInCompetition {

    @Id
    @GeneratedValue
    private long id;

    private long competitionId;

    private long participantId;

    public long getParticipantId() {
        return participantId;
    }

    public void setParticipantId(long participantId) {
        this.participantId = participantId;
    }
    public long getCompetitionId() {
        return competitionId;
    }

    public void setCompetitionId(long competitionId) {
        this.competitionId = competitionId;
    }


}
