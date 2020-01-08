package com.bluemorphost.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Race {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        private String raceName;
          public String getRaceName() {
            return raceName;
        }

        public void setRaceName(String raceName) {
            this.raceName = raceName;
        }
}
