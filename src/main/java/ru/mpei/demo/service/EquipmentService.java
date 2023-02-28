package ru.mpei.demo.service;

import org.springframework.stereotype.Service;
import ru.mpei.demo.model.BadEquipmentDTO;
import ru.mpei.demo.model.MeasurementDTO;

import java.util.List;

public interface EquipmentService {

    void addMeasurement(MeasurementDTO dto);

    BadEquipmentDTO getBadEquipment(String ssId);

}
