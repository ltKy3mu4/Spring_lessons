package ru.mpei.demo.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EquipmentTest {


    @Test
    @SneakyThrows
    public void jsonParstingTest(){
        Equipment e = new Equipment();
        e.setId(1);
        e.setName("Name_1");

        Measurement m = new Measurement();
        m.setIa(1);
        m.setUa(1);
        m.setEquipment(e);

        e.getMeasurements().add(m);


        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(e);
        System.out.println(s);

    }

}