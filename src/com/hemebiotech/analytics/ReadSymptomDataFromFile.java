package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	
	/**
	 *
	 * @param filepath a partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (String filepath) {

		this.filepath = filepath;
	}
	
	@Override
	public List<String> GetSymptoms() {
		ArrayList<String> result = new ArrayList<String>();
		ResourceHandler resourceHandler = new ResourceHandler();
		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));
				String line = reader.readLine();
				/*
				InputStream inputStream = resourceHandler.getFileFromResourcesAsStream(filepath);
				*/
				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

}