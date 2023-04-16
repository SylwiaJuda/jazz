package pjwstk.zjazd3;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sandbox")

public class Controller {
 @GetMapping("/hello")
    public ResponseEntity<String> hello(){
     return ResponseEntity.ok("Hello");
 }
}
