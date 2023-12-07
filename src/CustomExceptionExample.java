
public class CustomExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
            validateInput(5);
            validateInput(-3); // This will throw MyCustomException
        } catch (MyCustomException e) {
            System.err.println("Custom Exception caught: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Generic Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block - Cleanup or final operations");
        }
		

	}
	
	private static void validateInput(int value) throws MyCustomException {
        if (value < 0) {
            throw new MyCustomException("Input value cannot be negative");
        }
        // Business logic for valid input
        System.out.println("Valid input: " + value);
    }

}
