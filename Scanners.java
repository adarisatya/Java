package component;

import java.io.IOException;
import java.io.Reader;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

public class Scanners 
	{
	    public static void main(String[] args) throws Exception
	    	{
		        java.util.Scanner sc = new java.util.Scanner(System.in);
		
		        System.out.print("Enter boolean (true/false): ");
		        boolean status = sc.nextBoolean();
		
		        if (status) 
			        {
			            System.out.println("Status is Returned");
			        }
		        else 
			        {
		        	System.out.println("Invalid Status is Returned");
			        }
		
		        System.out.print("Enter a word (at least 3 letters): ");
		        String word = sc.next();
		
		        if (word.length() >= 3) 
		        	{
			            char ch = word.charAt(1);
			            System.out.println(ch);
		        	} 
		        else 
		        	{
		            	System.out.println("Error: word must have at least 3 characters!");
		        	}
		        
		        // boolean hasNext(), String next() — check/return next token
		        Scanner sc1 = new Scanner("Has Next Token");

		        while (sc1.hasNext()) 
			        {
			            String token = sc1.next();
			            System.out.println(token);
			        }
		        
		        Scanner sc2 = new Scanner ("Has \n Next Line");
		        while(sc2.hasNextLine())
			        {
		        		String line1 = sc2.nextLine();
		        		String line2 = sc2.nextLine();
		        		System.out.println(line1);
		        		System.out.println(line2);
			        }
		        
		        Scanner sc3 = new Scanner ("10 Has Next Int 20");
		        while(sc3.hasNext())
			        {
		        		if (sc3.hasNextInt())
					        {
					        	int num = sc3.nextInt();
					        	System.out.println("Integers are : " + num);
					        }
				        else 
					        {
					        	sc3.next();
				        		//System.out.println("Token doesn't contain Integer values"); - It is conditional based value
					        }
			        }
		        
		        Scanner sc4 = new Scanner ("3.141 is the value of PI and 2.718 is the value of e and 1 is value of root of one");
		        while (sc4.hasNext())
			        {
			        	if (sc4.hasNextDouble())
				        	{
				        		double Do = sc4.nextDouble();
				        		System.out.println(Do);
				        	}
			        	else
				        	{
				        		sc4.next();
				        	}
			        }
		        
		        Scanner sc5 = new Scanner ("true and false");
		        while (sc5.hasNext())
			        {
			        	if (sc5.hasNextBoolean())
				        	{
				        		boolean bo = sc5.nextBoolean();
				        		System.out.println(bo);
				        	}
			        	else
				        	{
				        		sc5.next();
				        	}
			        }
		        
		        Scanner sc6 = new Scanner ("100000 10 1");
		        long l = sc6.nextLong();
		        short s = sc6.nextShort();
		        byte b = sc6.nextByte();
		        System.out.println("Long: " + l + ", Short: " + s + ", Byte: " + b);
		        
		        Scanner sc7 = new Scanner("apple,banana,orange");
		        sc7.useDelimiter(",");
		        while (sc7.hasNext()) 
			        {
			            System.out.println("Fruit: " + sc7.next());
			        }
		       	
		        Scanner sc8 = new Scanner("123,45");
		        sc8.useLocale(Locale.GERMANY); // In Germany, ',' is the decimal separator
		        System.out.println("With German locale: " + sc8.nextDouble());
		        
		        Scanner sc9 = new Scanner("111 7F");
		        sc9.useRadix(2); // binary
		        System.out.println("Binary 111: " + sc9.nextInt()); // output: 7
		        sc9.useRadix(16); // hexadecimal
		        System.out.println("Hex 7F: " + sc9.nextInt());
		        
		        Scanner sc10 = new Scanner("Find 123 in this line and number 5678");
		        Pattern p = Pattern.compile("\\d+");
		        // findInLine: searches current line
		        String match1 = sc10.findInLine(p);
		        System.out.println("findInLine match: " + match1);
		        // findWithinHorizon: retries if possible (reset scanner for demo)
		        sc10 = new Scanner("abc def ghi 345 xyz");
		        String match2 = sc10.findWithinHorizon(Pattern.compile("\\d+"), 20);
		        System.out.println("findWithinHorizon match: " + match2);
		        
		        Scanner sc12 = new Scanner("hello 54321 world");
		        sc12.findInLine("\\d+");
		        MatchResult mr = sc12.match();
		        System.out.println("Last match: group=" + mr.group() + ", start=" + mr.start() + ", end=" + mr.end());
		        
		        Reader faultyReader = new Reader() {
		            public int read(char[] cbuf, int off, int len) throws IOException {
		                throw new IOException("Artificial read error!");
		            }
		            public void close() throws IOException {}
		        };
		        Scanner sc13 = new Scanner(faultyReader);
		        try {
		            sc13.next();
		        } catch (Exception e) {
		            if (sc13.ioException() != null)
		                System.out.println("ioException captured: " + sc13.ioException());
		        }
		        
		        Scanner sc14 = new Scanner("AAA BBB CCC");
		        sc14.useDelimiter("B+");
		        sc14.useLocale(Locale.FRANCE);
		        sc14.useRadix(8);
		        sc14.reset();
		        while (sc14.hasNext()) {
		            System.out.println("Token: " + sc14.next());
		        }
		        
		        sc.close();
	    	}
}

