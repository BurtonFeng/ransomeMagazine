import java.util.HashMap;

public class ransomMagazine {
	// Creating Hashtable to store words
	private HashMap<String, Integer> table = new HashMap<>();
	
	public void adjustTable(String str, boolean mag) {
		// if it is a magazine, we want to either initialize a value for word, or we want to increment
		if(mag) {
			for(String word : str.split(" ")) {
				if(!table.containsKey(word))
					table.put(word, 1);
				else
					table.put(word, table.get(word) + 1);
			}
		}
		// if it is a ransom, we want to decrement word, or if word doesn't exist, initialize -1
		else {
			for(String word : str.split(" ")) {
				// if table does not contain the word, we initialize -1
				if(!table.containsKey(word))
					table.put(word, -1);
				// decrememnt word count
				else {
					table.put(word, table.get(word) - 1);
				}
			}
		}
			
	}
	
	public boolean checkValidRansom() {
		for(int count : table.values()) {
			if(count < 0)
				return false;
		}
		return true;
	}
}
