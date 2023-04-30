public testAddOneNumber(){
	int actualSum = Calculator.add([3]);
	int expectedSum = 3;

	// checking program state
	assertThat(actualSum, is(expectedSum));
}

public testAddSeveralNumbers(){
	int actualSum = Calculator.add([3, 5, 7, 9]);
	int expectedSum = 24;

	// checking program state
	assertThat(actualSum, is(expectedSum));
}


// Once we are used to the format for asserting assumptions in our tests, we can shorten our test code

public testAddSeveralNumbers(){
	assertThat(Calculator.add([3, 5, 7, 9], is(24)))
}


// As we'll notice in the stencil files, annotations appear at the top of a method, example:

@Test 
public testAddOneNumber(){
	int actualSum = Calculator.add([3]);
	int expectedSum = 3;

	// checking program state
	assertThat(actualSum, is(expectedSum))
}


//1. assertTrue([optional message string], boolean): Asserts that the boolean condition
// is true and if not, there is an assertion failure with the specified message string 

//2. assertEquals([optional message string], expected, actual). Tests that two values are the same.
// If not, gives an assertion failure with the given message string (if any).
// When using this on two arrays, this will pass only if the references point to the same array
// object in memory. This will not check the array contens.

//3. assertNull([optional string message], object). These assertion names are quite like English