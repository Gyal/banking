package fr.iut.lpcsid.bankingProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.iut.lpcsid.bankingProject.repository.CustomerRepository;

/**
 * Created by Mélina on 18/02/2015.
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
}
