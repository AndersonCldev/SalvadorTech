import java.util.Arrays;

public class SalvadorTech_exercicio06 {

	public static void main(String[] args) {
		int [] numero = {2,4,5,5,10,5,7,5,1};
		System.out.println(Arrays.toString(twoSum( 14,numero)));
	}
	public static int [] twoSum(int target,int[] numero) {
		for(int i = 0; i <numero.length ; i ++) {
			for(int j = i+1 ; j <numero.length ; j++) {
				return new int [] {i , j};
			}
		}
	
	
	return new int [] {};
	}
}
