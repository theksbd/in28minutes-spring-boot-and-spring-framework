package com.theksbd.firstspringproject;

import com.theksbd.firstspringproject.game.GameRunner;
import com.theksbd.firstspringproject.game.MarioGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {
        var game = new MarioGame();
//        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);

        gameRunner.run();
    }
}
