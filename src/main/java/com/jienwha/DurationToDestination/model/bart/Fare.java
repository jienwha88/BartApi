
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
    "@amount",
    "@class"
})
public class Fare {

    @JsonProperty("@amount")
    private String amount;
    @JsonProperty("@class")
    private String _class;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("@amount")
    public String getAmount() {
        return amount;
    }

    @JsonProperty("@amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    @JsonProperty("@class")
    public String getClass_() {
        return _class;
    }

    @JsonProperty("@class")
    public void setClass_(String _class) {
        this._class = _class;
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
