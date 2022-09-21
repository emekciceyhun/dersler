package whileDongusu;

public class Main {

	public static void main(String[] args) {
		int i=0;
		while(i<10) {
System.out.println(i);
	i+=2;
		}
System.out.println("while döngüsü bitti");

int j=100;
do {
	System.out.println(j);
j+=2;

}while(j<10);

System.out.println("do-while döngüsü bitti");
}
}