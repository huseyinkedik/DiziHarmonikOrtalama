public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};

        double harmSeri = 0.0;

        for (int i = 1; i <= list.length; i++) {  //harmonik seri hesaplandı.
            harmSeri += 1.0 / i;
        }
        System.out.println(list.length / harmSeri);  // dizideki eleman sayısı, harmınik seriye bölündü.
    }
}