package grade;
import java.util.Scanner;

public class grades {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the mark");
		int student_mark=scanner.nextInt();
		if(student_mark>=40) {
			System.out.println("E");
		}
		else if(student_mark>=50) {
			System.out.println("D");
		}
		else if(student_mark>=60) {
			System.out.println("c");
		}
		else if(student_mark>=70) {
			System.out.println("B");
		}
		else if(student_mark>=80) {
			System.out.println("A");
		}
		else if(student_mark>=90) {
			System.out.println("S");
		}

	}

}
