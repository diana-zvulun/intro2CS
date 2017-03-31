//Recursion that gets a matrix and returns the longest series of ascending numbers 

public static int longestWorm(int[][] mat)
    {
        return longestWorm(mat, 0, 0, 0, 0, -1);
    }

private static int longestWorm(int[][] mat, int i, int j, int count, int maxCount, int prev)
    {
        if (i < 0 || j < 0 || i == mat.length || j == mat[i].length)
            return maxCount;
        if (mat[i][j] == -1) //been here
            return maxCount;
        int current = mat[i][j];
        mat[i][j] = -1;

        if (count > maxCount)
        {
            maxCount = count;
        }

        if (current == prev + 1)
        {
            count++;
        } else
        {
            count = 1;
        }

        int count1 = longestWorm(mat, i + 1, j, count, maxCount, current);
        int count2 = longestWorm(mat, i - 1, j, count, maxCount, current);
        int count3 = longestWorm(mat, i, j + 1, count, maxCount, current);
        int count4 = longestWorm(mat, i, j - 1, count, maxCount, current);

        mat[i][j] = current;
        return Math.max(Math.max(count1, count2), Math.max(count3, count4));
    }
