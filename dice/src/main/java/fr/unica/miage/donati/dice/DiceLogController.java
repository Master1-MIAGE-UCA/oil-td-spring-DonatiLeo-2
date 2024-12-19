package fr.unica.miage.donati.dice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiceLogController {

    @Autowired
    private DiceRepository diceRepository;

    @RequestMapping("/diceLogs")
    public Iterable<DiceRollLog> getDiceLogs(){
        return diceRepository.findAll();
    }

}
