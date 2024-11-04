// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
	    String name1 = args[0], name2 = args[1], name3 = args[2];
	    int bill = Integer.parseInt(args[3]); //Question said to get an integer instead of a double(?)
        double result = Math.ceil(bill/3.0); //Dividing the integer input by 3 + rounding the result
	    System.out.println("Dear "+name1+", "+name2+", and "
			       +name3+": Pay "+result+" shekels each");  
	}
}
