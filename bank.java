import java.io.*;
import java.util.Scanner;

public class bank{
	public static void main(String[]args){
		int a,b,c,e;
		char d;
		e=50000;
		Scanner in = new Scanner(System.in);
		do{
			atas:
			System.out.println("+----------------------+");
			System.out.println("+     BANK SAMUDRA     +");
			System.out.println("+----------------------+");
			System.out.println("+  Menu Transaksi      +");
			System.out.println("+  1. Tarik Tunai      +");
			System.out.println("+  2. Setor uang       +");
			System.out.println("+  3. Informasi Saldo  +");
			System.out.println("+----------------------+");
			System.out.print("Pilih Menu : ");
			a = in.nextInt();
			switch (a){
				case 1 :
				{
					System.out.print("Berapa uang yang akan diambil ?");
					b = in.nextInt();
					if (e-b<10000){
						System.out.println("Maaf, saldo anda tidak mencukupi untuk melakukan transaksi ini.");
					}
					else{
						e=e-b;
						System.out.println("Anda berhasil mengambil uang sebesar : Rp. "+b);
					}
					System.out.print("\n\n");
				}
				break;
				case 2 :
				{
					System.out.print("Berapa uang yang akan disetorkan ?");
					c = in.nextInt();
					e=e+c;
					System.out.println("Anda berhasil menyetorkan uang sebesar : Rp. "+c);
					System.out.print("\n\n");
				}
				break;
				case 3:
				{
					System.out.println("Saldo anda sebesar : Rp. "+e);
				}
			}
			System.out.print("Kembali ke Menu Utama ? (Y/T)");
			d = in.next().charAt(0);
			System.out.print("\n\n");
		}
		while(d=='Y'||d=='y');
	}
}