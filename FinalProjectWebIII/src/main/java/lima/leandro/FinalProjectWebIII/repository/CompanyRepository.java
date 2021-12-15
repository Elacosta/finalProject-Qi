package lima.leandro.FinalProjectWebIII.repository;

import lima.leandro.FinalProjectWebIII.model.CompanyEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Leandro Lima
 * @since 14/12/2021 - 21:28
 * @version CLOUD 1.0.0
 * @category repository
 */
@Repository
public interface CompanyRepository extends CrudRepository<CompanyEntity, Long>{

}
