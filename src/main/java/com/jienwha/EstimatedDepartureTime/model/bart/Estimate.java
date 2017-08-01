
package com.jienwha.EstimatedDepartureTime.model.bart;

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
    "minutes",
    "platform",
    "direction",
    "length",
    "color",
    "hexcolor",
    "bikeflag"
})
public class Estimate {

    @JsonProperty("minutes")
    private String minutes;
    @JsonProperty("platform")
    private String platform;
    @JsonProperty("direction")
    private String direction;
    @JsonProperty("length")
    private String length;
    @JsonProperty("color")
    private String color;
    @JsonProperty("hexcolor")
    private String hexcolor;
    @JsonProperty("bikeflag")
    private String bikeflag;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("minutes")
    public String getMinutes() {
        return minutes;
    }

    @JsonProperty("minutes")
    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }

    @JsonProperty("platform")
    public String getPlatform() {
        return platform;
    }

    @JsonProperty("platform")
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @JsonProperty("direction")
    public String getDirection() {
        return direction;
    }

    @JsonProperty("direction")
    public void setDirection(String direction) {
        this.direction = direction;
    }

    @JsonProperty("length")
    public String getLength() {
        return length;
    }

    @JsonProperty("length")
    public void setLength(String length) {
        this.length = length;
    }

    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    @JsonProperty("color")
    public void setColor(String color) {
        this.color = color;
    }

    @JsonProperty("hexcolor")
    public String getHexcolor() {
        return hexcolor;
    }

    @JsonProperty("hexcolor")
    public void setHexcolor(String hexcolor) {
        this.hexcolor = hexcolor;
    }

    @JsonProperty("bikeflag")
    public String getBikeflag() {
        return bikeflag;
    }

    @JsonProperty("bikeflag")
    public void setBikeflag(String bikeflag) {
        this.bikeflag = bikeflag;
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
