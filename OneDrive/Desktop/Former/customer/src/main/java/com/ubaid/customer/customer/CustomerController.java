package com.ubaid.customer.customer;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerRepository repository;
    private final CustomerService service;
    @PostMapping
    public ResponseEntity<String> createCustomer(
            @RequestBody @Valid CustomerRequest request
    ){
        return ResponseEntity.ok(this.service.createCustomer(request));
    }
    @PutMapping
    public ResponseEntity<String> updateCustomer(
            @RequestBody @Valid CustomerRequest request
    ){
        this.service.updateCustomer(request);
        return ResponseEntity.accepted().build();
    }

    @GetMapping
    public ResponseEntity<List<CustomerResponse>> findAll(){
        return ResponseEntity.ok(this.service.findAllCustomer());
    }

    @GetMapping("/{customer-id}")
    public ResponseEntity<CustomerResponse> findById(
            @PathVariable("customer-id") String customerId
    ) {
        return ResponseEntity.ok(this.service.findById(customerId));
    }

    @DeleteMapping("/{customer-id}")
    public ResponseEntity<Void> delete(
            @PathVariable("customer-id") String customerId
    ) {
        this.service.deleteCustomer(customerId);
        return ResponseEntity.accepted().build();
    }
    @PostMapping("/profileImg/{id}")
    public ResponseEntity<String> addProfileImg(@PathVariable String id, @RequestPart("profile")MultipartFile profile) throws IOException {
        Customer customer=repository.findById(id).get();
        customer.setProfile(profile.getBytes());
        repository.save(customer);
        return ResponseEntity.ok("Profile image updated successfully !");
    }
    @PostMapping("/productImg/{id}")
    public ResponseEntity<String> addProductImg(@PathVariable String id, @RequestPart("product")MultipartFile product) throws IOException {
        Customer customer=repository.findById(id).get();
        customer.setProducts(product.getBytes());
        repository.save(customer);
        return ResponseEntity.ok("Product image updated successfully !");
    }
}
