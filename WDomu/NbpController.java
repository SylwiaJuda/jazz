package nbp.nbp.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/nbp")
public class NbpController {

    @GetMapping(value = "")
    public ResponseEntity<String>getXd(){
        return ResponseEntity.ok("XD");
    }
}
