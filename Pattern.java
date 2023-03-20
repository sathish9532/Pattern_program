package Pattern_program;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = new Pattern();
		
		 pattern.first(); 
		 pattern.second(); 
		 pattern.third(); 
		 pattern.four();
		 pattern.five();
		 pattern.six();
		 pattern.seven();
		 pattern.eight();
		 pattern.nine();
		 pattern.ten();
		 pattern.eleven();
	}

	private void eleven() {
		//    1
		//  1   2
		//1   2   3
		int k=0,rows =5;
		System.out.println("Pyramid Program");
		for(int i=1;i<=rows;i++,k=0) {
				
		
		for(int j=1;j<=rows-i;j++) {
			System.out.print("  ");
		}
		while(k!=2*i-1) {
			System.out.print(k+" ");
			k++;
		}
		System.out.println();
		}
	}

	private void ten() {
		// ****1
		// ***12
		// **123
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			for(int k=1;k<=6-i;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		System.out.println("------------------------");
	}

	private void nine() {
		// ****1
		// ***1
		// **1
		for(int i=5;i>1;i--) {
			for(int j=1;j<i;j++) {
				System.out.print("* ");
			}
			System.out.print(1+" ");
			System.out.println();
		}
		System.out.println("-----------------------------");		
	}

	private void eight() {
		// *
		// **
		// ***
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------");
	}

	private void seven() {
		// *****
		// ****
		// ***
		for(int i=5;i>=1;i--) {
		for (int j=1;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
		System.out.println("--------------------");
	}
	private void six() {
		// 5
		// 54
		// 543
		for(int i=5;i>=1;i--) {
		for(int j=i;j<=5;j++) {
		System.out.print(j+" ");
		}
		System.out.println();
		}
		System.out.println("---------------------");
		
	}

	private void five() {
		// 1
		// 12
		// 123
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("------------------------");
		
	}

	private void four() {
		// 12345
		// 2345
		// 345
		for(int i=1;i<=5;i++) {
		for(int j =i;j<=5;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
		System.out.println("--------------------------------");
}

	private void third() {
		// 12345
		// 6789
		int no=1;
		for(int i =5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(no+" ");
				no++;
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------------");
	}

	private void second() {
		// 54321
		// 5432
		// 543
		for(int i=1;i<=5;i++) {
		for(int j=5;j>=i;j--) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
		System.out.println("-------------------------------------------------");
}

	private void first() {
		// 12345
		// 1234
		// 123
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------------");
	}

}

