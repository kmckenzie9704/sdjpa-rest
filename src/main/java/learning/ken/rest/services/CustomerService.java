package learning.ken.rest.services;

import learning.ken.rest.domain.Customer;

import java.util.List;

public interface CustomerService {

    Customer findCustomerById(Long id);


    List<Customer> findAllCustomers();
}
