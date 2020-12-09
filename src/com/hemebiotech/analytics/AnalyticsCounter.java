package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
    public static void main(String[] args){

        Config config = new Config();

        ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile(config.getSymptomsFile());
        WriteSymptomStatistics writer = new WriteSymptomStatistics(config.getResultsFile());
        SymptomStatistics symptomStatistics = new SymptomStatistics();

        List<String> symptoms = reader.GetSymptoms();
        Map<String, Long> counts = symptomStatistics.symptomCounter(symptoms);

        System.out.println("Printing results into "+config.getResultsFile()+" ...");
        writer.printSymptomOccurrences(counts);
    }
}

