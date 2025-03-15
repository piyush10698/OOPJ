/*075_Piyush Patil_KH
Assignment 3
===========================================================================================
Question 10: Find Intersection and Union of Two Arrays.Find the intersection and union
of two unsorted array.
-------------------------------------------------------------------------------------------*/
import java.util.HashSet;
class IntersectionUnion{
	
	static void union(int a[], int b[]){
		HashSet<Integer> set = new HashSet<>();
		
		
		for (int i : a){
			set.add(i);
		}
		
		for (int i : b){
			set.add(i);
		}
		System.out.println("Union = "+set);
	}
	
	static void intersection(int a[], int b[]){
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> intersection = new HashSet<>();
		
		for(int i: a){
			set1.add(i);
		}
		
		for(int i: b){
			if(set1.contains(i)){
				intersection.add(i);
			}
		}
		System.out.println("Intersection = "+intersection);
	}		
		public static void main(String args[]){
			int a[]= {1,3,4,5,6};
			int b[]= {3,4,5,8,9};
			
			union(a,b);
			intersection(a,b);
		
		
	}
}