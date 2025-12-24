package basic.array.arrayAdvance;

class NumberPattern{
	public static void main(String[] args) {

		 int row=5;
		int star=1;

		for(int r=1;r<=row;r++){

			int num =1;
			for(int s=1;s<=star;s++){
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
			star++;
		}
	}
}
/*
1
12
123
1234
12345 

---------------------------------------->

        int row=5;
		int star=1;
		int num=1;

		for(int r=1;r<=row;r++){			
			for(int s=1;s<=star;s++){
				System.out.print(num+" ");
				
			}
			System.out.println();
			star++;
			num++;

		}
	}
}

1
22
333
4444
55555

--------------------------------->

        int row=11;
		int star=1;

		for(int r=1;r<=row;r++){

			int num =1;
			for(int s=1;s<=star;s++){
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
			if(r<=row/2){
				star++;
			}else{
				star--;
		}

	  }

	}
}

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 
1 2 3
1 2 
1 
 


--------------------------------------------------->


                int row=11;
		int star=5;

		for(int r=1;r<=row;r++){

			int num =1;
			for(int s=1;s<=star;s++){
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
			if(r<=row/2){
				star--;
			}else{
				star++;
		}

	  }

	}
}

12345
1234
123
12
1
1
12
123
1234
12345


 
--------------------------------------------------->

                int row=11;
		int star=5;
                int num =5;
		for(int r=1;r<=row;r++){

			int tem = num;
			for(int s=1;s<=star;s++){
				System.out.print(tem+" ");
				tem--;
			}
			System.out.println();
			if(r<row/2){
				star--;
				num--;
				}else if(r==row/2){
	
				}
			else{
				star++;
				num++;
		}

	  }

	}
}
 
              
 54321
 4321
 321
 21
 1
 1
 12
 123
 1234
 12345    

--------------------------------------------->

		 int row=5;
		int star=5;

		for(int r=1;r<=row;r++){

			int num =5;
			for(int s=1;s<=star;s++){
				System.out.print(num+" ");
				num--;
			}
			System.out.println();
			star--;
		}
	}
}

54321
5432
543
54
5





-------------------------------------------------------->
		int row=5;
		int star=1;

		for(int r=1;r<=row;r++){

			int num =5;
			for(int s=1;s<=star;s++){
				System.out.print(num+" ");
				num--;
			}
			System.out.println();
			star++;
		}
	}
}

5
54
543
5432
54321

--------------------------------------------------------->
                int row=5;
		int star=5;

		for(int r=1;r<=row;r++){

			int num =1;
			for(int s=1;s<=star;s++){
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
			star--;
		}
	}
}

12345
1234
123
12
1


------------------------------------------------------->
                int row=5;
		int star=1;
		int num=1;

		for(int r=1;r<=row;r++){
                for(int i=1;i<=star;i++){			
				System.out.print(num+" ");
                     num++;
                  }
			System.out.println();
			star++;
		}
	}
}

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15


-------------------------------------------------------------->
                int row=5;
		int star=1;
		int num=1;

		for(int r=1;r<=row;r++){
			int  tem=num;
                for(int i=1;i<=star;i++){			
				System.out.print(tem+" ");
                     tem--;
                  }
			System.out.println();
			star++;
			num++;
		}
	}
}		

1
21
321
4321
54321



   -------------------------------------------------->
                int row=5;
		int star=1;
		int num=1;

		for(int r=1;r<=row;r++){
			int tem=num;

                for(int i=1;i<=star;i++){			
				System.out.print(tem+" ");
                     tem+=5;
                  }
			System.out.println();
			star++;
			num++;
		}
	}
}                 
        
1
2 7
3 8 13
4 9 14 19
5 10 15 20 25


       
--------------------------------------------------------------->

        int row = 5;  
        int star = 5; 
        int spc = 0;  

        
        for (int r = 1; r <= row; r++) {
            
            for (int i = 1; i <= spc; i++) {
                System.out.print(" ");
            }

           
            int num = 1;
            for (int s = 1; s <= star; s++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();

            
            spc++;   
            star--;  
        }
    }
}

 1 2 3 4 5
  1 2 3 4
   1 2 3
    1 2
     1


------------------------------------------------------>    

                int row=11;
		int star=1;
		int spc=row/2;

		for(int r=1;r<=row;r++){
	        for (int i = 1; i <= spc; i++) {
                System.out.print(" ");
            }

			int num =1;
			for(int s=1;s<=star;s++){
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
			if(r<=row/2){
				star++;
				spc--;
			}else{
				star--;
				spc++;
		}

	  }

	}
}

     1
    1 2
   1 2 3
  1 2 3 4
 1 2 3 4 5
1 2 3 4 5 6
 1 2 3 4 5
  1 2 3 4
   1 2 3
    1 2
     1

  --------------------------------------------------->     
        int row = 5;  
        int star = 1; 

        for (int r = 1; r <= row; r++) {
            
            for (int i = 1; i <= star; i++) {
                System.out.print(i);
            }
            
           
            for (int i = star - 1; i >= 1; i--) {
                System.out.print(i);
            }
            
            System.out.println(); 
            star++;
        }
    }
}

1
121
12321
1234321
123454321



   
--------------------------------------------------->
        int row = 5;  
        int star = 1; 
        int num = 1; 

       
        for (int r = 1; r <= row; r++) {
            
            for (int i = 1; i <= r; i++) {
                System.out.print(i);
            }

           
            for (int i = r - 1; i >= 1; i--) {
                System.out.print(i);
            }

            
            System.out.println();
        }
    }
}

1
121
12321
134321
123454321

*/



