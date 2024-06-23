import java.util.Scanner;
class Product_Array
{
    void main()
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        int temp=0,pro=1;
        for(int i=0;i<n;i++)
        {
            arr1[i]=in.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==i){
                    continue;
                }
                else
                {
                    pro*=arr1[j];
                }
            }
            arr2[i]=pro;
            pro=1;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr2[i]);
        }
    }
}
