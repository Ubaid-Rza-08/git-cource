package com.ubaid.customer.customer;

import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {
    public Customer toCustomer(CustomerRequest request){
        if(request == null){
            return null;
        }
        Customer customer=new Customer();
        customer.setId(request.id());
        customer.setAddress(request.address());
        customer.setEmail(request.email());
        customer.setEquipment(request.equipment());
        customer.setFirstName(request.firstName());
        customer.setLastName(request.lastName());


        return customer;
//        return Customer.builder()
//                .id(request.id())
//                .firstName(request.firstName())
//                .lastName(request.lastName())
//                .email(request.email())
//                .address(request.address())
//                .build();
    }

    public CustomerResponse fromCustomer(Customer customer){
        if(customer == null){
            return null;
        }
        return new CustomerResponse(
                customer.getId(),
                customer.getFirstName(),
                customer.getLastName(),
                customer.getEmail(),
                customer.getAddress(),
                customer.getEquipment()
        );
    }
}
