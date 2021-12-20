package lima.leandro.FinalProjectWebIII.controller;

import lima.leandro.FinalProjectWebIII.model.CompanyEntity;
import lima.leandro.FinalProjectWebIII.repository.CompanyRepository;
import lima.leandro.FinalProjectWebIII.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

/**
 * @author Leandro Lima
 * @since 14/12/2021 - 21:27
 * @version CLOUD 1.0.0
 * @category controller
 */

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanySaveService companySaveService;

    @Autowired
    private CompanyUpdateService companyUpdateService;

    @Autowired
    private CompanyFindByIdService companyFindByIdService;

    @Autowired
    private CompanyFindAllService companyFindAllService;

    @Autowired
    private CompanyDeleteService companyDeleteService;

    @PostMapping()
    public ResponseEntity<CompanyEntity> save(@RequestBody CompanyEntity companyEntity) {

        return new ResponseEntity<CompanyEntity>(
                this.companySaveService.save(companyEntity),
                new HttpHeaders(),
                HttpStatus.CREATED
        );
    }

    @GetMapping()
    public ResponseEntity<List<CompanyEntity>> findAll() {
        return new ResponseEntity<List<CompanyEntity>>(
                this.companyFindAllService.findAll(),
                new HttpHeaders(),
                HttpStatus.OK
        );
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<CompanyEntity>> findById(@PathVariable("id") long id) {
        return new ResponseEntity<Optional<CompanyEntity>>(
                this.companyFindByIdService.findById(id),
                new HttpHeaders(),
                HttpStatus.OK
        );
    }

    @PutMapping()
    public ResponseEntity<CompanyEntity> update(@RequestBody CompanyEntity companyEntity) {
        return new ResponseEntity<CompanyEntity>(
                this.companyUpdateService.update(companyEntity),
                new HttpHeaders(),
                HttpStatus.OK
        );
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<HashMap<String, String>> delete(@PathVariable("id") long id) {

        HashMap<String, String> map = new HashMap<>();
        if (this.companyDeleteService.deleteById(id)) {
            map.put("success", "true");
            map.put("message", "excluído com sucesso");
            return new ResponseEntity<HashMap<String, String>>(
                    map,
                    new HttpHeaders(),
                    HttpStatus.OK
            );
        } else {
            map.put("success", "false");
            map.put("message", "Código inválido");

            return new ResponseEntity<HashMap<String, String>>(
                    map,
                    new HttpHeaders(),
                    HttpStatus.NOT_FOUND
            );
        }
    }
}
