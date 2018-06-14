
package assignment5;

import java.util.Scanner;

public class Sub_Array {
    public static void main(String args[]) {
        int count=0,start=0,end=0,temp=1;
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n=ob.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<arr.length;i++)
            arr[i]=ob.nextInt();
          
        int j=1;
        for(int i=0;i<arr.length;i++)
        {
          for( ;j<=arr.length; )
          {
              if((j!=10)&&(arr[j]>arr[i]))
              {
                 temp++;
                 break;
              }
              else
              {     
                 if(temp>=count)
                  {
                      count=temp;
                      start=j-count;
                      end=j-1;
                      temp=1;
                      break;
                  }
              }
              temp=1;
              break;
          }
          j++;
          if(j==11)
              break;
      }
        System.out.println("The largest sorted sub_array is:");
        for(int k=start;k<=end;k++)
            System.out.print(" "+arr[k]);
        System.out.println("\n Length of Subarray is:"+count);
   }
}
       
              
