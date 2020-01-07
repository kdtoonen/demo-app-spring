package com.bluemorphost.demo;
import javax.persistence.*;
import java.util.Date;


@Entity
public class tblRace {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long raceId;
    private String raceName;

    @Temporal(TemporalType.TIMESTAMP)
    private Date startDateTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDateTime;

    protected tblRace(){}

    public tblRace(String raceName, Date startDateTime, Date endDateTime) {
        this.raceName = raceName;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
    }

    public Long getRaceId(){
        return raceId;
    }
    public String getRaceName(){
        return raceName;
    }
    public Date getStartDateTime(){
        return startDateTime;
    }
    public Date getEndDateTime(){
        return endDateTime;
    }
}
