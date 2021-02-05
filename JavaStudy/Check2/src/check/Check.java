package check;



import constants.Constants;

public class Check {

	private  String firstName = "武田";
	private  String lastName = "康汰";

	private void  printName() {
		System.out.println("printNameメソッド" + " " + "→" + " " + firstName + lastName);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	   Check ch = new Check();
	     ch.printName();


		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		     pet.introduce();

		RobotPet robo = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		     robo.introduce();

		}




}
