package com.hemebiotech.analytics;

import java.util.Map;

public interface ISymtomWriter {
    /**
     * Writes plain key-value pairs into the results file
     * @param occurrences a map containing symptoms as keys and frequencies as values
     */
    void printSymptomOccurrences(Map<String, Long> occurrences);
}
