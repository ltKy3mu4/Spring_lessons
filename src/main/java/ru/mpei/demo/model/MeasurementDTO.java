package ru.mpei.demo.model;

import lombok.Data;

@Data
public class MeasurementDTO {

    private String equipmentId;

    private String substationId;

    private String point;

    private double ua;
    private double ub;
    private double uc;
    private double ia;
    private double ib;
    private double ic;

}
