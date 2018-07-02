package fonctions;

public class CamelCase {
	public static String camelCase(String str) {
		if (str != null) {
			String result = "";
			if (!str.equals("")) {
				String[] tempStr = str.split("[ _-]");
				for (String s : tempStr) {
					String first = s.substring(0, 1);
					String after = s.substring(1);
					result += first.toUpperCase() + after.toLowerCase();
				}
			}
			return result;
		}
		return null;
	}

}
