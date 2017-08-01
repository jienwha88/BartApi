package com.jienwha.EstimatedDepartureTime.transformer;

import com.jienwha.EstimatedDepartureTime.model.bart.EstimatedDepartureTime;
import com.jienwha.EstimatedDepartureTime.model.bart.Etd;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by williamwu on 8/1/17.
 */
public class EstimatedDepartureTimeTransformer {

    public static List<Etd> getEtdList(EstimatedDepartureTime estimatedDepartureTime){
        return estimatedDepartureTime.getRoot().getStation().isEmpty() ? new ArrayList<>()
                        : estimatedDepartureTime.getRoot().getStation().get(0).getEtd();
    }

}
