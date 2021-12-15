package lima.leandro.FinalProjectWebIII.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/")
    public ResponseEntity<String> index() {
        return new ResponseEntity<String>(
                "Bem-vind@ ao site da Union Of Clouds",
                new HttpHeaders(),
                HttpStatus.OK
        );
    }
}
