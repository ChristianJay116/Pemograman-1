//Perintah Control Flow /Struktur Kontrol
//Perintah kedua -contoh 02

package Latiha01.sesi1.bin;

public class DemoLooping
{
	public static void main(String[] Xx)
	{
	String[][] daftarNilai = new String[][]
	{
		new String[] {"001", "A"},
		new String[] {"002", "B"},
		new String[] {"003", "C"},
	};
	System.out.println("LOOPING MENGGUNAKAN FOR");
	
	for(int i=0; i<daftarNilai.length;i++)
	{
		System.out.println("NPM : " +daftarNilai[i][0]);
		System.out.println("Nilai : " +daftarNilai[i][1]);
	}
	
		System.out.println("SELESAI LOOPING FOR");
		System.out.println();
		System.out.println();
		System.out.println("SELESAI LOOPING WHILE");
		int ix = 0;
	while(ix < daftarNilai.length)
	{
		System.out.println("NPM : " +daftarNilai[i][0]);
		System.out.println("Nilai : " +daftarNilai[i][1]);
		ix++;
	}
	System.out.println("SELESAI LOOPING WHILE");
	}
}