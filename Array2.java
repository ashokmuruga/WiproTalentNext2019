public class MyClass {
    public static void main(String args[]) {
        System.out.println("Largest in given array is " + largest());
        System.out.println("Smallest in given array is " + smallest());
    }
     static int arr[] = {10, 324, 45, 90, 9808}; 
       
     // Method to find maximum in arr[] 
     static int largest() 
     { 
         int i; 
           
         // Initialize maximum element 
         int max = arr[0]; 
        
         // Traverse array elements from second and 
         // compare every element with current max   
         for (i = 1; i < arr.length; i++) 
             if (arr[i] > max) 
                 max = arr[i]; 
        
         return max; 
     } 
      static int smallest() 
     { 
         int i; 
           
         // Initialize maximum element 
         int min = arr[0]; 
        
         // Traverse array elements from second and 
         // compare every element with current max   
         for (i = 1; i < arr.length; i++) 
             if (arr[i] < min) 
                 min = arr[i]; 
        
         return min; 
     } 
}
