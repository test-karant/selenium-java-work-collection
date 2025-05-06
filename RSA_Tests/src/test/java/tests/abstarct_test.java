package tests;

public class abstarct_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		abstarct_method u = new use();
		//		u.start();

		String[] vehicles = {"Activa","Glamour","Jupiter","Pleasure","S-presso"};

		for(String i : vehicles) {
			System.out.print(i+", ");
		}
		first:
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++){
					if(i == 1){
						continue first;
					}
					System.out.println(" [i = " + i + ", j = " + j + "] ");
				}
			}
		System.out.println();

		second:
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++){
					if(i == 1){
						continue second;
					}
					System.out.println(" [i = " + i + ", j = " + j + "] ");
				}
			}

	}
}