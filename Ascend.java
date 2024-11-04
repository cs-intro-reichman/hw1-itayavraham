// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
        int lim = Integer.parseInt(args[0]);
        int a = (int)(Math.random()*lim), b = (int)(Math.random()*lim), c = (int)(Math.random()*lim);
        System.out.println(a +" "+b+" "+c);
        int sum = a + b + c;
        int min = Math.min(Math.min(a,b),c), max = Math.max(Math.max(a,b),c), middle = sum-(min+max);
        System.out.println(min +" "+middle+" "+max);
	}
}