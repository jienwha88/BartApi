package com.jienwha.DurationToDestination;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jienwha.DurationToDestination.model.bart.DurationToDestination;
import com.jienwha.DurationToDestination.model.DurationToDestinationOut;
import com.jienwha.DurationToDestination.transformer.DurationToDestinationTransformer;
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
    @GetMapping(value = "api/v1/duration")
    public ResponseEntity<DurationToDestinationOut> getEstimatedDeparturesForStation(@RequestParam("orig") String origin,
                                                                   @RequestParam("dest") String destination) throws JsonProcessingException {
        DurationToDestination duration = new RestTemplate().getForObject(durationUrl, DurationToDestination.class, origin, destination, key);

        DurationToDestinationOut output = DurationToDestinationTransformer.simplifyOutput(duration);

//        String jsonResponse = new ObjectMapper().writeValueAsString(output);
//        System.out.println("jsonResponse = " + jsonResponse);

        return new ResponseEntity<>(output, HttpStatus.OK);
    }



}
