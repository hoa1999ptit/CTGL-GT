#include <bits/stdc++.h>
using namespace std;
void xuly(string str)
{
    int dem = 1;
    string result;
    stack<int> stack;
    for (int i = 0; i <= str.length(); i++)
    {
        stack.push(i + 1);
        if (i == str.length() || str[i] == 'I')
        {
            while (!stack.empty())
            {
                result += to_string(stack.top());
                stack.pop();        dem++;

            }
        }
    }
    cout << "Test %d:"+dem << result << endl;
}
int main()
{
    int t;
    string str;
    cin >> t;
    while (t-- > 0)
    {
        cin >> str;
        xuly(str);
    }
    system("pause");

    return 0;
}
