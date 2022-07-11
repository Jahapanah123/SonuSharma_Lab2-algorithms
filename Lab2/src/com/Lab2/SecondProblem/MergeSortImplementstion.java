package com.Lab2.SecondProblem;

public class MergeSortImplementstion {
	
	void merge(int arr[], int left, int mid, int right) {
		
		//find sizes of two sub arrays to be merged
		
		int n1 = mid - left + 1 ;
		int n2 = right - mid;
		
		//create temporary arrays
		
		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];
		
		//copy data to temporary arrays
		
		for (int i = 0; i < n1; ++i)
			leftArray[i] = arr[left + 1];
		
		for (int j = 0; j < n2; ++j)
			rightArray[j] = arr[mid + 1];
		
		//merge the temporary arrays
		
		// initial indexs of first and second sub-arrays
		
		int i = 0, j = 0;
		
		//initial index of merged sub-arrays
		
		int k = left;
		while(i < n1 && j < n2 ) {
			
			if ( leftArray[i] >= rightArray[j]) {
				
				arr[k] = leftArray[i];
				i++;
			} else {
				
				arr[k] = rightArray[j];
				j++;
		
			}
			
			k++;
		}
		
		//copy remaining elements of leftArray if any
		
		while (i < n1) {
			
			arr[k] = leftArray[i];
			i++;
			k++;
		}
		
		//copy remaining elements of rightArray if any
		
				while (j < n2) {
					
					arr[k] = rightArray[j];
					j++;
					k++;	
		}
			
	}
		
	//Main function that sorts array using merge
	
	public void sort (int[] notes, int left, int right) {
		
		if (left < right) {
			
			int mid = (left+ right)/2; //find middle
			
			sort(notes, left, mid );
			sort( notes, mid + 1, right);    //sort first and second halves
			
			//merge the sorted halves 
			
			merge( notes, left, mid, right);
		}
		
	}
	
	}


