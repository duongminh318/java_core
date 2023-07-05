package main;

import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ViDuDocFile {
	public static void main(String[] args) {
		/*cach 1 : su dungj BufferedReader*/
		File f= new File("D:\\LEARNING\\CODE\\Java\\TITV\\core\\JV72_DocdulieutuFile\\File.txt");
		try {
			BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
			String line = null;
			while(true) {
				line = br.readLine();
				if(line==null) {
					break;
				}else {
					System.out.println(line);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		cach 2: su dungj Files.readLine
		 File f2= new File("D:\\\\LEARNING\\\\CODE\\\\Java\\\\TITV\\\\core\\\\JV72_DocdulieutuFile\\\\File.txt");
		 try {
			 List<String> allText= Files.readAllLines(f2.toPath(), StandardCharsets.UTF_8);
			 for (String line : allText) {
				 System.out.println(line);		
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
