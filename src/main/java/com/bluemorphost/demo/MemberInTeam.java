package com.bluemorphost.demo;

import javax.persistence.*;

@Entity
public class MemberInTeam {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long memberId;
    private long teamId;

    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    public long getTeamId() {
        return teamId;
    }

    public void setTeamId(long teamId) {
        this.teamId = teamId;
    }
}
