package webapp.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import webapp.demo.service.CounterService;

@CrossOrigin
@RequestMapping("/counter")
@Controller
public class CounterController {

    @Autowired
    CounterService counterService;

    @GetMapping(path = "", produces = "application/json")
    public ResponseEntity getCounter() {

        int counter = counterService.getCounter();

        return new ResponseEntity<>(counter, HttpStatus.OK) ;
    }

}
