//Recurstion that get 2 arrays - a- array of integers, pattern- array of patterns and returns true if array "a" has a sub array 
//with the pattern in p array.
//pattern: 
//1 - number with 1 digit
//2 - number with 2 digits
//0 - number with 1 or 2 digits

public static boolean match(int [] a, int [] pattern)
        {
            return match(a,pattern,0,0);
        }
        
private static boolean match(int [] a, int [] pattern, int indexA,int indexP)
        {
            if (indexP == pattern.length)
                return true;
            else if (indexA == a.length)
                return false;
            if (pattern[indexP] == 1 && a[indexA] >=0 && a[indexA] < 10)
            {
                return match(a,pattern,indexA+1,indexP+1);
            }
            else if (pattern[indexP] == 2 && a[indexA] > 9 && a[indexA] < 100)
            {
                return match(a,pattern,indexA+1,indexP+1);
            }
            else if (pattern[indexP] == 0 && a[indexA] >=0 && a[indexA] < 100)
            {
                return match(a,pattern,indexA+1,indexP+1);
            }
            else return match(a,pattern,indexA+1,0);
        }
