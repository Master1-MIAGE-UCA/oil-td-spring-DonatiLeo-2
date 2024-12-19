package fr.unica.miage.donati.dice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiceController {

    @Autowired
    private DiceService diceService;

    @RequestMapping("/rollDice")
    public String roll(){
        return diceService.rollDices(1);
    }

    @GetMapping("/rollDices/{id}")
    public String rollMultiple(@PathVariable Long id){
        return diceService.rollDices(id.intValue());
    }
}
