
package webapp.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import webapp.demo.model.Counter;

public interface CounterRepository extends JpaRepository<Counter, Long> {
}
