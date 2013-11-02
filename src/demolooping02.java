//perintah Control flow/struktur kontrol
//perintah ketiga-contoh 03

package Latihan01.sesi1.bin;
import java.util.Random;

public class demolooping02
{
	static boolean selesai = false ;
	public static void main(String[] Xx)
	{
		Integer faktor =7;
		System.out.println("Mencari Kelipatan" +faktor + "dengan while");
		while (!selesai)
		{
			cariKelipatan(faktor);
		}
		System.out.println("selesai mencari kelipatan dengan while");
		System.out.println();
		System.out.println();
		System.out.println("Mencari Kelipatan" +faktor + "dengan for");
		for (selesai=false; !selesai;)
		{
			cariKelipatan(faktor);
		}
		System.out.println("Selesai mencari keliaptan dengan for");
	}
	public static void cariKelipatan(Integer faktor)
	{
		Integer random = new Random().nextInt();
		System.out.println("Bilangan random	:" +random);
		
		if (random % faktor == 0)
		{
			System.out.println("kelipatan" +faktor + "ditemukan, yaitu  : " +random);
			selesai = true;
		}
	}
}	