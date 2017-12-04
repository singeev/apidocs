package com.singeev.api.apidocs.entities;

import lombok.Builder;

import java.util.Date;

@Builder
public class Confirmation {
    private String name;
    private String passportSeries;
    private String passportNumber;
    private String passportIssuePlace;
    private Date passportIssueDate;
    private String drivingLicenseNumber;
    private String phoneNumber;
    private String vehicleBrand;
    private String vehicleRegNumber;
    private String trailerRegNumber;
}
