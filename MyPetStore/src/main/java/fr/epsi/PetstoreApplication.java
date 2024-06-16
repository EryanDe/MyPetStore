package fr.epsi;

import com.mypetstore.entity.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@SpringBootApplication
public class PetstoreApplication {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("petstorePU");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();

        // Insertion d'enregistrements dans les tables

        // Adresse
        Address address1 = new Address("1", "Rue de la Fontaine", "12345", "VilleA", null);
        Address address2 = new Address("2", "Avenue des Roses", "54321", "VilleB", null);
        Address address3 = new Address("3", "Boulevard du Soleil", "67890", "VilleC", null);
        entityManager.persist(address1);
        entityManager.persist(address2);
        entityManager.persist(address3);

        // Animal
        Animal animal1 = new Animal(null, LocalDateTime.now().minusYears(2), "Brown", null);
        Animal animal2 = new Animal(null, LocalDateTime.now().minusYears(1), "White", null);
        Animal animal3 = new Animal(null, LocalDateTime.now().minusMonths(6), "Black", null);
        entityManager.persist(animal1);
        entityManager.persist(animal2);
        entityManager.persist(animal3);

        // Cat
        Cat cat1 = new Cat("123ABC", LocalDateTime.now().minusYears(1), "Orange", null);
        Cat cat2 = new Cat("456DEF", LocalDateTime.now().minusYears(2), "Gray", null);
        Cat cat3 = new Cat("789GHI", LocalDateTime.now().minusMonths(6), "White", null);
        entityManager.persist(cat1);
        entityManager.persist(cat2);
        entityManager.persist(cat3);

        // Fish
        Fish fish1 = new Fish(FishLivEnv.FRESH_WATER, LocalDateTime.now().minusYears(1), "Gold", null);
        Fish fish2 = new Fish(FishLivEnv.SEA_WATER, LocalDateTime.now().minusYears(2), "Silver", null);
        Fish fish3 = new Fish(FishLivEnv.FRESH_WATER, LocalDateTime.now().minusMonths(6), "Blue", null);
        entityManager.persist(fish1);
        entityManager.persist(fish2);
        entityManager.persist(fish3);



        entityManager.getTransaction().commit();
        entityManager.close();
        emf.close();
    }
}
