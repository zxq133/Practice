
public class random {
	double id;
	public random() {
		id=Math.random()*100;
	}
	public static void main(String[] args) {
		random a=new random();
		System.out.println(a.id);
	}
}
