class Solution {
public:
    int compress(vector<char>& chars) {
       int n = chars.size();

       int i=0, idx = 0;

       while(i<n)
       {
        char ch=chars[i];
        int count=0;

        while(i<n && ch==chars[i])
        {
            i++;
            count++;
        }

        chars[idx++]=ch;

        if(count>1)
        {
            string cnt=to_string(count);
            for(auto c : cnt)
            {
                chars[idx++]=c;
            } 
        }
       }
       return idx; 
    }
};