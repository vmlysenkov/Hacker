package ru.netology;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateBonus() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);

    }
}