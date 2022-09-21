package intro;

public class Main {

	public static void main(String[] args) {

		//System.out.println("Merhaba Selim");

		/* değiken isimlendirmeleri java'da camelCase olarak yazılır */
		//String ortaMetin = "İlginizi Çekebilir";
		//String altMetin = "Vade Süresi";
		String okYonu;

		//System.out.println(ortaMetin);

		int vade = 12;
		double dolarDun = 18.20;
		double dolarBugun = 18.20;

		boolean dolarDustuMu = false;

		if (dolarBugun<dolarDun) // True
		{
			okYonu ="Down";
			System.out.println(okYonu);
		}
		else if(dolarBugun>dolarDun)
		{
			okYonu ="Up";
			System.out.println(okYonu);
		}
		else
		{
			okYonu ="Equal";
			System.out.println(okYonu);
		}
		
		String[] krediler = {"Hızlı Kredi", "Maaşını Burdan Alanlar","Mutlu Emekli","Hızlı ve Öfkeli"};
		
		for (int i = 0; i < krediler.length; i++)
		{
			System.out.println(krediler[i]);
		}
		
	}

}
