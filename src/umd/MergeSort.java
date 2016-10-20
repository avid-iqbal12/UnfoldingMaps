package umd;

import java.util.Arrays;
/** Lesson on merge sort
 * @author Faisal Iqbal
* */

public class MergeSort {

	@SuppressWarnings("rawtypes")
	public static void main(String args[]){
		
		//Unsorted array
		Comparable[] a = {12, 16, 333, 50, 1000, 5, 897, 1, 3, 66, 13};
		
		//System.out.println("List before sorting\n" + Arrays.toString(a));
		//call mergeSort
		mergeSort(a);
		
		System.out.println("List after sorting\n" + Arrays.toString(a));
	}
	
	@SuppressWarnings("rawtypes") 
	public static Comparable[] mergeSort(Comparable[] a){
		//if list is empty, no need to do anything
		if(a.length<=1){
			return a;
		}
		
		//Splitting the array in half in two parts
		Comparable[] first = new Comparable[a.length/2];
		Comparable[] second = new Comparable[a.length - first.length];
		System.arraycopy(a, 0, first, 0, first.length);
		System.arraycopy(a, first.length, second, 0, second.length);
		
		//Sort each half recursively
		mergeSort(first);
		mergeSort(second);
		
		//merge both halves together, overwriting to original array
		merge(first, second, a);
		return a;
		
		
	}
	
	@SuppressWarnings({"rawtypes","unchecked"}) 
	private static void merge(Comparable[] first, Comparable[] second, Comparable[] result){
		
		//index position in first array, starting with first element
		int iFirst = 0; 
		
		//index position in second array, starting with first element
		int iSecond = 0; 
		
		//index position in merged array, starting with first element
		int iMerged = 0; 		
		
		//compare elements at iFirst and iSecond
		//and move smallest element at iMerged
		while(iFirst<first.length && iSecond<second.length){
			if(first[iFirst].compareTo(second[iSecond])<0){
				result[iMerged] = first[iFirst];
				iFirst++;
			} else{
				result[iMerged] = second[iSecond];
				iSecond++;
			}
			iMerged++;
		}
		//copy remaining elements of both halves -- each half will have already sorted elements
		System.arraycopy(first, iFirst, result, iMerged, first.length - iFirst);
		System.arraycopy(second, iSecond, result, iMerged, second.length - iSecond);
	}
}
