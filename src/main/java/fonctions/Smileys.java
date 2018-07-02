package fonctions;

import java.util.ArrayList;
import java.util.List;

public class Smileys {
	public static int countSmileys(List<String> arr) {
		int result = 0;
		List<String> smileysOK = new ArrayList<String>();
		smileysOK.add(":)");
		smileysOK.add(":D");
		smileysOK.add(";)");
		smileysOK.add(";D");
		smileysOK.add(":-)");
		smileysOK.add(":-D");
		smileysOK.add(";-)");
		smileysOK.add(";-D");
		if (arr != null) {
			for (String str : arr) {
				if (smileysOK.contains(str)) {
					result++;
				}
			}
		}
		return result;
	}
}
