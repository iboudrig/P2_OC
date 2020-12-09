package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SymptomStatistics implements SymptomsCounter{
    @Override
    public Map<String, Long> symptomCounter(List<String> symptoms) {
        return symptoms.stream().collect(Collectors.groupingBy(e -> e, TreeMap::new, Collectors.counting()));
    }
}
