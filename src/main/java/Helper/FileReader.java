package Helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
	public static List<String> getEnglishFile(String path) throws IOException {
		List<String> fileLines = new ArrayList<String>();
		try {
			File file = new File(path);
			java.io.FileReader fileReader = new java.io.FileReader(file);
			BufferedReader br = new BufferedReader(fileReader);
			String line = "";
			while ((line = br.readLine()) != null) {
				fileLines.add(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fileLines;
	}
}
