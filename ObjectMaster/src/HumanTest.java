import com.objectmaster.*;
import com.objectmaster2.*;

public class HumanTest {

	public static void main(String[] args) {
		Human p1 = new Human();
		Human p2 = new Human();
		p1.attackHuman(p2);
		p2.showHealth();
	}

}
