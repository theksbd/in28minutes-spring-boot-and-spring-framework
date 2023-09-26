package com.theksbd.firstspringproject.game;

public class GameRunner {
    //    private MarioGame game;
    //    private SuperContraGame game;
    private GamingConsole game;

//    public GameRunner(MarioGame game) {
//        this.game = game;
//    }

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game:" + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
