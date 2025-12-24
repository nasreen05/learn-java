package basic.array.arrayAdvance;

class FindNum {
public static void main(String[] args){


 // public static void arrMethod() {
    int[] arr = new int[4]; // -------- declaration

    for (int i = 0; i < arr.length; i++) {
      arr[i] = 3 + i; // ----------initializetion
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 5) {
        System.out.println("Find a element in this array " + arr[i] + "index is " + i);
      }
    }
  }
        }
		
		/*
		public static void byteMethod(){
			
			 byte[] arr = new byte[2];

        
        for (int i = 0; i < arr.length; i++) {           //--------------- Initialize the array
            arr[i] = (byte)(112 + i);
        }

        
        for (int i = 0; i < arr.length; i++) {           //---------------- Print the array elements
            System.out.println(arr[i]);
        }

        
        for (int i = 0; i < arr.length; i++) {           //---------------- Search for the value 3 in the array
            if (arr[i] == 3) {
                System.out.println("Found element: " + arr[i] + " at index " + i);
            }
        }
			
			
		}
		
		
		
		

	}		
	
	public static void main(String[] args) {
	 		arrMethod();
			byteMethod();
		
	}
}

		 */
/*
--------------------------------------------------------------->
 byte[] arr = new byte[2];

        
        for (int i = 0; i < arr.length; i++) {           //--------------- Initialize the array
            arr[i] = (byte)(112 + i);
        }

        
        for (int i = 0; i < arr.length; i++) {           //---------------- Print the array elements
            System.out.println(arr[i]);
        }

        
        for (int i = 0; i < arr.length; i++) {           //---------------- Search for the value 3 in the array
            if (arr[i] == 3) {
                System.out.println("Found element: " + arr[i] + " at index " + i);
            }
        }
    }
}

--------------------------------------------------------------------------------------->
short[] arr= new short[2];

for(int i=0; i<arr.length; i++){
	arr[i] =(short)(4000+i);

}

for(int i=0; i<arr.length; i++){
	System.out.println(arr[i]);
}

for(int i=0;i<arr.length;i++){
if(arr[i]==3000+i){
	System.out.println("found the element :"+arr[i]+"at index"+i);
}
}
}
}
------------------------------------------------------------>

		long arr[]= new long[2];
		for(int i=0;i<arr.length;i++){
			arr[i]=(long)(30000l+i);
		}
    for(int i=0;i<arr.length;i++){
    	System.out.println(arr[i]);
    }
   
   for(int i=0;i< arr.length;i++){
   	if(arr[i]==30000l+i){
   		System.out.println("found the element :"+arr[i]+"at index"+i);
   	}
   }
}
}
-------------------------------------------------------------------------->


float arr[]= new float[2];
for(int i=0;i<arr.length;i++){
	arr[i]=(float)(1.23+i);
}
for(int i=0;i<arr.length;i++){
	System.out.println(arr[i]);
}
for(int i=0;i<arr.length;i++){
	if(arr[i]==1.23+i){
		System.out.println("found the elemnet"+arr[i]+"at index"+i);
	}
  }
  }
}

----------------------------------------------------------------------->



boolean arr[]=new boolean[2];
arr[0]=true;
arr[1]=false;

for(int i=0;i< arr.length;i++){
	System.out.println(arr[i]);
}
for(int i=0;i<arr.length;i++){
	if(arr[i]==true){
		System.out.println("founf the number"+arr[i]+"at index"+i);
	  }
   }
}
 

 ----------------------------------------------------->
 

		double arr[]= new double[2];
		for(int i=0;i<arr.length;i++){
			arr[i]=3.45+i;
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]==3.45+i){
				System.out.println("found the number"+arr[i]+" at index"+i);
			}
		}
			}
		}
-------------------------------------------------------------------------->
*/
	/*	char arr[]= new char[2];
		for(int i=0;i<arr.length;i++){
			arr[i]=(char)('A'+i);
		}
for(int i=0;i< arr.length;i++){
	System.out.println(arr[i]);
}
for(int i=0;i<arr.length;i++){
	if(arr[i]=='B'+i){
		System.out.println("found the number"+arr[i]+"at index"+i);
	}
}

}
}
*/
