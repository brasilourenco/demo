package com.example.demo.controller;

import com.example.demo.command.CustomerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/customer")
public class RestCustomerController {

    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public ResponseEntity<List<CustomerDto>> listCustomers() {
        CustomerDto customerDto1 = new CustomerDto();
        customerDto1.setId(1);
        customerDto1.setEmail("manuel@ac.com");
        customerDto1.setFirstName("Manuel");
        customerDto1.setLastName("José");
        customerDto1.setPhone("965845563");

        CustomerDto customerDto2 = new CustomerDto();
        customerDto2.setId(2);
        customerDto2.setEmail("pedro@ac.com");
        customerDto2.setFirstName("Pedro");
        customerDto2.setLastName("Miguel");
        customerDto2.setPhone("963845563");

        List<CustomerDto> customerDtos = new ArrayList<>();
        customerDtos.add(customerDto1);
        customerDtos.add(customerDto2);

        return new ResponseEntity<>(customerDtos, HttpStatus.OK);
    }
}
