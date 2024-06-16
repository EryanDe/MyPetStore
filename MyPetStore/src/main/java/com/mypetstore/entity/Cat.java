package com.mypetstore.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Represents a cat, which is a specific type of animal.
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Cat extends com.mypetstore.entity.Animal {
    @Column(name = "chip_id")
    private String chipId;
    public Cat(String chipId, LocalDateTime birth, String color, PetStore petStore) {
        super(null, birth, color, petStore);
        this.chipId = chipId;
    }
}
