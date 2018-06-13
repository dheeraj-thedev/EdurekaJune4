package co.edureka;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class IOOperations {

	void readFromFile(){
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/","WrapperDemo.java");
			if(file.exists()){
				System.out.println("Reading "+file.getName()+"...");
				// Performs read operation in bytes
				FileInputStream inputStream = new FileInputStream(file);
				int i = 0;
				int count = 0;
				char ch = ' '; 
				while((i = inputStream.read()) != -1){
					
					ch = (char)i;
					if(ch=='a'){
						count++;
					}
					System.out.print(ch); // convert the byte into char
				}
				System.out.println("a appears "+count+" times..");
				inputStream.close();
				
			}else{
				System.out.println(file.getName()+" does not exists..");
			}
		} catch (Exception e) {
			System.out.println("Exception: "+e); // e.toString()
		}
	}
	
	void readFromFileAgain(){
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/","WrapperDemo.java");
			if(file.exists()){
				System.out.println("Reading "+file.getName()+"...");
				// Performs read operation in text
				FileReader reader = new FileReader(file);
				BufferedReader buffer = new BufferedReader(reader); // IO Chaining
				
				String line = "";
				int count = 0;
				while((line = buffer.readLine()) != null){ // Reading line by line (using BufferedReader)
					System.out.println(line);
					if(line.contains("new")){ // Source Code Analysis
						count++;
					}
				}
				
				System.out.println("Objects Found: "+count);
				
				buffer.close();
				reader.close();
				
			}else{
				System.out.println(file.getName()+" does not exists..");
			}
		} catch (Exception e) {
			System.out.println("Exception: "+e); // e.toString()
		}
	}
	
	void writeInFile(){
		try {
			File file = new File("/Users/ishantkumar/Downloads/","MyProg.java");
			//if(file.exists()){
			//	System.out.println(file.getName()+" exists..");
			//}else{
				//System.out.println(file.getName()+" does not exists..");
				
				String data = "\n\nclass MyProg{\n\tpublic static void main(String[] args){\n\n\t}\n}";
				
				// works on bytes
				//FileOutputStream outputStream = new FileOutputStream(file); // File will be created if not thr and overwrite the data if data exists..
				FileOutputStream outputStream = new FileOutputStream(file,true); // true means append mode enabled
				outputStream.write(data.getBytes());
				outputStream.close();
				
				System.out.println("Contents Written...");
			//}
			
		} catch (Exception e) {
			System.out.println("Exception: "+e); // e.toString()
		}
	}
	
	void writeInFileAgain(){
		try {
			File file = new File("/Users/ishantkumar/Downloads/","MyProg.java");
			//if(file.exists()){
			//	System.out.println(file.getName()+" exists..");
			//}else{
				//System.out.println(file.getName()+" does not exists..");
				
				String data = "\n\nclass OurProg{\n\tpublic static void main(String[] args){\n\n\t}\n}";

				// works on text
				//FileWriter writer = new FileWriter(file);
				FileWriter writer = new FileWriter(file,true);
				writer.write(data);
				writer.close();	
				System.out.println("Contents Written...");
			//}
			
		} catch (Exception e) {
			System.out.println("Exception: "+e); // e.toString()
		}
	}	
	
	public static void main(String[] args) {
		
		IOOperations io = new IOOperations();
		//io.readFromFile();
		//io.readFromFileAgain();
		
		//io.writeInFile();
		io.writeInFileAgain();

	}

}
