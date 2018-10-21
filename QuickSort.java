import java.util.*;
/**
 *
 * @author Kanmani
 */
public class QuickSort {
    int a[]=new int[8];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QuickSort obj=new QuickSort();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the elements: ");
        for(int i=0;i<8;i++)
            obj.a[i]=s.nextInt();
        obj.quickSort(0,7);
        for(int i=0;i<8;i++)
        {
            System.out.print(obj.a[i]+" ");
        }
        
    }
    void quickSort(int index,int p)
    {
        int i=index-1,j=0,k;
        if(p<=index)
            return;
            
        for(k=index;k<p;k++)
        {
         if(a[k]<a[p])
         {
             ++i;
             swap(i,k);
         }
        }
        if(++i!=p)
        swap(p,i);
        quickSort(index,i-1);
       quickSort(i+1,p);  
    }
    void swap(int i,int j)
    {
        int t;
        t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
}
