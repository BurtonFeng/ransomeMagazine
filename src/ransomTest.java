public class ransomTest {
	public static void main(String[] args) {
		String magazine = "I will not kill you";
		String ransom = "I will kill you";
		ransomMagazine test = new ransomMagazine();
		test.adjustTable(magazine, true);
		test.adjustTable(ransom, false);
		
		boolean result = test.checkValidRansom();
		if(result) 
			System.out.println("Ransom was constructed from magazine!");
		else
			System.out.println("Ransom was NOT constructed from magazine! :(");
	}
}
