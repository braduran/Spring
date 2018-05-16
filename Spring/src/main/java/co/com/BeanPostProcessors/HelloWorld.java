package co.com.BeanPostProcessors;

public class HelloWorld {

	private String message;

	public void getMessage() {
		System.out.println("You  message: " + this.message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init() {
		System.out.println("Init bean HelloWorld");
	}
	
	public void destroy() {
		System.out.println("Destroy bean HelloWorld");
	}

}
