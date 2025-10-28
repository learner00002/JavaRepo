package stringProgram;

public class ExampleString {

	public static void main(String[] args) {
		String name ="Arash";
		System.out.println(name);
      String name2 = new String("Akash");
       System.out.println(name2);
       
       //length() = to return the length of the string
       System.out.println(name.length());
       
       //concat  - add two strings
       System.out.println(name.concat(" Rahul"));
       
       //charAT- To return the character of the string
       System.out.println(name.charAt(3));
       
       //contains - to check whether a character or word present in the string
       
       String a = "Russia is the empire king";
       System.out.println(a.contains("empire"));
       System.out.println(a.contains("america"));
       
       String d = "java";
       String c = "java";
       String o = "Java";
       String i  = "selinum";
       String f = "";
    		   //equals - To compare two strings
    		 System.out.println(c.equals(o));  
    		 System.out.println(d.equals(c)); 
    		 System.out.println(d.equals(i)); 
    		 
    		 //equalsignorecase - Ignore the case
    		 System.out.println(d.equalsIgnoreCase(o));
    		 
    		 //touppercase - to convert the lower case letter to the uppercase letters
    		 System.out.println(d.toUpperCase());
    		 
    		 //toLowerCase - convert uppercase letter to lower case letter
    		 System.out.println(d.toLowerCase());
    		 
    		//IsEmpty - to check a string is empty or not.
    		 System.out.println(d.isEmpty());
    		 System.out.println(f.isEmpty());
    		 
    		 //valueof - to convert any datatype to string value
    		 int ad = 10;
    		 System.out.println(String.valueOf(ad));
    		
    		 
    		 String lastname = "akash";
    		 String midname  = "akash";
    		 String firstname = new String("akash");
    		 System.out.println(lastname == midname);
    		 System.out.println(lastname.equals(midname));
    		 System.out.println(lastname==firstname);
    		 System.out.println(lastname.equals(firstname));
    		 //equal operator is used to compare object references, meaning it check the if two variables point to the same memory location 
    		 // on the other hand (.equal) method is used to compare the value of objects.
    		 
    		  
	}
	
	
	

}
