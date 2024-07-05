package ch.axa.its.punchclock.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "tag")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;
}