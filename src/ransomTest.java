public class ransomTest {
	public static void main(String[] args) {
		String magazine = "This is a string that contains alot of words and can be used to construct a setence used in a ransom";
		String ransom = "This is a ransom";
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
