package com.jienwha.DurationToDestination.transformer;

import com.jienwha.DurationToDestination.model.bart.DurationToDestination;
import com.jienwha.DurationToDestination.model.DurationToDestinationOut;

/**
 * Created by williamwu on 8/1/17.
 */
public class DurationToDestinationTransformer {

    public static DurationToDestinationOut simplifyOutput(DurationToDestination input) {
        DurationToDestinationOut output = new DurationToDestinationOut();
        output.setOrigin(input.getRoot().getOrigin());
        output.setDestination(input.getRoot().getDestination());
        output.setTripTime(input.getRoot().getSchedule().getRequest().getTrip().getTripTime());

        return output;
    }

}
