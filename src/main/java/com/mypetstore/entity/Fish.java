package com.mypetstore.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Represents a fish, which is a specific type of animal.
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Fish extends com.mypetstore.entity.Animal {

    @Enumerated(EnumType.STRING)
    @Column(name="livingEnv")
    private FishLivEnv livingEnv;
    public Fish(FishLivEnv livingEnv, LocalDateTime birth, String color, PetStore petStore) {
        super(null, birth, color, petStore);
        this.livingEnv = livingEnv;
    }

}
