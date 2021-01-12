#include<iostream>
#include<stdio.h>
using namespace std;
int main(){
    double C,sum=0;
    cin >> C;
    if(C>0 && C<=100){
        int L;
        cin >> L;
        if(L>0 && L<=100){
            for(int i=0;i<L;i++){
                double len,wid;
                cin >> len >> wid;
                sum+=len*wid;
            }
            printf("%0.7f",sum*C);
        }
    }
    return 0;
}