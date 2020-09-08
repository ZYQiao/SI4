#include <iostream>
#include <random>

using namespace std;

int main( )
{
    random_device rd;
    int times;
    bool cellules[5];
    cout<<"the cellules are: ";
    for(int i = 0; i < sizeof(cellules); ++i) {
        cellules[i] = rd() % 2;
        cout << cellules[i] << " ";
    }
    cout << endl;
    int n = sizeof(cellules);
    cout<< "please, input evolution times ";
    cin>>times;
    for(int i = 0; i < 5; i++){
        cout << "evolution "<<i+1<<endl;
        bool tmp[5];
        for(int j = 0; j < n; j++){
            tmp[j] = cellules[j];
        }
        for(int j = 0; j < n; j++){
            cellules[j] = tmp[(j+1+n)%n] && tmp[(j-1+n)%n];
        }
        for(int j = 0; j < n; j++){
            cout << cellules[j] << " ";
        }
        cout << endl;
    }
    return 0;
}
