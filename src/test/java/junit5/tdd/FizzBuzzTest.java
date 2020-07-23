package junit5.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FizzBuzzTest {
    @Test
    public void should_return_1_when_count_of_given_1(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 1;
        //when
        String output = fizzBuzz.play(inputNumber);
        //then
        Assertions.assertEquals("1",output);
    }

    @Test
    public void should_return_fizz_when_count_of_given_3(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 3;
        //when
        String output = fizzBuzz.play(inputNumber);
        //then
        Assertions.assertEquals("Fizz",output);
    }

    @Test
    public void should_return_buzz_when_count_of_given_5(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 5;
        //when
        String output = fizzBuzz.play(inputNumber);
        //then
        Assertions.assertEquals("Buzz",output);
    }

    @Test
    public void should_return_fizzbuzz_when_count_of_given_15(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 15;
        //when
        String output = fizzBuzz.play(inputNumber);
        //then
        Assertions.assertEquals("FizzBuzz",output);
    }
}
