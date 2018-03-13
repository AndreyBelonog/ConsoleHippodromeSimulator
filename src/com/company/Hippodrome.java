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
        for(Horse h : horses){
            h.move();
        }
    }

    private void print(){
        for(Horse h : horses){
            h.print();
        }
        for(int i = 0; i < 10; i++){
            System.out.println();
        }
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

    public Horse getWinner(){
        Horse winner = new Horse("Temp", 0d, 0d);
        double maxDistance = 0d;

        for(Horse h : horses){
            if (h.getDistance() > maxDistance){
                winner = h;
                maxDistance = h.getDistance();
            }
        }
        return winner;
    }

    public void printWinner(){
        System.out.printf("Winner is %s!", game.getWinner().getName());
    }



    public static void main(String[] args) {
        game = new Hippodrome(new ArrayList<>());
        game.horses.add(new Horse("First", 3d,0d));
        game.horses.add(new Horse("Second", 3d,0d));
        game.horses.add(new Horse("Third", 3d,0d));
        game.horses.add(new Horse("Fourth", 3d,0d));
        game.horses.add(new Horse("Fifth", 3d,0d));

        game.run();
        game.printWinner();
    }
}
