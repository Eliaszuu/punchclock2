package ch.axa.its.punchclock.domain;
 
import java.time.LocalDateTime;
 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
 
@Entity
@Table(name = "entry")
public class Entry {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
 
 
    private LocalDateTime checkIn;
 
 
    private LocalDateTime checkOut;
 
    private String description;
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
}