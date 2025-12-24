package basic.array.arrayAdvance;

class NumPattern2{
	public static void main(String[] args) {
		int row=2;
		int coloum =3;

		for(int r=0;r<=row;r++){
			int num=1;
			for(int c=0;c<=coloum;c++) {
				System.out.print(num+" ");
				num+=2;
			}
				System.out.println();
				
			}
		}
	}
