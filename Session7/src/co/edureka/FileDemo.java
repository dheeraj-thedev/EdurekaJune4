package co.edureka;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		
		try {
			
			//File file = new File("/Users/ishantkumar/Downloads/WrapperDemo.java");
			File file = new File("/Users/ishantkumar/Downloads","mypy");
			
			if(file.exists()){				
				if(file.isFile()){
					System.out.println(file.getName()+" exists and is a file !!");
				}else{
					System.out.println(file.getName()+" exists and is a directory !!");
					String[] names = file.list(); // fetch all file names in the directory
					for(String s : names){
						System.out.println(s);
					}
				}
				// file.delete();
				// file.renameTo()
				// many more other API's
			}else{
				System.out.println(file.getName()+" does not exists !!");
			}
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e); // e.toString()
		}

	}

}
