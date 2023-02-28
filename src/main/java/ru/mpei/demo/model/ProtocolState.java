package ru.mpei.demo.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ProtocolState {
    private String name;
    private List<Integer> ports = new ArrayList<>();
    private Type pType;
}
