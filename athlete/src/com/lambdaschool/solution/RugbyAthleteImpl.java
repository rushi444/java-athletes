package com.lambdaschool.solution;

public class RugbyAthleteImpl implements AthleteService {
    @Override
    public void display(String sport, String athleteType) {
        System.out.println(sport + " " + athleteType);
    }
}
