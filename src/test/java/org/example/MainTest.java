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
        assertEquals("Hello World!", Main.buildGreeting("Worlds"));
    }

    @Test
    void buildGreeting3() {
        assertEquals("Hello Planet!", Main.buildGreeting("Planet"));
    }
}