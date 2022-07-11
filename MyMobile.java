package week1_Assignment1;

public class MyMobile {
	long PhoneNumber = 1234567890L;

	public void makeCall() {
		System.out.println("Calling.." + PhoneNumber);
	}

	public void sendMsg() {
		System.out.println("Sending Message to :" + PhoneNumber);
	}

	private void payBills() {
		System.out.println("Pay " + PhoneNumber + " Outstanding Bills ASAP");

	}

	public static void main(String[] args) {
		MyMobile obj = new MyMobile();
		obj.makeCall();
		obj.sendMsg();
		obj.payBills();

	}

}
