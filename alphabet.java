package Pattern_program;

public class alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		alphabet letters = new alphabet();
		letters.s();
		letters.a();
		letters.t();
		letters.h();
		letters.i();
		letters.s();
		letters.h();
		letters.k();
		letters.u();
		letters.m();
		letters.a();
		letters.r();
	}

	private void r() {
		// R
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
				if(row==1 || row==4 || col==1 )
				{
					System.out.print("*");
				}
				
				else if(col==7)
				{
					if(row<5)
					{
						System.out.print("*");
					}
				}
				else {
					System.out.print(" ");
				}
				for(int i=1;i<=5;i++)
				{
					if(row==i+4 && col==i)
					{
						System.out.print("*");
					}
				}
			}
			System.out.println();
		
		}
		System.out.println("----------------");
	}
	



	private void m() {
		// M
		for(int row=1;row<=7;row++) {
            for(int col=1;col<=7;col++) {
                if(col==1 || col==7){
                    System.out.print("*");
                }
                else if(col==row|| col+row==8){
                    if(row<=4) {
                        System.out.print("*");
                    }
                    else
                        System.out.print(" ");
                }
                else
                    System.out.print(" ");
            }
             
            System.out.println();
        }
        System.out.println("-------------------");	
	}

	private void u() {
		// U
		for(int row=1;row<=7;row++) {
			for (int col=1;col<=7;col++) {
				if(col==1||col==7||row==7) {
					if(row==7&&col==1||row==7&&col==7) {
						System.out.print(" ");
					}
					else {
						System.out.print("*"); 	
					}
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
		
	}

	private void k() {
		// K
		for(int row=1; row<=7;row++) {
			for(int col=1;col<=7;col++) {
				if(col==1||col+row==6||row==5&&col==3||row==6&&col==4||row==7&&col==5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("----------------------");
	}

	private void s() {
		// S
		for(int row=1;row<=7;row++) {
			for(int col=1;col<=7;col++) {
				if(row==1 || row==4 || row==7||col==1||col==7){
					if(row==2&&col==7||row==6&&col==1||row==5&&col==1||row==3&&col==7) {
						System.out.print(" ");
					}
					else
					System.out.print("*");
				}
					else 
					{
						System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("---------------------------");
	}

	private void h() {
		// Letter H
		for(int row=1;row<=5;row++) {
            for(int col=1;col<=5;col++) {
            	if(col==1 || col==5 ||row==3)
            		System.out.print("*");
            	else
            		System.out.print(" ");
            }
            System.out.println();
		}
		System.out.println("------------");
		
	}

	private void i() {
		// Letter I
		for(int row=1;row<=5;row++) {
            for(int col=1;col<=5;col++) {
                if(row==1 || row==5 || col==3)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
		System.out.println("-----------------------");
	}
	

	private void t() {
		// Letter T
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(row==1||col==5) {
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("---------------------");
	}

	private void a() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) {
            for(int col=1;col<=7;col++) {
                if(row==1 || row==4 || col==1 || col==7){
                    if(row==1&&col==1||row==1&&col==7) {
                        System.out.print(" ");
                    }
                    else {
                        System.out.print("*");                      
                    }
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
		}
		System.out.println("-------------------");
	}
}
