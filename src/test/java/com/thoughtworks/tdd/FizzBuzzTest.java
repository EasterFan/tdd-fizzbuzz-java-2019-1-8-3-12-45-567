package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class FizzBuzzTest {

    private Main game = new Main();

    @Test
    public void should_return_Fizz_when_have_3() {
        assertThat(game.getResult(13),equalTo("Fizz"));
    }

    @Test
    public void should_return_Fizz_when_only_divide_3(){
        assertThat(game.getResult(9),equalTo("Fizz"));
        assertThat(game.getResult(12),equalTo("Fizz"));
    }

    @Test
    public void should_return_Buzz_when_only_divide_5_and_not_have_3(){
        assertThat(game.getResult(10),equalTo("Buzz"));
        assertThat(game.getResult(50),equalTo("Buzz"));
    }

    @Test
    public void should_return_Whizz_when_only_divide_7_and_not_have_3(){
        assertThat(game.getResult(14),equalTo("Whizz"));
        assertThat(game.getResult(28),equalTo("Whizz"));
    }

    @Test
    public void should_return_FizzBuzz_when_divide_3_and_5_and_not_have_3(){
        assertThat(game.getResult(60),equalTo("FizzBuzz"));
    }

    @Test
    public void should_return_FizzWhizz_when_divide_3_and_7_and_not_have_3(){
        assertThat(game.getResult(21),equalTo("FizzWhizz"));
        assertThat(game.getResult(42),equalTo("FizzWhizz"));
    }

    @Test
    public void should_return_BuzzWhizz_when_divide_5_and_7_and_not_have_3(){
        assertThat(game.getResult(140),equalTo("BuzzWhizz"));
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_divide_3_and_5_and_7_and_not_have_3(){
        assertThat(game.getResult(210),equalTo("FizzBuzzWhizz"));
    }
}