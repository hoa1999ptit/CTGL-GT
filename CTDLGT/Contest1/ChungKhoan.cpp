#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t, n;
    int arr[n], res[n];
    cin >> t;
    while (t-- > 0)
    {
        cin >> n;
        for (int i = 0; i < n; i++)
        {
            cin >> arr[i];
        }
        xuly(arr, res, n);
    }
    system("pause");
    return 0;
}
void xuly(int price[], int res[], int n)
{
    stack <int> st;
    st.push(0);
    res[0] = 1;
    for (int i = 1; i < n; i++)
    {
        while (!st.empty() && price[st.top()] <= price[i])
        {
            st.pop();
        }
        if (st.empty()) res[i] = i + 1;
        else res[i] = i - st.top();
        st.push(i);
    }
    for (int i = 0; i < n; i++)
    {
        cout << res[i] << " ";
    }
    cout << endl;
}