
public class MyCustomException extends Exception{
	
	String message;

	public MyCustomException(String message) {
		super();
		this.message = message;
	}
}
