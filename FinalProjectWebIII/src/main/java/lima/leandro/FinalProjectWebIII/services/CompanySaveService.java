package lima.leandro.FinalProjectWebIII.services;

import lima.leandro.FinalProjectWebIII.model.CompanyEntity;
import lima.leandro.FinalProjectWebIII.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanySaveService {

    @Autowired
    private CompanyRepository companyRepository;

    public CompanyEntity save(CompanyEntity companyEntity) {
        if (companyEntity.getCompanyName().length() > 3) {
            return this.companyRepository.save(companyEntity);
        }
        return null;
    }
}
