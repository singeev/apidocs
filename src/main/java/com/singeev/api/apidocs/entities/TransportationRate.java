package com.singeev.api.apidocs.entities;

import lombok.Builder;

@Builder
class TransportationRate {
    private Integer rate;
    private String currencyName;
    private Integer nds;
}
