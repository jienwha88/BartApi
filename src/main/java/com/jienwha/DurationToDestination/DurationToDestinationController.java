package com.jienwha.DurationToDestination;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jienwha.DurationToDestination.model.DurationToDestination;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by williamwu on 8/1/17.
 */
@Api
@RestController
public class DurationToDestinationController {

    @Value("${bartapi.url.duration}")
    String durationUrl;

    @Value("${bartapi.key}")
    String key;

    @ApiOperation(value = "Get the Duration from origin to destination", response = String.class)
    @GetMapping(value = "api/v1/etd")
    public ResponseEntity<String> getEstimatedDeparturesForStation(@RequestParam("orig") String origin,
                                                                   @RequestParam("dest") String destination) throws JsonProcessingException {

//        String url = "http://api.bart.gov/api/sched.aspx?cmd=depart&orig=MONT&dest=DALY&key=MW9S-E7SL-26DU-VV8V&b=0&a=1&json=y";

//        DurationToDestination edt = new RestTemplate().getForObject(url, DurationToDestination.class, station, key);
        DurationToDestination edt = new RestTemplate().getForObject(durationUrl, DurationToDestination.class, origin, destination, key);

        String jsonResponse = new ObjectMapper().writeValueAsString(edt);
        System.out.println("jsonResponse = " + jsonResponse);

        return new ResponseEntity<String>(jsonResponse, HttpStatus.OK);
    }



}
