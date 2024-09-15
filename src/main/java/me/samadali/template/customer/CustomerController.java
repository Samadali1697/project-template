package me.samadali.template.customer;

import lombok.AllArgsConstructor;
import lombok.val;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@AllArgsConstructor
public class CustomerController {
    private CustomerRepository customerRepository;

    @GetMapping(value = "/customers", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<List<String>> customers() {
        val customers = customerRepository.findAll();
        return new ResponseEntity<>(customers.stream().map(Customer::getFirstName).toList(), HttpStatus.OK);
    }
}
