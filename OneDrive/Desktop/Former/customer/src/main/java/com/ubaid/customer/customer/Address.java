package com.ubaid.customer.customer;

import jakarta.persistence.Embeddable;
import lombok.*;
import org.springframework.validation.annotation.Validated;

//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//@Getter
//@Setter
@Embeddable
public class Address {
    private String street;
    private String houseNumber;
    private String zipCode;
    private String district;
    private String landMark;
}
