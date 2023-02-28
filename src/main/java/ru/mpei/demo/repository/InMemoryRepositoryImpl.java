package ru.mpei.demo.repository;

import org.springframework.stereotype.Repository;
import ru.mpei.demo.model.MeasurementDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class InMemoryRepositoryImpl implements MeasurementsRepo{
    private final  Map<String, List<MeasurementDTO>> data = new HashMap<>();

    @Override
    public boolean addSample(MeasurementDTO mdto) {
        data.putIfAbsent(mdto.getSubstationId(), new ArrayList<>());
        data.get(mdto.getEquipmentId()).add(mdto);
        return true;
    }

    @Override
    public List<MeasurementDTO> findAllForEquipment(String eqId, String ssId) {
        if (data.containsKey(ssId)){
            return data.get(ssId).stream()
                    .filter(el -> el.getEquipmentId().equals(eqId))
                    .collect(Collectors.toList());
        } else {
            return new ArrayList<>();
        }
    }
}
