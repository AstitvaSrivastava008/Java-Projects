import java.util.Scanner;
public class array {

    public static void main(String[] args) {
       /* int n,max;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            n = s.nextInt();
        int arr[]= new int[n];
            System.out.println("Enter the elements of the array:");
            for(int i=0;i<n;i++)
            {
                arr[i]=s.nextInt();
            }
            max=arr[0];
            for(int i=1;i<n;i++)
            {
                if(arr[i]>max)
                {
                    max=arr[i];
                }
            }
            System.out.println("The maximum element in the array is: " + max); */
            /*int m,n;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter the number of rows: ");
            m = s.nextInt();
            System.out.print("Enter the number of columns: ");
            n = s.nextInt();
            int arr[][]=new int[m][n];
            System.out.println("Enter the elements of the array:");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    arr[i][j]=s.nextInt();
                }
            }
            System.out.println("The elements of the array are:");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }*/
            /* 
            int n;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            n = s.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter the elements of the array:");
            for(int i=0;i<n;i++)
            {
                arr[i]=s.nextInt();
            }
            //print the eleent of this array in another array
            int brr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                brr[i]=arr[i];
            }
            System.out.println("The elements of the new array are:");
            for(int i=0;i<n;i++)
            {
                System.out.print(brr[i] + " ");
            }
            System.out.println();
            int n,m,p,o;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter the number of rows of first matrix: ");
            n = s.nextInt();
            System.out.print("Enter the number of columns of first matrix: ");
            m = s.nextInt();
            System.out.print("Enter the number of rows of second matrix: ");
            p = s.nextInt();
            System.out.print("Enter the number of columns of second matrix: ");
            o = s.nextInt();
            int arr[][]=new int[n][m];
            int brr[][]=new int[p][o];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    arr[i][j]=s.nextInt();
                }
            }
            for(int i=0;i<p;i++)
            {
                for(int j=0;j<o;j++)
                {
                    brr[i][j]=s.nextInt();
                }
            }
            //check matrix are equal or not without boolean
            if(n!=p || m!=o)
            {
                System.out.println("The matrices are not equal");
            }
            else
            {
                int flag=0;
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<m;j++)
                    {
                        if(arr[i][j]!=brr[i][j])
                        {
                            flag=1;
                            break;
                        }
                    }
                }
                if(flag==1)
                {
                    System.out.println("The matrices are not equal");
                }
                else
                {
                    System.out.println("The matrices are equal");
                }
            }
            int m,n,o,p;
            int brr[][]=new int[10][10];
            Scanner s = new Scanner(System.in);
            System.out.print("Enter the number of rows of first matrix: ");
            m = s.nextInt();
            System.out.print("Enter the number of columns of first matrix: ");
            n = s.nextInt();
            System.out.print("Enter the number of rows of second matrix: ");
            o = s.nextInt();
            System.out.print("Enter the number of columns of second matrix: ");
            p = s.nextInt();
            int arr1[][]=new int[m][n];
            int arr2[][]=new int[o][p];
            System.out.println("Enter the elements of first matrix:");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    arr1[i][j]=s.nextInt();
                }
            }
            System.out.println("Enter the elements of second matrix:");
            for(int i=0;i<o;i++)
            {
                for(int j=0;j<p;j++)
                {
                    arr2[i][j]=s.nextInt();
                }
            }
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<p;j++)
                {
                    brr[i][j]=0;
                    brr[i][j]=arr1[i][j]+arr2[i][j];
                }
            }
            System.out.println("The sum of the two matrices is:");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<p;j++)
                {
                    System.out.print(brr[i][j] + " ");
                }
                System.out.println();
            }*/
            
    }
}