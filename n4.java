package comsyntaxclass11;

public class n4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *Create a 2D array or integer type where you will store
		 * odd and even numbers. Develop a program which will
		 * identify/print the even numbers only.
         */

		int [][] numbers = {
				              {1,2,3,4},
				              {5,6,7,8},
				              {9,10,11,12}
				              };
		
        int i, j;

		for(i=0;i<3;i++){

		for(j=0;j<4;j++){

		if((numbers[i][j]%2)==0){

		System.out.println(numbers[i][j]);

		}

		}
}
		}
	}

