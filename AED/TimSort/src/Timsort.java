class Timsort
{
    public static int timSortRun(int n)
    {
        if (n >= 0){
          int r = 0;
          while (n >= 32){
              r |= (n & 1);
              n >>= 1;
          }
          return n + r;
        }
         else return -1;
    }

    public static void insertion(int[] vetor, int esq, int dir){
        for (int i=esq+1; i<=dir; i++){
            int aux = vetor[i];
            int j = i-1;
            while (j >= esq && vetor[j] > aux){
                vetor[j+1] = vetor[j];
                j-=1;
            }
            vetor[j+1] = aux;
        }
    }
 
    public static void merge(int[] vetor, int l, int m, int r){
        int len1 = m - l + 1, len2 = r - m;
        int[] esq = new int[len1];
        int[] dir = new int[len2];
        for (int x = 0; x < len1; x++){
            esq[x] = vetor[l + x];
        }
        for (int x = 0; x < len2; x++){
            dir[x] = vetor[m + 1 + x];
        }
        int i = 0;
        int j = 0;
        int k = l;
 
        while (i < len1 && j < len2){
            if (esq[i] <= dir[j]){
                vetor[k] = esq[i];
                i++;
            } else {
                vetor[k] = dir[j];
                j++;
            }
            k++;
        }
 
        while (i < len1){
            vetor[k] = esq[i];
            k++;
            i++;
        }
 
        while (j < len2){
            vetor[k] = dir[j];
            k++;
            j++;
        }
    }

    public static void sort(int[] vetor)
    {
        int n = vetor.length;
        int minRun = timSortRun(n);
        for (int i = 0; i < n; i += minRun)
        {
            insertion(vetor, i,Math.min((i + 32 - 1), (n - 1)));
        }
 
        for (int size = minRun; size < n; size = 2 * size)
        {
            for (int esq = 0; esq < n; esq += 2 * size){
 
                int mid = esq + size - 1;
                int dir = Math.min((esq + 2 * size - 1),
                                     (n - 1));
                  if(mid < dir)
                    merge(vetor, esq, mid, dir);
            }
        }
    }

}