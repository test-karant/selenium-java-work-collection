package tests;


public interface Test {

void testAutomate();

void useCases();
	
}

class useTest implements Test{

	@Override
	public void testAutomate() {
		// TODO Auto-generated method stub
		System.out.println("Test method");
		
	}

	@Override
	public void useCases() {
		// TODO Auto-generated method stub
		System.out.println("Test method");
	}
	
}

//public class mainTest{
//	public static void main(String[]args) {
//
//		useTest u = new useTest();
//		u.testAutomate();
//		u.useCases();
//	}
