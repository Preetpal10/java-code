#include <iostream>
using namespace std;

int main(){
    int arr[] = {1,4,3,2,6,5};
    int n = 6;
    int left = arr[0];
    int right = n-1;
  
    while(arr[left] <= arr[right]){
      ans = swap(arr[left], arr[right]);
        left++;
        right--;
    }

    cout << ans << endl;
}