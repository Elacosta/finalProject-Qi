package lima.leandro.FinalProjectWebIII.services;

import lima.leandro.FinalProjectWebIII.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyDeleteService {
    @Autowired
    private CompanyRepository companyRepository;

    public boolean deleteById(long id) {
        if (this.companyRepository.existsById(id)) {
            this.companyRepository.deleteById(id);
            return true;
    } else {
            return false;
        }
    }
}