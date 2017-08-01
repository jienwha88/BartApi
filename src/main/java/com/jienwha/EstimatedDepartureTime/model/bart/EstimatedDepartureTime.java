
package com.jienwha.EstimatedDepartureTime.model.bart;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "?xml",
    "root"
})
public class EstimatedDepartureTime {

    @JsonProperty("?xml")
    private Xml xml;
    @JsonProperty("root")
    private Root root;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("?xml")
    public Xml getXml() {
        return xml;
    }

    @JsonProperty("?xml")
    public void setXml(Xml xml) {
        this.xml = xml;
    }

    @JsonProperty("root")
    public Root getRoot() {
        return root;
    }

    @JsonProperty("root")
    public void setRoot(Root root) {
        this.root = root;
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
