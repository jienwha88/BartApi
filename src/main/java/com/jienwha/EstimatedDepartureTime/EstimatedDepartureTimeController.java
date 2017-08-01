package com.jienwha.EstimatedDepartureTime;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jienwha.EstimatedDepartureTime.model.bart.EstimatedDepartureTime;
import com.jienwha.EstimatedDepartureTime.model.bart.Etd;
import com.jienwha.EstimatedDepartureTime.transformer.EstimatedDepartureTimeTransformer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by williamwu on 7/31/17.
 */
@Api
@RestController
public class EstimatedDepartureTimeController {

    public static final String COMMAND = "etd";

    @Value("${bartapi.url.etd}")
    String etdUrl;

    @Value("${bartapi.key}")
    String key;

    @ApiOperation(value = "Get the Estimated Time of Departure for the given Station", response = String.class)
    @GetMapping (value = "api/v1/etd/{station}")
    public ResponseEntity<List<Etd>> getEstimatedDeparturesForStation(@PathVariable("station") String station) throws JsonProcessingException {

        EstimatedDepartureTime estimatedDepartureTime = new RestTemplate().getForObject(etdUrl, EstimatedDepartureTime.class, station, key);

        List<Etd> etdList = EstimatedDepartureTimeTransformer.getEtdList(estimatedDepartureTime);

//        String jsonResponse = new ObjectMapper().writeValueAsString(etdList);
//        System.out.println("jsonResponse = " + jsonResponse);

        return new ResponseEntity<>(etdList, HttpStatus.OK);
    }



    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView swaggerui() {
        return new ModelAndView("redirect:swagger-ui.html");
    }

}
