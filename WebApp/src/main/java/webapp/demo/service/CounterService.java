package webapp.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webapp.demo.model.Counter;
import webapp.demo.repository.CounterRepository;

@Service
public class CounterService {


    @Autowired
    CounterRepository counterRepository;

    public Counter getCounter() {

        Counter counter = counterRepository.findById(new Long(1)).orElse(null);

        if (counter == null){
            counter = new Counter();
            counter.setId(new Long(1));
            counter.setCountNumber(1);
        }else{
            counter.setCountNumber(counter.getCountNumber()+1);
        }

        counterRepository.save(counter);
        return counter;

    }

    public Counter getCounter2() {

        Counter counter = counterRepository.findById(new Long(1)).orElse(null);

        if (counter == null){
            counter = new Counter();
            counter.setId(new Long(1));
            counter.setCountNumber2(1);
        }else{
            counter.setCountNumber2(counter.getCountNumber()+1);
        }

        counterRepository.save(counter);
        return counter;

    }
}
