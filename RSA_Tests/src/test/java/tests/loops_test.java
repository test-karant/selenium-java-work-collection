package tests;

public class loops_test {

	public static void main(String[] args) {
		int i = 2;
		//		while(i<5) {
		//			System.out.println(i);
		//			i++;
		//		}
		do {
			System.out.println(i);
			i++;
		}while(i<0);

		String[] Vehicles = {"Pleasur","Activa","Jupiter","Glamour","S-presso"};
		Vehicles[0]="Pleasure";
		System.out.println(Vehicles[0]);
		System.out.println(Vehicles.length);
		
		//find avg from the given number
		int[] nums = {1,2,3,4,5,6,7};
		float sum = 0;
		float avg;

		for(int num: nums) {
			sum = sum+num;
		}
		System.out.println(sum);
		avg = sum/nums.length;
		System.out.println(avg);

		//find lowest of age from the string
		int[] ages = {21,24,27,29,28,32,20};
		int lowest = ages[0];

		for(int age :ages) {
			if(lowest>age) {
				lowest=age;
			}
		}System.out.println(lowest);
	}
}
