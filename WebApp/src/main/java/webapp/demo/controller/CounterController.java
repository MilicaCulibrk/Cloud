package webapp.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import webapp.demo.model.Counter;
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

        Counter counter = null;

        if(System.getenv("HOST").equals("host1")){
            counter = counterService.getCounter();
        }else{
            counter = counterService.getCounter2();
        }

        return new ResponseEntity<>("Current host: " + System.getenv("HOST") + "\n Host 1: " + counter.getCountNumber() + "\n Host 2: " + counter.getCountNumber2(), HttpStatus.OK) ;

    }

    @GetMapping(path = "/environment_variables", produces = "application/json")
    public ResponseEntity getEnvironmentVariables() {

        List<Object> environmentVariables = new ArrayList<>();
        environmentVariables.add(System.getenv("DATABASE_DOMAIN"));
        environmentVariables.add(System.getenv("DATABASE_PORT"));
        environmentVariables.add(System.getenv("POSTGRES_DB"));
        environmentVariables.add(System.getenv("POSTGRES_USER"));
        environmentVariables.add(System.getenv("POSTGRES_PASSWORD"));
        environmentVariables.add(System.getenv("HOST"));

        return new ResponseEntity<>(environmentVariables, HttpStatus.OK) ;
    }

}
