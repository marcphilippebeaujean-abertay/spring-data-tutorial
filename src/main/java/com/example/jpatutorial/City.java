package com.example.jpatutorial;

import javax.persistence.*;

@Entity
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public City() {}

    public City(String name, boolean isCapital) {
        this.name = name;
        this.isCapital = isCapital;
    }

    private String name;
    private boolean isCapital;

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
