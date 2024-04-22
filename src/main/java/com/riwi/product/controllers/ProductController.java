package com.riwi.product.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.riwi.product.entities.Product;
import com.riwi.product.services.service_abstract.IProductService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/product")
@AllArgsConstructor
public class ProductController {

      //inyectar la interfaz del servicio
  @Autowired
    private final IProductService productService;

  @GetMapping
  public ResponseEntity<List<Product>> getAll(){
    //SB ya tiene por defecto una llave para responder

    return ResponseEntity.ok(this.productService.getAll());
  }
}
