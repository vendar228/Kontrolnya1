public class zadanie2 {
    public static void main(String[] args)
    {
        int[] array = new int[8];
        int j = 0;
        int fill = array.length;
        System.out.println(" ");
        System.out.println("zadanie2:");

        for (int i = 0; i < fill; ++i, j = j + 3) {
            array[i] = j;
            System.out.print(+array[i] + " ");
            System.out.println(" ");
        }
    }
}