package guru.springframework.sfgpetclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "types")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PetType extends BaseEntity{

    @Column(name = "name")
    private String name;

    public PetType(Long id, String name) {
        super(id);
        this.name = name;
    }
}
