package ru.mpei.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BadEquipmentDTO {

    private String substationId;
    private List<String> badEquipmentId;
}
