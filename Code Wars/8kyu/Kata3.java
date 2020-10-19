package codeWars1;

public class Kata3 {
	public static int getAverage(int[] marks){
		int sumN=0;
		for(int i=0;i<marks.length;i++) {
			sumN=sumN+marks[i];
		}
		return Math.floorDiv(sumN, marks.length);
	}
}
