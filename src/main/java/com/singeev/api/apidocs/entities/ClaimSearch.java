package com.singeev.api.apidocs.entities;

import lombok.Data;

import java.util.Date;

@Data
public class ClaimSearch {
    private String transportClaimNumber;
    private Date claimDateFrom;
    private Date claimDateTo;
    private String type;
    private String shipper;
    private String consignee;
    private String carrier;
    private String vehicleRegNumber;
    private String driverName;
    private String managerName;
}
