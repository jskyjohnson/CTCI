public class Sample {

	public int add(int a, int b){
		return a + b;
	}
	public static void main(String[] args) {
		System.out.println("Hello this is a Sample");

		Sample t = new Sample();
		System.out.println("Testing add");
		System.out.println(t.add(3, 4));
	}
}
