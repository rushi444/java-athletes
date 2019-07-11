package com.lambdaschool.solution;

public class TrackAthleteCreationInjector extends AthleteCreationInjector {
    @Override
    public Processor getProcess(){
        return new MyApplication(new TrackAthleteImpl());
    }
}
