package com.hemebiotech.analytics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.Properties;

public class Config {
    private String symptomsFile;
    private String resultsFile;
    final String filePath = "symptoms.txt";
    final String resultPath = "results.out";
    public Config() {
        this.symptomsFile = filePath;
        this.resultsFile = resultPath;
    }
    public String getSymptomsFile() {
        return symptomsFile;
    }
    public String getResultsFile() {
        return resultsFile;
    }
}
