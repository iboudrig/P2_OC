package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public interface SymptomsCounter {

    /** This method counts occurrences of each symptom in the list
     * @param symptoms list of symptoms
     * @return a map containing all symptoms paired with their frequency in alphabetical order
     */
    Map<String, Long> symptomCounter(List<String> symptoms);
}
