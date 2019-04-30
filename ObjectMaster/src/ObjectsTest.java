import com.objectmaster2.*;

public class ObjectsTest {

	public static void main(String[] args) {
		Ninja naruto = new Ninja();
		Wizard sakura = new Wizard();
		Ninja sasuke = new Ninja();
		Samurai madara = new Samurai();
		naruto.steal(madara);
		madara.deathBlow(sasuke);
		madara.showHealth();
		sakura.heal(sasuke);
		sakura.fireball(madara);
		madara.showHealth();
		naruto.showHealth();
		sasuke.showHealth();
		sakura.showHealth();
	}

}
