
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void mergeSort(int *n, int start, int end)
{
    if (start < end)
    {
        int mid = start + (end - start) / 2;
        mergeSort(n, start, mid);
        mergeSort(n, mid + 1, end);
        intercala(n, start, mid, end);
    }
}

void intercala(int *n, int start, int mid, int end)
{
    int aux[end - start + 1];
    int i = start;
    int j = mid + 1;
    int k = 0;
    while (i <= mid && j <= end)
    {
        if (n[i] <= n[j])
        {
            aux[k] = n[i];
            i++;
        }
        else
        {
            aux[k] = n[j];
            j++;
        }
        k++;
    }
    while (i <= mid)
    {
        aux[k] = n[i];
        k++;
        i++;
    }
    while (j <= end)
    {
        aux[k] = n[j];
        k++;
        j++;
    }
    for (int k = start; k <= end; k++)
    {
        n[k] = aux[k - start];
    }
}

int main()
{

    //  for(i=0;i<=2;i++){
    //         printf("Digite o valor do vetor %d\n", i+1);
    //         scanf("%d",&n[i]);
    //     }
    int n[] = {2, 7, 1};

    mergeSort(n, 0, 2);

    printf("Os valores no vetor são\n");
    for (int i = 0; i < 3; i++)
    {
        printf("%d ", n[i]);
    }
}
