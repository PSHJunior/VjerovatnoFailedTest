
public class MyArray {
	 private int [] array={ 1,4,6,7,5,8,9,1,0	};
MyArray(){
	
}

public void getSmallestElement() {
	int broj = 0;
	for (int i = 0 ; i < array.length; i++) {
		if (array[i] < broj) {
			broj = array[i];
		}
		
	}
	System.out.println("Najmanji elemenat je " + broj);
	
}

public void getLargestElement() {
	int broj = 0;
	for (int i = 0 ; i < array.length; i++) {
		if (array[i] > broj) {
			broj = array[i];
		}
		
	}
	System.out.println("Najveci elemenat je " + broj);
	
}

public void sumAllElements() {
	int broj = 0;
	for (int i = 0 ; i < array.length; i++) {
		broj += array[i];
	}
	System.out.println("Zbir svih elemenata je " + broj);
}
public void printAllElements() {
	System.out.print("Elementi su ");
	for (int i = 0 ; i < array.length ; i++) {
		
		System.out.print(array[i] + " ");
	}
	System.out.println();
}



}
