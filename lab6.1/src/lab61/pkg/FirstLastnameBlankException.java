package lab61.pkg;

public class FirstLastnameBlankException extends RuntimeException {

	public FirstLastnameBlankException() {
		// TODO Auto-generated constructor stub
	}

	public FirstLastnameBlankException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public FirstLastnameBlankException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public FirstLastnameBlankException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public FirstLastnameBlankException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "first or last name is blank";
	}

	
}
