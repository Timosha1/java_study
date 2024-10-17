package org.example.hw_clock;

public class Main {
    public static void main(String[] args) {
    Clock clock = new Clock(13, 45, 28 );
    clock.currentTime();
    clock.tick();
    clock.currentTime();
    clock.tick();
    clock.currentTime();
    clock.tick();
    clock.currentTime();
    }
}
