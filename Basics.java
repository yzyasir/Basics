import java.util.*;

public class Basics {

// 1) Print 1-255
// public static Double printValues(){
//     for (int i=0; i<256; i++){
//         System.out.println(i);
//     }
//     return printValues();
// }
// 2) Print odd numbers between 1-255
// public static Double printOddValues(){
//     for (int i=0; i<256; i++){
//         if((i%2) == 0){
//             System.out.println("This value is even");
//         }
//         else {
//             System.out.print(i);
//         }
//     }
//     return printValues();
// }
// 3) Print Sum

// 4) Iterating through an array
// public static int iteratingTheArray(int[] arrVariable){ 
//     //int[] is just saying hey this is an integer based array, arrVariable being put in as the parameter
//     for(int i=0; i<arrVariable.length; i++){
//         System.out.println(arrVariable[i]);
//     }
//     return iteratingTheArray();
// }

// 5) Find Max

// 6) Get Average
// public static ArrayList getAverage(int[] arr) { //arr is the parameter name being put in 
//     Double sum = 0.0; 
//     for(int i=0; i<arr.length; i++) {
//         sum += arr[i]; 
//     }
//     return sum / arr.length; 
// }

// 7) Array with Odd Numbers

// 8) Greater than Y

// 9) Square the values
public static ArrayList<Integer> squareArray(ArrayList<Integer> arr){
    for(int i=0; i<arr.size(); i++) {
        arr.set(i, 5);
    }
    return arr;
}
// 10) Eliminate Negative Numbers

// 11) Max, Min, and Average

// 12) Shifting the Values in the Array

    public static void main(String[] args) {
        System.out.println("Whats the answer?");
        // System.out.println(getAverage(new int[] {1, 2, 3, 4, 5} ));
        // System.out.println(printValues()); //needs to stop printing
        // System.out.println(printOddValues()); //needs to hit the conditionals
        // System.out.println(iteratingTheArray(new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1} ));
        
        ArrayList<Integer> x = new ArrayList<Integer>(); //declared it as var x, () is just syntax, and then added to flexible array list and called the function
        x.add(1);
        x.add(4);
        x.add(3);
        x.add(9);
        squareArray(x);
    }
}