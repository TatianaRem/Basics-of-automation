package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTestJUnitJupiter {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldAdd0For1000AmountJ() {

        assertEquals(0, service.remain(1000));
    }

    @Test
    public void shouldAdd1For999AmountJ() {

        assertEquals(1, service.remain(999));
    }

    @Test
    public void shouldAdd999For1001Amount() {

        assertEquals(999, service.remain(1001));
    }

    @Test
    public void shouldAdd1000For0Amount() {

        assertEquals(1000, service.remain(0));
    }

    @Test
    public void shouldAdd500For500Amount() {

        assertEquals(500, service.remain(500));
    }

    @Test
    public void shouldAdd100For900Amount() {

        assertEquals(100, service.remain(900));
    }

    @Test
    public void shouldAdd900For1100Amount() {

        assertEquals(900, service.remain(1100));
    }

    @Test
    public void shouldAdd500For1500Amount() {

        assertEquals(500, service.remain(1500));
    }
}
