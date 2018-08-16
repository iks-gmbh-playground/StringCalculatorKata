package stringCalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	private StringCalculator calc;

	@BeforeEach
	void setUp() {
		calc = new StringCalculator();
	}

	@Test
	void returnZeroWhenInputNothing() {
		// Arrange
		String var = "";
		int expected = 0;

		// Act
		int actual = calc.add(var);

		// Assert
		assertEquals(expected, actual);
	}

	@Test
	void return1WhenInputIsOne() {
		// Arrange
		int expected = 1;
		String var = "1";

		// Act
		int actual = calc.add(var);

		// Assert
		assertEquals(expected, actual);
	}
	
	@Test
	void return2WhenInputIsTwo() {
		// Arrange
		int expected = 2;
		String var = "2";

		// Act
		int actual = calc.add(var);

		// Assert
		assertEquals(expected, actual);
	}
	
	@Test
	void return7WhenInput3Komma4() {
		// Arrange
		String input = "3,4";
		int expected = 7;
		
		// Act
		int actual = calc.add(input);
		
		//Assert
		assertEquals(expected, actual);
	}
	
	@Test
	void returnSumWhenMultipleInput() {
		//Arrange
		String input = "3,5";
		int expected = 8;
		
		//Act
		int actual = calc.add(input);
		
		//Assert
		assertEquals(expected, actual);
	}
	
	@Test
	void returnSumWhenAmountOfInputIsUnknown() {
		
		//Arrange
		String input = "3,7,120,3";
		int expected = 133;
		
		//Act
		int actual = calc.add(input);
		
		//Assert
		assertEquals(expected, actual);
	
	}
	
	@Test
	void returnSumIfThereAreEmptyValues() {
		
		//Arrange
		String input = "3,7,,120,3,";
		int expected = 133;
		
		//Act
		int actual = calc.add(input);
		
		//Assert
		assertEquals(expected, actual);
	
	}
	
	@Test
	void returnSumIfThereAreEmptyValuesOrSpaces() {
		
		//Arrange
		String input = "3,7,, , 120,3,";
		int expected = 133;
		
		//Act
		int actual = calc.add(input);
		
		//Assert
		assertEquals(expected, actual);
	
	}

}
