package fr.unica.miage.donati.dice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiceController {

    @Autowired
    private Dice dice;

    @RequestMapping("/rollDice")
    public String roll(){
        return "" + dice.roll();
    }

    @GetMapping("/rollDices/{id}")
    public String rollMultiple(@PathVariable Long id){
        String res = "";
        for(int i = 0; i < id; i++){
            res += dice.roll() + " ";
        }
        return res;
    }
}
