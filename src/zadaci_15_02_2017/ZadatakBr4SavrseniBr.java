package zadaci_15_02_2017;

public class ZadatakBr4SavrseniBr {

	public static void main(String[] args) {
		// 4. Pozitivni cijeli broj je savršen broj ukoliko je jednak zbiru svih
		// svojih pozitivnih djelilaca, iskljuèujuæi sebe. Na primjer, 6 je prvi
		// savršeni broj jer 6 = 3 + 2 + 1. Sljedeæi savršeni broj je 28 jer 28
		// = 14 + 7 + 4 + 2 + 1. Samo 4 savršena broja postoje u rasponu od 0 do
		// 10.000. Napišite program koji ispisuje sva 4.

		System.out.println("Poznato je da postoji 48 savrsenih brojeva.\nSamo 4 savrsena broja postoje u rasponu od 0 do 10.000,"
				+ " \na to su:");
		
		// ugnjezdene petlje

		// ide od 0 do 10000
		for (int i = 1; i < 10000; i++) {
			// ovdje je inicjalizujemo, pa se sama resetuje svaki put
			int sum = 0;
			// ide od 1 do i
			for (int j = 1; j < i; j++) {
				// ako su djeljivi
				if (i % j == 0) {
					// dodajemo na sumu
					sum += j;
				}
			}
			// ako je suma i broj iz prve petlje(i) isti, to je onda savrsen br
			if (sum == i) {
				System.out.println(i);

				
			}

		}
	}

}
