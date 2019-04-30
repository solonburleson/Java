
public class PhoneTest {

	public static void main(String[] args) {
		Galaxy s9 = new Galaxy("S9", 100, "Verizon", "Ring Ring Ring!");
		iPhone iphoneTen = new iPhone("X", 99, "AT&T", "Zing");
		
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
		iphoneTen.displayInfo();
		System.out.println(iphoneTen.ring());
		System.out.println(iphoneTen.unlock());
	}

}
