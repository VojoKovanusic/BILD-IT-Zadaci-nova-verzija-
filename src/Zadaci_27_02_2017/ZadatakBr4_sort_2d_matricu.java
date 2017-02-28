package Zadaci_27_02_2017;


public class ZadatakBr4_sort_2d_matricu {

	public static void main(String[] args) {
		System.out
				.println("\t***Sortiranje dvovimenzionalnog niza***"
						+ "\n(primarno sortiranje je po redovima, sekundarno po kolonama)");
		System.out.println("\nNesortirana, random matrica 5X2:");
		
		int niz[][] = new int[5][2];
		//smjestanje nasumicnih vrjednosti od 1-9 u matricu 5x2 i ispis
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				niz[i][j] = (int) (Math.random() * 9 + 1);
				System.out.print(niz[i][j] + " ");

			}
			System.out.println();
		}

		System.out.println("Sortirana:");
		//pozivanje metode, prosledjivanje rgumenta
		sort1(niz);

	}
//metoda koja sortira primarno po redovima, asekundarno po kolonama
	public static void sort1(int m[][]) {

		for (int i = 0; i < m.length - 1; i++) {
			int trenutniIndex = i;
			int trenutni[] = m[i];
			
			for (int j = i + 1; j < m.length; j++) {
				if (trenutni[0] > m[j][0] || trenutni[0] == m[j][0]
						&& trenutni[1] > m[j][1]) {
					trenutni = m[j];
					trenutniIndex = j;
				}
			}
			if (trenutniIndex != i) {
				m[trenutniIndex] = m[i];
				m[i] = trenutni;
			}
		}
		//ispis
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

}
