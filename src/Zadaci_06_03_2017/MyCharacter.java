package Zadaci_06_03_2017;

public class MyCharacter {

	char karakter; 
	
 
	MyCharacter(char c){
		this.karakter = c;
	}
	
	/**
	 * metoda konvertuje veliko slovo u malo slovo(radi se o karakterima)
	 * @return  instance sa konvertovanim karakterom u veliko slovo 
	 */
	public MyCharacter toLowerCase(){
		if(karakter >= 65 && karakter <= 90){
			return new MyCharacter((char)((int)this.karakter + 32));
		}
		else{
			return new MyCharacter(karakter);
		}
	}
	

	/**
	 * metoda konvertuje malo slovou veliko slovo (radi se o karakterima)
	 * @return  instance sa konvertovanim karakterom u malo slovo 
	 */
	public MyCharacter toUpperCase(){
		if(karakter >= 97 && karakter <= 122){
			return new MyCharacter((char)((int)karakter - 32));
		}
		else{
			return new MyCharacter(karakter);
		}
	}
	
	/**
	 * provjerava  da li je atribut malo slovo
	 * @return true ako je malo slovo, u suprotnom false
	 */
	public boolean isLowerCase(){
		if(karakter >= 97 && karakter <= 122){
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * provjerava  da li je atribut veliko slovo
	 * @return true ako je veliko slovo, u suprotnom false
	 */
	public boolean isUpperCase(){
		if(karakter >= 65 && karakter <= 90){
			return true;
		}
		else {
			return false;
		}
	}
	
	
	/** Overriden toString met. */
	@Override
	public String toString(){
		return karakter + "";
	}
	
	/** testiranje*/
	public static void main(String[] args) {
		MyCharacter c = new MyCharacter('v');
		System.out.println("karakter: "+c);
		
	 
		System.out.println("Da li je karakter malo slovo? "+c.isLowerCase());
		System.out.println("Da li je karakter veliko slovo? "+c.isUpperCase());
		
	 
		MyCharacter c1 = c.toUpperCase();
		System.out.println("Konvertuj karakter "+c.toString()+" u veliko slovo: "+c1.toUpperCase());
		
 
		MyCharacter c2 = c1.toLowerCase();
		System.out.println("Konvertuj karakter "+c1.toString()+" u malo slovo: "+c2.toLowerCase());
	}

}