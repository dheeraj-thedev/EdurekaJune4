package co.edureka;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UtilAPIs {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println("Today is: "+date); // date.toString()
		
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		String today = sdf.format(date);
		System.out.println(today);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number 1");
		int a = scanner.nextInt();
		System.out.println("Enter Number 2");
		int b = scanner.nextInt();
		
		int c = a+b;
		System.out.println("c is: "+c);

	}

}
