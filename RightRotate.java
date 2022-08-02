package javaFsdProjects;

public class RightRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array=new int[]{1,2,3,4,5,6,7};
		int n=5;
		System.out.println("Array without Rotation");
		for(int i=0;i<array.length;i++)
		{
		System.out.println(array[i]+" ");
		}
		for(int i=0;i<n;i++)
		{
			int j,last;
			last=array[array.length-1];
			for(j=array.length-1;j>0;j--) 
			{
				array[j]=array[j-1];
			}
			array[0]=last;
		}
		System.out.println();
		System.out.println("Array after rotation to Right");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]+" ");
		}

	}

}
