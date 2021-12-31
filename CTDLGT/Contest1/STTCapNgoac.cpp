#include <bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;cin.ignore();
    while (t-->0)
    {
        int dem = 0;
        stack <int> st;
        string str;
        getline(cin,str);
        for (int i = 0; i < str.length(); i++)
        {
            if (str[i]=='(')    
            {
                st.push(++dem);
                cout<<dem<<" ";     
            }
            else if (str[i]==')')
            {
                cout<<st.top()<<" ";
                st.pop();
            }
            
            
        }
        cout<<endl;
    }
        system("pause");

    return 0;
    
}