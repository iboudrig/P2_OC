package com.hemebiotech.analytics;

import java.util.List;

public interface ISymptomReader {
	/**
	 * @return a list of all symptoms obtained from symptoms.txt
	 */
	List<String> getSymptoms();
}