package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CashbackHackServiceTest {
    public CashbackHackService hacker = new CashbackHackService();

    @Test
    public void shouldReturn0WhenDivisibleBy1000() {
        Assert.assertEquals(hacker.remain(5000), 0);
    }

    @Test
    public void shouldReturn1000When1000() {
        Assert.assertEquals(hacker.remain(1000), 0);
    }

    @Test
    public void shouldReturn999When1() {
        Assert.assertEquals(hacker.remain(1), 999);
    }

    @Test
    public void shouldReturn580When420() {
        Assert.assertEquals(hacker.remain(420), 580);
    }

    @Test
    public void shouldReturn1When999() {
        Assert.assertEquals(hacker.remain(999), 1);
    }

    @Test
    public void shouldReturn499When2501() {
        Assert.assertEquals(hacker.remain(2501), 499);
    }

    @Test
    public void jupiter_ShouldReturn0WhenDivisibleBy1000() {
        Assertions.assertEquals(hacker.remain(5000), 0);
    }

    @Test
    public void jupiter_ShouldReturn1000When1000() {
        Assertions.assertEquals(hacker.remain(1000), 0);
    }

    @Test
    public void jupiter_ShouldReturn999When1() {
        Assertions.assertEquals(hacker.remain(1), 999);
    }

    @Test
    public void jupiter_ShouldReturn580When420() {
        Assertions.assertEquals(hacker.remain(420), 580);
    }

    @Test
    public void jupiter_ShouldReturn1When999() {
        Assertions.assertEquals(hacker.remain(999), 1);
    }

    @Test
    public void jupiter_ShouldReturn499When2501() {
        Assertions.assertEquals(hacker.remain(2501), 499);
    }
}
