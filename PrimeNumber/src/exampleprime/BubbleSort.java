package exampleprime;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array = new int[]{5,90,35,45,150,3};
System.out.println("Array before sorting");
for(int i=0;i<array.length;i++){
	System.out.println(array[i]);
}
bubbleSort(array);
System.out.println("Arrya after sorting");
for(int i=0;i<array.length;i++){
	System.out.println(array[i]);
}

}
public static void bubbleSort(int[] array){
	int n = array.length;
	int temp=0;
	for(int i=0;i<n;i++){
		for(int j=1;j<(n-i);j++){
			if(array[j-1]>array[j]){
				temp = array[j-1];
				array[j-1]=array[j];
				array[j]=temp;	
			}
			
		}
	}
}
}
