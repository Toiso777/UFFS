#include <stdio.h>


int main(){

    int v[11], i, y, count,aux;

    for(i=0;i<10;i++){
        printf("Digite o valor do vetor %d\n", i+1);
        scanf("%d",&v[i]);
    }
    printf("Os valores no vetor são\n");
    for(i=0;i<=9;i++){
        printf("%d, ", v[i]);
    }
    printf("\n");
    // size=sizeof(v)/4;


    for(count = 1; count<=9;count++){
        for(y=0;y<10;y++){
            if(v[y]>v[y+1]){
                aux = v[y];
                v[y] = v[y+1];
                v[y+1] = aux;
            }
        } 

    }

    printf("Os valores ordenados são:\n");
    for(i=0;i<10;i++){
        printf("%d, ", v[i]);
    }
}