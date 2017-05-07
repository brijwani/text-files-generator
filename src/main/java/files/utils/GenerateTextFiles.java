package files.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import Helper.ArgsHelper;
import Helper.FileReader;

public class GenerateTextFiles {
	private ArgsHelper argsHelper = new ArgsHelper();

	// -nof 10 -source E:\source.txt -destination E:\temp -mnol 10
	public static void main(String[] args) throws IOException {
		GenerateTextFiles generateTextFile = new GenerateTextFiles();
		generateTextFile.generate(args);
	}

	public void generate(String[] args) throws IOException {
		argsHelper.parseArgs(args);
		int numberOfFiles = Integer.parseInt(argsHelper.get("-nof"));
		int numberOfLines = Integer.parseInt(argsHelper.get("-mnol"));
		Random random = new Random();
		String path = argsHelper.get("-destination");
		if (!path.endsWith("\\")) {
			path = path + "\\";
		}
		List<String> fileLines = FileReader.getEnglishFile(argsHelper.get("-source"));
		File file = null;
		System.out.println("Generating files");
		for (int i = 0; i < numberOfFiles; i++) {
			file = new File(path + "file-" + i + ".txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter filewriter = new FileWriter(file);
			filewriter.write("=============================== FILE-" + i + " ===============================\r\n");

			for (int j = 0; j < random.nextInt(numberOfLines); j++) {
				int lineNumber = random.nextInt(fileLines.size() - 1);
				filewriter.write(fileLines.get(lineNumber));
			}
			filewriter.close();
			System.out.println(file.getName() + " File created");
		}
	}
}
