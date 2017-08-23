public class MyGreeting {
	public void greet(Greeting greeting){
		greeting.perform();
	}
	public static void main(String[] args) {
		Greeting myGreetFunction = () -> System.out.println("Hello Lambda Function");
		Greeting ananymousFunction = new Greeting(){
			public void perform(){
				System.out.println("Hello Ananymous Function");
			}
		};
		MyGreeting myGreeting = new MyGreeting();		
		myGreeting.greet(myGreetFunction);
		myGreeting.greet(ananymousFunction);
	}
}

