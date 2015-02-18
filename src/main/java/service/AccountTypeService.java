package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AccountTypeRepository;

/**
 * Created by Mélina on 18/02/2015.
 */
@Service
public class AccountTypeService {

        @Autowired
        private AccountTypeRepository accountTypeRepository;
    }
