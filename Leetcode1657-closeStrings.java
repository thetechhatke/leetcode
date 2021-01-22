class Solution {
    public boolean closeStrings(String word1, String word2) {
        int l1=word1.length();
        int l2=word2.length();
        if(l1!=l2)
            return false;
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        for(int i=0; i<l1;i++)
        {
            char ch = word1.charAt(i);
            count1[ch-97]++;
        }
        for(int i=0; i<l2;i++)
        {
            char ch = word2.charAt(i);
            count2[ch-97]++;
        }
        for(int i=0; i<26;i++)
        {
            if((count1[i]!=0 && count2[i]==0)||(count2[i]!=0 && count1[i]==0))
            {
                return false;
            }
        }Arrays.sort(count1);
        Arrays.sort(count2);
        for(int i=0; i<26;i++)
        {
            if(count1[i]!=count2[i])
            {
                return false;
            }
        }
        return true;
    }
}
