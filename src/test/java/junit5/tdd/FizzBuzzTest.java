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
    public void should_return_3_when_count_of_given_3(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 3;
        //when
        String output = fizzBuzz.play(inputNumber);
        //then
        Assertions.assertEquals("Fizz",output);
    }

    @Test
    public void should_return_5_when_count_of_given_5(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 5;
        //when
        String output = fizzBuzz.play(inputNumber);
        //then
        Assertions.assertEquals("Buzz",output);
    }
}
