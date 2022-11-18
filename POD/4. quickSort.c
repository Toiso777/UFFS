#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void quickSort(int *vet, int start, int end){
    int pivo;

    if (start < end){
        pivo = particiona(vet,start,end);
        quickSort(vet, start, pivo - 1);
        quickSort(vet, pivo + 1, end);
    }
}

int particiona(int *vet, int start, int end)
{
    int pivo = end;
    int k = start;
    int aux;
    for (int i = start; i < end; i++){
        if (vet[i] <= vet[pivo])
        {
            aux = vet[i];
            vet[i] = vet[k];
            vet[k] = aux;
            k++;
        }
    }
    if (vet[k] > vet[pivo])
    {
        aux = vet[k];
        vet[k] = vet[pivo];
        vet[pivo] = aux;
        pivo=k;
    }
    return pivo;
}

void main()
{
    int v[] = {2, 7, 1};
    quickSort(v, 0, 2);
    printf("Os valores ordenados são:\n");
    for (int i = 0; i <= 2; i++)
    {
        printf("%d, ", v[i]);
    }
}
