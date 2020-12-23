package com.hemebiotech.analytics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

/**
 * Implementation class related to writing symptoms statistics to a file
 *
 */

public class WriteSymptomStatistics implements ISymptomWriter {
    private String filepath;

    public WriteSymptomStatistics(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public void printSymptomOccurrences(Map<String, Long> occurrences) {
        try {
            Files.write(Path.of(filepath), () -> occurrences.entrySet().stream()
                    .<CharSequence>map(e -> e.getKey() + " " + e.getValue())
                    .iterator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
