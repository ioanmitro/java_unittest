public List<Integer> squares(List<Integer> numbers){
	List<Integer> squares = new ArrayList<Integer>();
	for (int i = 0; i < numbers.length; i++) {
		squares.add(numbers.get(i)*numbers.get(i));
	}
	return squares;
}

// An assumption about the above piece of code would be
// assert(squares(Arrays.asList(1,2,3).equals(Array.asList(1,4,9));

// Testing small pieces of functionality using unit tests can hep with the isolation of bugs more 
// effectively than looking at the larger framework of a project


// JUnit is Java's unit testing framework. A guidance on this framework with the introduction
// of the idea of "test-driven development" is introduces with the set up of test data for a piece
// of code and then implement it.

// Add method in a class Calculator.java that takes a list of integers and returns the sum


