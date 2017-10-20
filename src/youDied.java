
public class youDied {
	static int coolness=0;
	public static void main(String[] args) {
		roll();
		parry();
		attack();

	}
	public static void attack(){

		System.out.println("IM DA JUGGERNAUT BITCH");
		coolness++;

	}
	public static void roll(){

		System.out.println("OH SHIT");
		coolness+=10;

	}
	public static void parry(){
		coolness+=1000;
		System.out.println("trully a pro. gg ez");
	}
}