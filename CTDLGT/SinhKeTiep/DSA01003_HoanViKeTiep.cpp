#include <bits/stdc++.h>
using namespace std;

bool check(int n, int arr[])
{
    int check;
    for (int i = n; i > 0; i--)
    {
        if (arr[i] == n - i + 1)
        {
            check = 1;
        }
        else
        {
            check = 0;
            break;
        }
    }
    if (check == 1)
    {
        return true;
    }
    return false;
}
int main()
{
    int t, n;
    cin >> t;
    while (t-- > 0)
    {
        cin >> n;
        int arr[n + 1];

        for (int i = 1; i <= n; i++)
        {
            cin >> arr[i];
        }
        if (check(n, arr) == true)
        {
            /* code */
            for (int i = 0; i < n; i++)
            {
                cout << i << " ";
            }
            cout << endl;
        }
        else
        {
            int j = n - 1;
            while (j > 0 && arr[j] > arr[j] + 1)
            {
                j--;
            }
            if (j > 0)
            {
                int k = n;
                while (arr[j] > arr[k])
                {
                    k--;
                }
                int t = arr[j];
                arr[j] = arr[k];
                arr[k] = t;
                int r = j + 1, s = n;
                while (r <= s)
                {
                    t = arr[r];
                    arr[r] = arr[s];
                    arr[s] = t;
                    r++;
                    s--;
                }
            }
            for (int i = 1; i <= n; i++)
            {
                cout << arr[i] << " ";
            }
            cout << endl;
        }
        system("pause");
        return 0;
    }
}