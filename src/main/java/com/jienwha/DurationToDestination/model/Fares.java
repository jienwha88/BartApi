
package com.jienwha.DurationToDestination.model;

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
    "@level",
    "fare"
})
public class Fares {

    @JsonProperty("@level")
    private String level;
    @JsonProperty("fare")
    private List<Fare> fare = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("@level")
    public String getLevel() {
        return level;
    }

    @JsonProperty("@level")
    public void setLevel(String level) {
        this.level = level;
    }

    @JsonProperty("fare")
    public List<Fare> getFare() {
        return fare;
    }

    @JsonProperty("fare")
    public void setFare(List<Fare> fare) {
        this.fare = fare;
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
