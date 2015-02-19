package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by Mélina on 18/02/2015.
 */
@Repository
public interface AccountRepository extends CrudRepository<AccountRepository, Long> {

}
