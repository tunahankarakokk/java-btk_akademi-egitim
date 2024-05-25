package workingWithFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//createFile();
		//getFileInfo();
		readFile();
		writeFile();
		readFile();
		
		
	}
	public static void createFile() {//dosya oluşturma
		File file = new File("D:\\btkjavaakademi\\files\\students.txt");
		try {
		if (file.createNewFile()) {
			System.out.println("Dosya Oluşturuldu.");
		}
		else {
			System.out.println("Dosya zaten mevcut");
		}
		} catch (IOException e) {
			e.printStackTrace();//hata mesajı
		}
	}
	public static void getFileInfo() {
		File file = new File("D:\\btkjavaakademi\\files\\students.txt");
		if (file.exists()){
			System.out.println("Dosya Adı : " + file.getName());//dosyanın adı 
			System.out.println("Dosya Yolu : " + file.getAbsolutePath());//dosyanın yolu
			System.out.println("Dosya Yazılabilir mi : " + file.canWrite());
			System.out.println("Dosya Okunabilir mi : " + file.canRead());
			System.out.println("Dosya Boyutu : " + file.length());


		}
	}
	public static void readFile() {
		File file = new File("D:\\btkjavaakademi\\files\\students.txt");
		try {
			Scanner reader = new Scanner(file);
			while (reader.hasNextLine()){
				String line = reader.nextLine();
				System.out.println(line);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void writeFile() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\btkjavaakademi\\files\\students.txt",true));
			writer.newLine();
			writer.write("Ahmet");
			System.out.println("Dosyaya Yazıldı");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
