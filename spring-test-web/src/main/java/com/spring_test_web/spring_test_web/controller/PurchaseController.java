package com.spring_test_web.spring_test_web.controller;

import com.spring_test_web.spring_test_web.model.Purchase;
import com.spring_test_web.spring_test_web.services.PurchaseService;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/purchases")
public class PurchaseController {
  @Autowired
  private PurchaseService purchaseService;

  @PostMapping("/save/{filename}")
  public ResponseEntity<Void> savePurchase(@PathVariable String filename, @RequestBody Purchase purchase) {
    try {
      purchaseService.savePurchase(filename, purchase);
      return new ResponseEntity<>(HttpStatus.OK);
    } catch (IOException e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @GetMapping("/read/{filename}")
  public ResponseEntity<List<Purchase>> readPurchases(@PathVariable String filename) {
    try {
      List<Purchase> purchases = purchaseService.readPurchases(filename);
      return new ResponseEntity<>(purchases, HttpStatus.OK);
    } catch (IOException e) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @PutMapping("/overwrite/{filename}")
  public ResponseEntity<Void> overwritePurchases(@PathVariable String filename, @RequestBody List<Purchase> purchases) {
    try {
      purchaseService.overwritePurchases(filename, purchases);
      return new ResponseEntity<>(HttpStatus.OK);
    } catch (IOException e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @GetMapping("/exists/{filename}")
  public ResponseEntity<Boolean> fileExists(@PathVariable String filename) {
    return new ResponseEntity<>(purchaseService.fileExists(filename), HttpStatus.OK);
  }

  @GetMapping("/list")
  public ResponseEntity<List<String>> listAllFiles() {
    return new ResponseEntity<>(purchaseService.listAllFiles(), HttpStatus.OK);
  }

  @DeleteMapping("/delete/{filename}")
  public ResponseEntity<Void> deleteFile(@PathVariable String filename) {
    purchaseService.deleteFile(filename);
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @DeleteMapping("/delete/all")
  public ResponseEntity<Void> deleteAllFiles() {
    purchaseService.deleteAllFiles();
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
