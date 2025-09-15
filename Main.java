//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Devonte Campbell
 */

public class Main {
  public static void main(String[] args) {
    
    System.out.println("Hello, World!");

    Lab1 lab = new Lab1();
    System.out.println(lab.increment(1));
    
    int[] nums = {5, 9, 3, 12, 7, 3, 11, 5};

        int i = 0;
        while (i < nums.length) {
            System.out.print(nums[i] + " ");
            i++;
        }
        System.out.println();

        for (int j = nums.length - 1; j >= 0; j--) {
            System.out.print(nums[j] + " ");
        }
        System.out.println();

        System.out.println("First: " + nums[0]);
        System.out.println("Last: " + nums[nums.length - 1]);

         System.out.println("Max of 5 and 9: " + Lab1.max(5, 9));
        System.out.println("Min of 5 and 9: " + Lab1.min(5, 9));
        System.out.println("Sum: " + Lab1.sum(nums));
        System.out.println("Average: " + Lab1.average(nums));
        System.out.println("Max in array: " + Lab1.max(nums));
        System.out.println("Min in array: " + Lab1.min(nums));
    }
  }     

// Add all of the methods here
class Lab1 {
  public static int increment(int num) {
    return ++num;
  }
  
  public static int max(int a, int b) {
    if (a > b) return a;
    else return b;
  }

  public static int min(int a, int b) {
    if (a < b) return a; 
    else return b;
  }

  public static int sum(int[] nums) {
    int total = 0;
    for (int num : nums) {
      total += num;
    }
    return total;
  }

  public static double average(int[] nums) {
    int total = 0;
    for (int num : nums) {
        total += num;
    }
    return (double) total / nums.length;
}

public static int max(int[] nums) {
  int maxVal = nums[0];
  for (int i = 1; i < nums.length; i++) {
      if (nums[i] > maxVal) {
          maxVal = nums[i];
      }
  }
  return maxVal;
}

public static int min(int[] nums) {
  int minVal = nums[0];
  for (int i = 1; i < nums.length; i++) {
      if (nums[i] < minVal) {
          minVal = nums[i];
      }
  }
  return minVal;
}
}