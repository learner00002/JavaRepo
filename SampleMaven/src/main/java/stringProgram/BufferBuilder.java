package stringProgram;

public class BufferBuilder {

	public static void main(String[] args) {
		StringBuffer obj = new StringBuffer("Anand");
		StringBuilder obj1 = new StringBuilder("Rahul");
System.out.println(obj);
System.out.println(obj1);

//insertof(); to insert a new value to the string based on the index position
System.out.println(obj.insert(2, "Arash"));
System.out.println(obj1);

//append();  - To add a string at last 
System.out.println(obj.append(obj1));

//replace();  To replace one string to another string based on the index.
System.out.println(obj.replace(2, 4, "beauty"));
System.out.println(obj.replace(1,7,"Kholi"));

//delete(); to delete 
System.out.println(obj.delete(0, 6));

//reverse(); to reverse a string
System.out.println(obj1.reverse());
	}

}
