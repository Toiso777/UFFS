#include <stdio.h>

int main(){
    int v[10],count,pMin,aux,i;
    
  for(i=0;i<10;i++){
        printf("Digite o valor do vetor %d\n", i+1);
        scanf("%d",&v[i]);
    }
    printf("Os valores no vetor são\n");
    for(i=0;i<=9;i++){
        printf("%d, ", v[i]);
    }

    for(i=0;i<=8;i++){

        pMin = i;
        for(int j=i+1;j<=9;j++){
            if (v[j]<v[pMin]){
                pMin = j;
            }
        }
        aux = v[i];
        v[i] = v[pMin];
        v[pMin] = aux;
        
    }


    printf("\nOs valores ordenados são:\n");
    for(i=0;i<10;i++){
        printf("%d, ", v[i]);
    }
}

