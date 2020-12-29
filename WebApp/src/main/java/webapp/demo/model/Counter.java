package webapp.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name ="counter")
public class Counter {

    @Id
    private Long id;

    @Column(name = "countNumber", nullable = false)
    private int countNumber;

    @Column(name = "countNumber2", nullable = false)
    private int countNumber2;

    public Counter(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCountNumber() {
        return countNumber;
    }

    public void setCountNumber(int countNumber) {
        this.countNumber = countNumber;
    }

    public int getCountNumber2() {
        return countNumber2;
    }

    public void setCountNumber2(int countNumber2) {
        this.countNumber2 = countNumber2;
    }
}
