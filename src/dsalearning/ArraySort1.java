package dsalearning;

public class ArraySort1 {
	public static void main(String[] args) {
//
//		int[] arr = {1,0,0,1,2,1,1,1,0,0,0};
//		int temp;
//		for(int i=0;i<arr.length;i++){
//			for(int j=i+1; j<arr.length;j++){
//				if(arr[i]>arr[j]){
//					temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}	
//		for(int i=0;i<arr.length;i++) {
//		System.out.println(arr[i] + " ");
//		}
		
		int[] a= {1,2,3,4,2,5,1,2};
        int count = 1, tempCount;
  int repeated = a[0];
  int temp = 0;
  for (int i = 0; i < (a.length - 1); i++)
  {
    temp = a[i];
    tempCount = 0;
    for (int j = 1; j < a.length; j++)
    {
      if (temp == a[j])
        tempCount++;
    }
    if (tempCount > count)
    {
     repeated = temp;
      count = tempCount;
    }
  }
  System.out.println(repeated);
	}
}
