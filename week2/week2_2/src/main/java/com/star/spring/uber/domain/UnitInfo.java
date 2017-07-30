package com.star.spring.uber.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;  // generate getter setter automatically
import lombok.RequiredArgsConstructor;

import javax.persistence.Embeddable;


@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Embeddable
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UnitInfo {

    private final String unitVin;
    private String engineMake;
    private String customerName;
    private String unitNumber;

    private UnitInfo() {
        this.unitVin = "";
    }

}
