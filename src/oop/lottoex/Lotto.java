package oop.lottoex;

import java.util.Random;

public class Lotto {
	
	
	private int nums[];
	
	
	public Lotto(){
		nums = new int[6];
	}
	
	
	public void gen(){		
		
		Random rand = new Random();		
			
		for(int i=0;i<6;i++){
			nums[i]=rand.nextInt(45)+1;
			for(int j=0;j<i;j++) {
				if(nums[i]==nums[j]){
					i--;
					break;
				}			
			}	
		}
		
	}

	public void sort(){
		
		int temp;
		
		for(int i=0;i<6;i++)
			for(int j=i;j<6;j++)
				if(nums[i]>nums[j]){
					temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
		
	}	
	
	public void print(){
		
		for(int i=0;i<6;i++)
			System.out.printf("%d ", nums[i]);
			System.out.println();
		
	}
	
	

}
