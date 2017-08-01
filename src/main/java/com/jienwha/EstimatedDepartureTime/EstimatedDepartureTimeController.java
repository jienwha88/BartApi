package com.jienwha.EstimatedDepartureTime;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jienwha.EstimatedDepartureTime.model.EstimatedDepartureTime;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;


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
    public ResponseEntity<String> getEstimatedDeparturesForStation(@PathVariable("station") String station) throws JsonProcessingException {

        EstimatedDepartureTime edt = new RestTemplate().getForObject(etdUrl, EstimatedDepartureTime.class, station, key);

        String jsonResponse = new ObjectMapper().writeValueAsString(edt);
        System.out.println("jsonResponse = " + jsonResponse);

        return new ResponseEntity<String>(jsonResponse, HttpStatus.OK);
    }



    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView swaggerui() {
        return new ModelAndView("redirect:swagger-ui.html");
    }

}
