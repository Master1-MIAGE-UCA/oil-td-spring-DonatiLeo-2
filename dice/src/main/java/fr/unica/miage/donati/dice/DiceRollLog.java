package fr.unica.miage.donati.dice;

import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
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
    private LocalDateTime timestamp;

    public void setResults(String results){
        this.results = results;
    }

    public String getResults(){
        return results;
    }

    //public void addResult(int result){
    //    results += result + " ";
    //}

    //public int getResult(int ind){
    //    return Integer.parseInt(results.split(" ")[ind]);
    //}
}
