class Main
{
    public static void main(String[] args)
    {
        int[] vetor = { 100, 55, 23, 145, 22, 4, 5, 7, 2 };

        for (int i = 0; i < 9; i++) {
            System.out.print(vetor[i] + ", ");
        }
        System.out.print("\n");
 
        Timsort.sort(vetor);
 
        for (int i = 0; i < 9; i++) {
            System.out.print(vetor[i] + ", ");
        }
        System.out.print("\n");
    }
}