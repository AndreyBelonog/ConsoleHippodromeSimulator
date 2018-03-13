package com.company;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    private void move(){

    }

    private void print(){

    }

    private void run(){
        for(int i = 0; i < 100; i++){
            move();
            print();
            try{
                Thread.sleep(200);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        game = new Hippodrome(new ArrayList<>());
        game.horses.add(new Horse("First", 3,0));
        game.horses.add(new Horse("Second", 3,0));
        game.horses.add(new Horse("Third", 3,0));
        game.horses.add(new Horse("Fourth", 3,0));
        game.horses.add(new Horse("Fifth", 3,0));
    }
}
