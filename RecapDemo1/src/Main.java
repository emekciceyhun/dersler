
public class Main {

	public static void main(String[] args) {
		int sayi1 = 100;
		int sayi2 = 10;
		int sayi3 = 540;
		
		if (sayi1 < sayi2 && sayi1<sayi3) {
			System.out.println(sayi1 + " 1.grup Sayıların en küçüğüdür");
			
		}else if (sayi2 < sayi1 && sayi2<sayi3) {
			System.out.println(sayi2 + " 1.grup Sayıların en küçüğüdür");
			
		}else{
			System.out.println(sayi3 + " 1.grup Sayıların en küçüğüdür");
	}

		
		int sayi4=5;
		int sayi5=2;
				int sayi6=10;
		int sayiBuyuk =sayi4;
		
		if (sayi4<sayi5) {
			 sayiBuyuk =sayi5;
			
		}else if(sayi5<sayi6) {
			 sayiBuyuk = sayi6;
					
					
		}
		
		System.out.println("En büyük sayı = " + sayiBuyuk);
}
}