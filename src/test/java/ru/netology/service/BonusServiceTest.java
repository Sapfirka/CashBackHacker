package ru.netology.service;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest {

    @Test
    public void calculateBonus() {
        int amount = 2000;
        int expected = 10;
        BonusService service = new BonusService();
        int actual = service.calculateBonus(amount);
        assertEquals(expected, actual);
    }
}