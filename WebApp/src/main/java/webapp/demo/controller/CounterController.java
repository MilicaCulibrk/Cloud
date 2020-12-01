package webapp.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import webapp.demo.service.CounterService;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RequestMapping("")
@Controller
public class CounterController {

    @Autowired
    CounterService counterService;

    @GetMapping(path = "/counter", produces = "application/json")
    public ResponseEntity getCounter() {

        //int counter = counterService.getCounter();

        return new ResponseEntity<>("milica", HttpStatus.OK) ;

    }

    @GetMapping(path = "/environment_variables", produces = "application/json")
    public ResponseEntity getEnvironmentVariables() {

        List<Object> environmentVariables = new ArrayList<>();
        environmentVariables.add(System.getenv("DB_URL"));
        environmentVariables.add(System.getenv("DB_USERNAME"));
        environmentVariables.add(System.getenv("DB_PASSWORD"));

        return new ResponseEntity<>(environmentVariables, HttpStatus.OK) ;
    }

}
