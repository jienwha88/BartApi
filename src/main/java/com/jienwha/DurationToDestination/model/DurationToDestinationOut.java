package com.jienwha.DurationToDestination.model;

/**
 * Created by williamwu on 8/1/17.
 */
public class DurationToDestinationOut {
    String origin;
    String destination;
    String tripTime;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTripTime() {
        return tripTime;
    }

    public void setTripTime(String tripTime) {
        this.tripTime = tripTime;
    }
}
