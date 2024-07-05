package ch.axa.its.punchclock.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Data
@Table(name = "entry")
public class Entry {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(nullable = false)
    private LocalDateTime checkIn;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(nullable = false)
    private LocalDateTime checkOut;

    @NotBlank(message = "description can't be empty")
    private String description;
}