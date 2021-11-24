package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateBonus() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(actual,expected);

    }
}