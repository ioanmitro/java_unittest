/*Method signature using header comments on each method. Understanding and writing the relationship
  between the input and output in words in the header comment.*/

  /*
  * Takes in a list of integers and outputs theirs sum
  * @param numbers - a list of integers to add
  * @return - a single number giving the sum of the integers
  */

  public static int add(List<Integer> numbers){
  	if (numbers == null || numbers.isEmpty()){
  		throw new InvalidInputException();
  	}
  	int sum = 0;
  	for (int i = 0; i < numbers.length(); i++){
  		sum += numbers.get(i);
  	}
  	return sum;
 }

  // Method signature and comments to write test cases in CalculatorTest.java 

 // @Test: Identifies a method as a unit test

 // @Ignore: Will ignore the test method. This is useful when we change the underlying code
 // and the test case has not yet been adapted to test for the changed code. Ignored tests 
 // should not show up in anything that we hand in, but this annotation can be useful to us while 
 // we are working on projects and testing them.

// As we'll notice in the stencil files, annotations appear at the top of a method, example:

 