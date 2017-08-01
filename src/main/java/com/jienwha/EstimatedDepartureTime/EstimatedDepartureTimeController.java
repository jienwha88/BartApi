package com.jienwha.EstimatedDepartureTime;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jienwha.EstimatedDepartureTime.model.EstimatedDepartureTime;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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



    @ApiOperation(value = "Get the Estimated Time of Departure for the given Station", response = String.class)
    @GetMapping (value = "api/v1/etd/{station}")
    public ResponseEntity<String> getEstimatedDeparturesForStation(@PathVariable("station") String station) throws JsonProcessingException {

        String url = "http://api.bart.gov/api/etd.aspx?cmd=etd&orig=MONT&key=MW9S-E7SL-26DU-VV8V&json=y";

        EstimatedDepartureTime edt = new RestTemplate().getForObject(url, EstimatedDepartureTime.class);

        return new ResponseEntity<String>(new ObjectMapper().writeValueAsString(edt), HttpStatus.OK);
    }



    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView swaggerui() {
        return new ModelAndView("redirect:swagger-ui.html");
    }

}
