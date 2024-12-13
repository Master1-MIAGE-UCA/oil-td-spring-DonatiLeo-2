package fr.unica.miage.donati.dice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

@Entity
public class DiceRollLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int diceCount;
    //stores results of dice rolls
    private String results;

    @CreationTimestamp
    //add a timestamp to the log
    private long timestamp;
}
