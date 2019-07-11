package com.lambdaschool.solution;

public class MyApplication implements Processor {
    private AthleteService athlete;

    MyApplication(AthleteService athlete) {
        this.athlete = athlete;
    }
    @Override
    public void displayAthlete(String sport, String athleteType) {
        athlete.display(sport, athleteType);
    }
}
