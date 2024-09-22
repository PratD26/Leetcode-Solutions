class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        
        ans = []
        A = len(word1)
        B = len(word2)
        i=0
        j=0

        while (i < A or j < B):

            if(i < A):
                ans.append(word1[i])
                i += 1

            if(j < B):
                ans.append(word2[j])
                j +=1
        
        return ''.join(ans)



        