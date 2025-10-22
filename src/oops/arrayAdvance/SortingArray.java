package oops.arrayAdvance;

class SortingArray{

    public static void main(String[] args){

       
        int[] num = {1,2,3,4,6,7,8,9,10,11};
        int a = 11;
        boolean found = false;

           
        for(int i = 1; i <= a;i++){

            for(int j = 0; j<num.length; j++){


                if (num[j] == i){

                    found = true;
                    break;

                }

            }
            if(!found){
                System.out.println("missing number in array  =  " + i);
            }
            found = false;

            
        }

    }
             
            }