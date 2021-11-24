package ru.netology;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateBonus() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2100;
        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(actual, expected);

    }
}