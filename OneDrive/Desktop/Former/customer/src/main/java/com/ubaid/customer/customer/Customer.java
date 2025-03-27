package com.ubaid.customer.customer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Builder;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;


@Builder
@Data

@Entity
public class Customer {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private Address address;
    private String equipment;

//    @Lob  // To store large objects
//    private byte[] file;
//    // profile image
//    ArrayList<Product> products;
}


