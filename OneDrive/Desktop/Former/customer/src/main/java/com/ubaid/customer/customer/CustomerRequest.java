package com.ubaid.customer.customer;

import jakarta.persistence.Lob;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;

public record CustomerRequest(
        String id,
        @NotNull(message = "Customer first Name is Required")
        String firstName,
        @NotNull(message = "Customer last Name is Required")
        String lastName,
        @NotNull(message = "Customer email is Required")
        @Email(message = "Customer Email is not valid")
        String email,
        Address address,
        String equipment

) {
}
