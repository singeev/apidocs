package com.singeev.api.apidocs.entities;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class Claim {
    @ApiModelProperty(notes = "Claim number. Letters and digits allowed.")
    private String number;
    @ApiModelProperty
    private String transportClaimNumber;
    private String type;
    private Date claimDate;
    private LocalDateTime loadDateTime;
    private LocalDateTime uploadDateTime;
    private Integer timing;
    private String cargoName;
    private Double cargoWeight;
    private String cargoWeightUnit;
    private Integer palletsAmount;
    private String loadingType;
    private String vehicleType;
    private Integer temperature;
    private VehicleFeatures vehicleFeatures;
    private TransportationRate transportationRate;
    private Agent shipper;
    private Agent consignee;
    private Agent carrier;

}
