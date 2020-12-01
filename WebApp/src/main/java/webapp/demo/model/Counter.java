package webapp.demo.model;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;

//@Entity(name ="counter")
public class Counter {

    //@Id
    private Long id;

    //@Column(name = "countNumber", nullable = false)
    private int countNumber;

    public Counter(){}

    public Counter(Long id, int countNumber) {
        this.id = id;
        this.countNumber = countNumber;
    }

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
}
