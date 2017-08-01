
package com.jienwha.DurationToDestination.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "@origin",
    "@destination",
    "@fare",
    "@origTimeMin",
    "@origTimeDate",
    "@destTimeMin",
    "@destTimeDate",
    "@clipper",
    "@tripTime",
    "@co2",
    "fares",
    "leg"
})
public class Trip {

    @JsonProperty("@origin")
    private String origin;
    @JsonProperty("@destination")
    private String destination;
    @JsonProperty("@fare")
    private String fare;
    @JsonProperty("@origTimeMin")
    private String origTimeMin;
    @JsonProperty("@origTimeDate")
    private String origTimeDate;
    @JsonProperty("@destTimeMin")
    private String destTimeMin;
    @JsonProperty("@destTimeDate")
    private String destTimeDate;
    @JsonProperty("@clipper")
    private String clipper;
    @JsonProperty("@tripTime")
    private String tripTime;
    @JsonProperty("@co2")
    private String co2;
    @JsonProperty("fares")
    private Fares fares;
    @JsonProperty("leg")
    private Leg leg;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("@origin")
    public String getOrigin() {
        return origin;
    }

    @JsonProperty("@origin")
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @JsonProperty("@destination")
    public String getDestination() {
        return destination;
    }

    @JsonProperty("@destination")
    public void setDestination(String destination) {
        this.destination = destination;
    }

    @JsonProperty("@fare")
    public String getFare() {
        return fare;
    }

    @JsonProperty("@fare")
    public void setFare(String fare) {
        this.fare = fare;
    }

    @JsonProperty("@origTimeMin")
    public String getOrigTimeMin() {
        return origTimeMin;
    }

    @JsonProperty("@origTimeMin")
    public void setOrigTimeMin(String origTimeMin) {
        this.origTimeMin = origTimeMin;
    }

    @JsonProperty("@origTimeDate")
    public String getOrigTimeDate() {
        return origTimeDate;
    }

    @JsonProperty("@origTimeDate")
    public void setOrigTimeDate(String origTimeDate) {
        this.origTimeDate = origTimeDate;
    }

    @JsonProperty("@destTimeMin")
    public String getDestTimeMin() {
        return destTimeMin;
    }

    @JsonProperty("@destTimeMin")
    public void setDestTimeMin(String destTimeMin) {
        this.destTimeMin = destTimeMin;
    }

    @JsonProperty("@destTimeDate")
    public String getDestTimeDate() {
        return destTimeDate;
    }

    @JsonProperty("@destTimeDate")
    public void setDestTimeDate(String destTimeDate) {
        this.destTimeDate = destTimeDate;
    }

    @JsonProperty("@clipper")
    public String getClipper() {
        return clipper;
    }

    @JsonProperty("@clipper")
    public void setClipper(String clipper) {
        this.clipper = clipper;
    }

    @JsonProperty("@tripTime")
    public String getTripTime() {
        return tripTime;
    }

    @JsonProperty("@tripTime")
    public void setTripTime(String tripTime) {
        this.tripTime = tripTime;
    }

    @JsonProperty("@co2")
    public String getCo2() {
        return co2;
    }

    @JsonProperty("@co2")
    public void setCo2(String co2) {
        this.co2 = co2;
    }

    @JsonProperty("fares")
    public Fares getFares() {
        return fares;
    }

    @JsonProperty("fares")
    public void setFares(Fares fares) {
        this.fares = fares;
    }

    @JsonProperty("leg")
    public Leg getLeg() {
        return leg;
    }

    @JsonProperty("leg")
    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
