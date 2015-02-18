package repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Mélina on 18/02/2015.
 */
@Repository
public interface AccountRepository extends CrudRepository<AccountRepository, Long>{

}
