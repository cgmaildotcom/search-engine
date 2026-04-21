package searchengine.secgmaildotcom.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Pesonality")
public class PersonalityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "dateOfBirth", nullable = false)
    private LocalDate dateOfBirth;
    @Column(name = "dateOfDeath", nullable = true)
    private LocalDate dateOfDeath;
    @Column(name = "education", nullable = true)
    private String education;
    @Column(name = "children", nullable = true)
    private String children;
    @Column(name = "spouse", nullable = true)
    private String spouse;
    @Column(name = "biography", nullable = false)
    private String biography;
}
