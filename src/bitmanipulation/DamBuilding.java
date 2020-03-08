package bitmanipulation;

public class DamBuilding {

	public static void main(String[] args) {
		
		
		int []wallposn = {1,2,4,7};
		int []wallheights ={4,6,8,11};
		
		
		
		int i =0;
		int height =0;
		for(int j=1;j<wallposn.length;j++,i++)
		{
			
			int gap =wallposn[j]-wallposn[i];
			
			
			while(gap>1)
			{
				
				int count1 = wallheights[i];
				int count2 = wallheights[j];
				int min  = Math.min(count1, count2)+1;
				
				if(wallheights[i]==wallheights[j])
				{
					wallheights[i]= wallheights[i]+1;
					wallheights[j] = wallheights[j]+1;
					gap--;
				}
				
				wallheights[i] = Math.min(count1, count2)+1;
				
				
					
				height = Math.max(height, min);
				
				gap--;
			}
			
			
		}
		System.out.println(height);
		

	}

}
