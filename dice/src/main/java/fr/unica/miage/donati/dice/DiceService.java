package fr.unica.miage.donati.dice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiceService {
    @Autowired
    private DiceRepository diceRepository;

    @Autowired
    private Dice dice;

    public String rollDices(int number) {
        String res = "";
        for(int i = 0; i < number; i++){
            res += dice.roll() + " ";
        }
        DiceRollLog log = new DiceRollLog();
        log.setResults(res);
        diceRepository.save(log);
        return res;
    }
}
