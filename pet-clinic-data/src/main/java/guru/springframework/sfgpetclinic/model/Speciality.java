package guru.springframework.sfgpetclinic.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "specialities")
@Getter
@Setter
@NoArgsConstructor
public class Speciality extends BaseEntity{

    @Column(name = "description")
    private String description;

    @ManyToMany(mappedBy = "specialities")
    private Set<Vet> vets;
}
