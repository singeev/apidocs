package com.singeev.api.apidocs.entities;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;

@Builder
public class Agent {
    @ApiModelProperty
    private String type;
    @ApiModelProperty
    private String name;
    @ApiModelProperty
    private String address;
    @ApiModelProperty
    private String checkingAccount;
    @ApiModelProperty
    private String corrAccount;
    @ApiModelProperty
    private String branch;
    @ApiModelProperty
    private String inn;
    @ApiModelProperty
    private String bik;
    @ApiModelProperty
    private String okpo;
    @ApiModelProperty
    private String okonh;
    @ApiModelProperty
    private String contactName;
    @ApiModelProperty
    private String phone;
    @ApiModelProperty
    private String fax;
}
