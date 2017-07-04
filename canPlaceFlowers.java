public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int countPlots=0;
        int flowerstobePlanted=0;
        for(int i=0;i<flowerbed.length;i++)
        {
            if(n>0)
            {
                if (flowerbed[i]==0)
                {
                    countPlots++;
                    if(i==flowerbed.length-1)
                    {
                        n=n-(countPlots/2);
                    }
                    
                }
                else if(flowerbed[i]==1)
                {
                    if(countPlots % 2 == 1)
                    {
                        n=n-(countPlots/2);
                    }
                    else if((countPlots % 2 == 0)  && (countPlots==i || i<flowerbed.length-2))
                    {
                        n=n-(countPlots/2);
                    }
                    countPlots = 0;
                }
                if(n<=0)
                    return true;
                
            }
            
        }
        return false;
    }
}
