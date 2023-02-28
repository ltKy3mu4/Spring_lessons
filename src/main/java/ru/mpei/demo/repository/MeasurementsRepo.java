package ru.mpei.demo.repository;

import ru.mpei.demo.model.MeasurementDTO;

import java.util.List;

public interface MeasurementsRepo {

    boolean addSample(MeasurementDTO mdto);

    List<MeasurementDTO> findAllForEquipment(String eqId, String ssId);
}
