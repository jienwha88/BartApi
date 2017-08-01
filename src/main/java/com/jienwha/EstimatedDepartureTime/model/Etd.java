
package com.jienwha.EstimatedDepartureTime.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "destination",
    "abbreviation",
    "limited",
    "estimate"
})
public class Etd {

    @JsonProperty("destination")
    private String destination;
    @JsonProperty("abbreviation")
    private String abbreviation;
    @JsonProperty("limited")
    private String limited;
    @JsonProperty("estimate")
    private List<Estimate> estimate = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("destination")
    public String getDestination() {
        return destination;
    }

    @JsonProperty("destination")
    public void setDestination(String destination) {
        this.destination = destination;
    }

    @JsonProperty("abbreviation")
    public String getAbbreviation() {
        return abbreviation;
    }

    @JsonProperty("abbreviation")
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @JsonProperty("limited")
    public String getLimited() {
        return limited;
    }

    @JsonProperty("limited")
    public void setLimited(String limited) {
        this.limited = limited;
    }

    @JsonProperty("estimate")
    public List<Estimate> getEstimate() {
        return estimate;
    }

    @JsonProperty("estimate")
    public void setEstimate(List<Estimate> estimate) {
        this.estimate = estimate;
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
