package cointoss;

import java.util.Random;

public class CoinToss {
    
    public String tossCoin() {
        Random rand = new Random();
        int toss = Math.abs(rand.nextInt()) % 2;
        // divisible by 2? will tell if heads or tails
        // rand will generate any number, can be in billions
        // mod will determine if divisible by 2:
        // true or false scenario (e.g. heads or tails)
        if (toss == 0) {
            return "HEADS";
        }
        else {
            return "TAILS";
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        CoinToss game = new CoinToss();
        game.tossCoin();
        System.out.println(game.tossCoin());
        System.out.println(game.tossCoin());
        System.out.println(game.tossCoin());
        System.out.println(game.tossCoin());
        System.out.println(game.tossCoin());
    }
    
}
