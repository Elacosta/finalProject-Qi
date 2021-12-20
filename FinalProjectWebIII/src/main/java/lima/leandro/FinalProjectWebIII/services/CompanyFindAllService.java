package lima.leandro.FinalProjectWebIII.services;

import lima.leandro.FinalProjectWebIII.model.CompanyEntity;
import lima.leandro.FinalProjectWebIII.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyFindAllService {

    @Autowired
    private CompanyRepository companyRepository;

    public List<CompanyEntity> findAll() {
        return (List<CompanyEntity>) this.companyRepository.findAll();
    }
}
