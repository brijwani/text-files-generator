# text-files-generator

1. download text-files-generator-1.0.0-SNAPSHOT.jar file with this projet.
2. Make sure java is installed on your system.
3. From command line you can run this with below command,

java -cp text-files-generator-1.0.0-SNAPSHOT.jar files.utils.GenerateTextFiles -nof 10 -source E:\brij\study\temp\source.txt -destination E:\brij\study\temp -mnol 100

Here,
-nof    -> Number of files you wants to generate.

-source -> Source text file from which program will take text randomly. This is generally big file with many lines in it.

-destination -> Path where you wants to generate your text files.

-mnol -> This is maximum number of line you want in your files. Program will put random number of line between 1 to -mnol.
