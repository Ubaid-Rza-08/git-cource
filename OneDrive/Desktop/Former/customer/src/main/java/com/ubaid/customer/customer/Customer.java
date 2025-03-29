package com.ubaid.customer.customer;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;


//@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private Address address;
    private String equipment;
    @Lob  // To store large objects
    private byte[] profile;
    // profile image
    @Lob
    byte[] products;
}


