package com.spring_test_web.spring_test_web.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring_test_web.spring_test_web.model.Purchase;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class PurchaseService {

  @Value("${file.storage.path}")
  private String baseDir;

  private final ObjectMapper objectMapper;

  public void savePurchase(String filename, Purchase purchase) throws IOException {
    File file = new File(baseDir + filename + ".json");
    List<Purchase> purchases = new ArrayList<>();

    try {
      if (file.exists()) {
        purchases = objectMapper.readValue(file, List.class);
      }

      purchases.add(purchase);
      objectMapper.writeValue(file, purchases);
    } catch (IOException e) {
      log.error("Read-purchase:", e);
      throw e;
    }
  }

  public List<Purchase> readPurchases(String filename) throws IOException {
    File file = new File(baseDir + filename + ".json");
    if (file.exists()) {
      return objectMapper.readValue(file, List.class);
    }
    throw new IOException("File not found");
  }

  public void overwritePurchases(String filename, List<Purchase> purchases) throws IOException {
    File file = new File(baseDir + filename + ".json");
    objectMapper.writeValue(file, purchases);
  }

  public boolean fileExists(String filename) {
    File file = new File((baseDir + filename + ".json"));
    return file.exists();
  }

  public List<String> listAllFiles() {
    File directory = new File(baseDir);
    String[] files = directory.list((dir, name) -> name.endsWith(".json"));

    List<String> filenames = new ArrayList<>();
    if (files != null) {
      for (String file : files) {
        filenames.add((file.replace(".json", "")));
      }
    }

    return filenames;
  }

  public void deleteFile(String filename) {
    File file = new File(baseDir + filename + ".json");
    if (file.exists()) {
      file.delete();
    }
  }

  public void deleteAllFiles() {
    File directory = new File(baseDir);
    File[] files = directory.listFiles((dir, name) -> name.endsWith(".json"));
    if (files != null) {
      for (File file : files) {
        file.delete();
      }
    }
  }
}
