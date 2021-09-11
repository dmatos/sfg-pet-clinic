package guru.springframework.sfgpetclinic.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "visits")
@NoArgsConstructor
@Getter
@Setter
public class Visit extends BaseEntity{
    @Column(name = "date")
    private LocalDate date;
    @Column(name="description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet; //instead of pet id like the original
}
