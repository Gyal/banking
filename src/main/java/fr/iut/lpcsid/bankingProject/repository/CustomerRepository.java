package fr.iut.lpcsid.bankingProject.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Mélina on 18/02/2015.
 */
@Repository
public interface CustomerRepository extends CrudRepository<CustomerRepository, Long>{

}
