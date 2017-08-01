
package com.jienwha.DurationToDestination.model.bart;

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
    "@order",
    "@transfercode",
    "@origin",
    "@destination",
    "@origTimeMin",
    "@origTimeDate",
    "@destTimeMin",
    "@destTimeDate",
    "@line",
    "@bikeflag",
    "@trainHeadStation",
    "@load",
    "@trainId",
    "@trainIdx"
})
public class Leg {

    @JsonProperty("@order")
    private String order;
    @JsonProperty("@transfercode")
    private String transfercode;
    @JsonProperty("@origin")
    private String origin;
    @JsonProperty("@destination")
    private String destination;
    @JsonProperty("@origTimeMin")
    private String origTimeMin;
    @JsonProperty("@origTimeDate")
    private String origTimeDate;
    @JsonProperty("@destTimeMin")
    private String destTimeMin;
    @JsonProperty("@destTimeDate")
    private String destTimeDate;
    @JsonProperty("@line")
    private String line;
    @JsonProperty("@bikeflag")
    private String bikeflag;
    @JsonProperty("@trainHeadStation")
    private String trainHeadStation;
    @JsonProperty("@load")
    private String load;
    @JsonProperty("@trainId")
    private String trainId;
    @JsonProperty("@trainIdx")
    private String trainIdx;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("@order")
    public String getOrder() {
        return order;
    }

    @JsonProperty("@order")
    public void setOrder(String order) {
        this.order = order;
    }

    @JsonProperty("@transfercode")
    public String getTransfercode() {
        return transfercode;
    }

    @JsonProperty("@transfercode")
    public void setTransfercode(String transfercode) {
        this.transfercode = transfercode;
    }

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

    @JsonProperty("@line")
    public String getLine() {
        return line;
    }

    @JsonProperty("@line")
    public void setLine(String line) {
        this.line = line;
    }

    @JsonProperty("@bikeflag")
    public String getBikeflag() {
        return bikeflag;
    }

    @JsonProperty("@bikeflag")
    public void setBikeflag(String bikeflag) {
        this.bikeflag = bikeflag;
    }

    @JsonProperty("@trainHeadStation")
    public String getTrainHeadStation() {
        return trainHeadStation;
    }

    @JsonProperty("@trainHeadStation")
    public void setTrainHeadStation(String trainHeadStation) {
        this.trainHeadStation = trainHeadStation;
    }

    @JsonProperty("@load")
    public String getLoad() {
        return load;
    }

    @JsonProperty("@load")
    public void setLoad(String load) {
        this.load = load;
    }

    @JsonProperty("@trainId")
    public String getTrainId() {
        return trainId;
    }

    @JsonProperty("@trainId")
    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    @JsonProperty("@trainIdx")
    public String getTrainIdx() {
        return trainIdx;
    }

    @JsonProperty("@trainIdx")
    public void setTrainIdx(String trainIdx) {
        this.trainIdx = trainIdx;
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
