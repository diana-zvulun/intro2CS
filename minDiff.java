//Recursion that gets an array and divides it to 2 groups and returns the smallest diff between these 2 groups:

public static int minDiff(int [] arr)
    {
        return minDiff(arr,0,0,0);
    }

private static int minDiff (int [] arr, int i, int sum1,int sum2)
    {
        if (i==arr.length)
            return (Math.abs(sum1-sum2));
        int check1 = minDiff(arr,i+1,sum1+arr[i],sum2);
        int check2 = minDiff(arr,i+1,sum1,sum2+arr[i]);

        if (check1 > check2)
            return check2;
        else return check1;
    }
 

    
