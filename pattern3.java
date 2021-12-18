package JavaLoop;
import java.util.Iterator;
import java.util.Scanner;
public class pattern3 {
	public static void main(String[] args) {
		for(int i=5;i>=1;i--) {
			for(int k=i;k>=5-i;k--) {
				System.out.print(" ");
			}
			for(int j=0;j<=6-i;j++) {
				System.out.print(i+j);
			}
			System.out.println("");
		}
		
		
	}

}
