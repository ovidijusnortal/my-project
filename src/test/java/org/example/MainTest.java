package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void buildGreeting() {
        assertEquals("Hello World!", Main.buildGreeting("World"));
    }

    @Test
    void buildGreeting2() {
        assertEquals("Hello Worlds!", Main.buildGreeting("Worlds"));
    }

    @Test
    void buildGreeting3() {
        assertEquals("Hello Planet!", Main.buildGreeting("Planet"));
    }

    @Test
    void buildGreeting4() {
        assertEquals("Hello Universes!", Main.buildGreeting("Universe"));
    }
}