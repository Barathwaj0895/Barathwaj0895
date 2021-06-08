package dsalearning;

public class DuplicateArray {
	
	public void arrDuplicate(int[] args) {
		
        int[] arrnum = {1, 2, 5, 5, 6, 6, 7, 2};
 
        for (int i = 0; i < arrnum.length-1; i++)
        {
            for (int j = i+1; j < arrnum.length; j++)
            {
                if ((arrnum[i] == arrnum[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+arrnum[j]);
                }
            }
        }
    } 
}
