package tema1.Opera;
public class Tenor extends Cantante{
	/**
	 * depende de como usemos el static o no sale fa la o fa fa
	 * 
	 * @return
	 */
	public static String cantar() {
		return "fa";
	}
	public static void main(String[] args) {
		Tenor t = new Tenor();
		Cantante s = new Tenor();
		System.out.println(t.cantar()+" "+s.cantar());

	}

}
