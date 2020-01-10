package com.bluemorphost.demo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Competition {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;
        private String competitionName;

        @Temporal(TemporalType.TIMESTAMP)
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
        private Date competitionStartDateTime;

        public String getCompetitionName() {
            return competitionName;
        }

        public void setCompetitionName(String competitionName) {
            this.competitionName = competitionName;
        }
        public Date getCompetitionStartDateTime(){
            return competitionStartDateTime;
        }
        public void setCompetitionStartDateTime(Date competitionStartDateTime){
            this.competitionStartDateTime = competitionStartDateTime;
        }
}
