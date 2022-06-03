package msOneMillion;

public class oneMillion {
    private static double [] ms=new double[700_000_000];

    public static void main(String[] args) {
        for (int i = 0; i < ms.length; i++) {
                ms[i]=i;
                System.out.println(ms[i]+" ");



        }

    }
}
