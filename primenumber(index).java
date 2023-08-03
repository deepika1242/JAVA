import java.util.*;

class Main{
  public static void main(String args[]){   
 Scanner sc=new Scanner(System.in);
   int n=sc.nextInt(); 
   int a[]=new int[n];
   for(int i=0;i<n;i++)
   a[i]=sc.nextInt();
   int count=0,sum=0;
   
    for(int i=2;i<n;i++){   
     for(int j=1;j<=i;j++){   
      if(i%j==0)     
         count++;
   }
        
    
   if(count==2){
       sum+=a[i];
       
   }
        count=0;
    }
     System.out.print(sum);  
       
 }
    
}
