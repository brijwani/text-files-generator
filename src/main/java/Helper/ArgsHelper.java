package Helper;

import java.util.HashMap;
import java.util.Map;

public class ArgsHelper {

	private Map<String, String> args = new HashMap<String, String>();

	public void parseArgs(String[] parameters) {
		if (parameters.length % 2 == 0) {
			for (int i = 0; i < parameters.length; i++) {
				args.put(parameters[i], parameters[i + 1]);
				i++;
			}
		} else {
			System.out.println("Wrong parameters provided.");
		}
	}

	public String get(String key) {
		return args.get(key);
	}
}
