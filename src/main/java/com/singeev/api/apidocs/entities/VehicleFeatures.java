package com.singeev.api.apidocs.entities;

import lombok.Builder;

@Builder
class VehicleFeatures {
    private boolean rods;
    private boolean belts;
    private boolean fixingDevices;
    private String other;
}
