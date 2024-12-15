package Homework8;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogAnalyzer {
    private String filePath;

    public LogAnalyzer(String filePath) {
        this.filePath = filePath;
    }

    public List<String> getAllErrors() throws IOException {
        List<String> errors = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader((filePath)));
        try {
            String line;
            while((line = reader.readLine()) != null) {
                if (line.contains("ERROR")) {
                    errors.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }

        return errors;
    }

    public List<String> getErrorsByDate(String date) throws IOException {
        List<String> errors = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.contains("ERROR") && line.contains(date)) {
                errors.add(line);
            }
        }
        reader.close();
        return errors;
    }

    public void writeErrorStatisticsToFile(String outputFilePath) throws IOException {
        Map<String, Integer> errorCountMap = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            if(line.contains("ERROR")) {
                String error = line.substring(line.indexOf("ERROR"));
                errorCountMap.put(error, errorCountMap.getOrDefault(error, 0) + 1);
            }
        }
        reader.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
        for (Map.Entry<String, Integer> entry: errorCountMap.entrySet()) {
            writer.write(entry.getKey() + " - " + entry.getValue() + " occurences");
            writer.newLine();
        }
        writer.close();
    }
 }
