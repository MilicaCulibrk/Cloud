package webapp.demo.Controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin
@RequestMapping("/hello_world")
@Controller
public class HelloWorldController {

    @GetMapping()
    public ResponseEntity<String> getHelloWorld(){
        return new ResponseEntity<>("Hello World", HttpStatus.OK) ;
    }

}
