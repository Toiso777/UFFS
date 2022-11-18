#include <stdio.h>

int main(){
    int v[10],i,p,j;
    
  for(i=0;i<=9;i++){
        printf("Digite o valor do vetor %d\n", i+1);
        scanf("%d",&v[i]);
    }
    printf("Os valores no vetor são\n");
    for(i=0;i<=9;i++){
        printf("%d, ", v[i]);
    }


//-------------------------------------------------------------------


    for(i=1;i<=9;i++){
        p=v[i];
        for(j=i;j>=1 && p<v[j-1];j--){
            v[j] = v[j-1];
        }
        v[j] = p;
    }

    printf("\nOs valores ordenados são:\n");
    for(i=0;i<=9;i++){
        printf("%d, ", v[i]);
    }
}