package lima.leandro.FinalProjectWebIII.services;

import lima.leandro.FinalProjectWebIII.model.CompanyEntity;
import lima.leandro.FinalProjectWebIII.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyUpdateService {

    @Autowired
    private CompanyRepository companyRepository;

    public CompanyEntity update(CompanyEntity companyEntity) {
        return this.companyRepository.save(companyEntity);
    }

}
