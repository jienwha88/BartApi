
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
    "special_schedule",
    "co2_emissions"
})
public class Message {

    @JsonProperty("special_schedule")
    private SpecialSchedule specialSchedule;
    @JsonProperty("co2_emissions")
    private Co2Emissions co2Emissions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("special_schedule")
    public SpecialSchedule getSpecialSchedule() {
        return specialSchedule;
    }

    @JsonProperty("special_schedule")
    public void setSpecialSchedule(SpecialSchedule specialSchedule) {
        this.specialSchedule = specialSchedule;
    }

    @JsonProperty("co2_emissions")
    public Co2Emissions getCo2Emissions() {
        return co2Emissions;
    }

    @JsonProperty("co2_emissions")
    public void setCo2Emissions(Co2Emissions co2Emissions) {
        this.co2Emissions = co2Emissions;
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
