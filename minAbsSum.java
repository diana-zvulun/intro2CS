//Gets an assending array of numbers (Negative+Positive) and find the loweset absolute sum of 2 numbers
//Time complexity = O(n)
//Space complexity = O(1)
   
public static int minAbsSum(int [] a)
{
  int low = 0;
  int high = a.length-1;
  while (low < high-1)
    {
      int mid = (low + high) / 2;
      int check1 = Math.abs(a[mid]) + Math.abs(a[mid - 1]);
      int check2 = Math.abs(a[mid]) + Math.abs(a[mid + 1]);
      if (check1 > check2)
        {
          low = mid;
          mid++;
        } 
      else if (check1 < check2)
        {
          high = mid;
          mid--;
        }
      }
      return Math.abs(a[low]) + Math.abs(a[high]);
    }
