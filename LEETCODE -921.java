class Solution {
    public int minAddToMakeValid(String s) {
        int i,j,o=0,c=0;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                o++;
            }
            else {
                if(o>0)
                {
                    o--;
                }
                else
                {
             c++;
                }
            }
        }

        return Math.abs(o+c);
    }
}
