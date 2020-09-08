#include <iostream>
#include <random>


using namespace std;
#define ROWS 5
#define COLS 5
int main( )
{
    random_device rd;
    int times;

    bool cellules[ROWS][COLS];
    cout<<"the cellules are: "<<endl;
    for(int i = 0; i < ROWS; ++i) {
        for(int j = 0; j < COLS; j++) {
            if(i == 0 || j == 0 || i == ROWS-1 || j == COLS-1)
                cellules[i][j] = 0;
            else{
                cellules[i][j] = rd()%10>3?1:0;
                cout << cellules[i][j] << " ";
            }
        }
        cout<<endl;
    }
    cout << endl;
    cout<< "please, input evolution times ";
    cin>>times;
    for(int i = 0; i < times; i++){
        cout << "evolution "<<i+1<<endl;
        bool tmp[ROWS][COLS];
        for(int j = 0; j < ROWS; ++j) {
            for(int k = 0; k < COLS; k++) {
                tmp[j][k] = cellules[j][k];
            }
        }
        for(int j = 1; j < ROWS-1; j++){
            for(int k = 1; k < COLS-1; k++){
                int count = (int)tmp[j-1][k-1]+(int)tmp[j-1][k]+(int)tmp[j-1][k+1]
                            +(int)tmp[j][k]+(int)tmp[j][k+1]
                            +(int)tmp[j+1][k-1]+(int)tmp[j+1][k]+(int)tmp[j+1][k+1];
                if(cellules[j][k] == 0){
                    if(count == 3)
                        cellules[j][k] = 1;
                }else{
                    if(count > 3 || count < 2)
                        cellules[j][k]  = 0;
                }
                cout << cellules[j][k] << " ";
            }
            cout<<endl;
        }
    }

    return 0;
}
