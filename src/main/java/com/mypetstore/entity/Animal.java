package com.mypetstore.entity;
import com.mypetstore.entity.PetStore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;

/**
 * Represents an animal in a pet store. This class is a base class for specific types of animals.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
@Table(name = "animal", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"birth", "color"})
})
public class Animal {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "birth")
    private LocalDateTime birth;
    @Column(name = "color")
    private String Color;

    /**
     * The pet store where this animal is housed.
     * This relationship is many-to-one, as a pet store can house multiple animals.
     */
    @ManyToOne
    @JoinColumn(name="pet_Store_Id")
    private PetStore petStore;

}
