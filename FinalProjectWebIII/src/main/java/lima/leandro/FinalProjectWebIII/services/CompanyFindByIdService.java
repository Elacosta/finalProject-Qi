package lima.leandro.FinalProjectWebIII.services;

import lima.leandro.FinalProjectWebIII.model.CompanyEntity;
import lima.leandro.FinalProjectWebIII.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyFindByIdService {

    @Autowired
    private CompanyRepository companyRepository;

    public Optional<CompanyEntity> findById(long id) {
        return this.companyRepository.findById(id);
    }
}
