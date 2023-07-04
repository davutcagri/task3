import java.util.ArrayList;
import java.util.Random;

//İki array, ikisinin de 10 elementi olucak, bütün elementler random verilicek,
// iki array karşılaştırıp x arrayın de olup y elementinde olmayanlar yazılıcak ve tam tersi, ve ikisinde de ortak olan elementler alınıcak.
public class Main {
    public static void main(String[] args) {

        ArrayList birinciArray = new ArrayList();
        ArrayList ikinciArray = new ArrayList();
        ArrayList ortakElemanlar = new ArrayList();
        ArrayList birincininOzgunElemanları = new ArrayList();
        ArrayList ikincininOzgunElemanları = new ArrayList();

        //Arrayleri oluşturma.
        for (int i = 1; i <= 10; i++) {
            Random random = new Random();
            int birinciDeger = random.nextInt(10) + 1;
            int ikinciDeger = random.nextInt(10) + 1;

            birinciArray.add(birinciDeger);
            ikinciArray.add(ikinciDeger);
        }

        //Ortak elemanları bulma.
        for (int i = 0; i < birinciArray.size(); i++) {
            if (birinciArray.contains(ikinciArray.get(i))) {
                if (!ortakElemanlar.contains(ikinciArray.get(i))) {
                    ortakElemanlar.add(ikinciArray.get(i));
                }
            }
        }

        //Özgün elemanları bulma.
        for (int z = 0; z < birinciArray.size(); z++) {
            if (ortakElemanlar.indexOf(birinciArray.get(z)) == -1) {
                birincininOzgunElemanları.add(birinciArray.get(z));
            }
            if (ortakElemanlar.indexOf(ikinciArray.get(z)) == -1) {
                ikincininOzgunElemanları.add(ikinciArray.get(z));
            }
        }

        System.out.println("İlk dizinin uzunluğu: " + birinciArray.size());
        System.out.println("İkinci dizinin uzunluğu: " + ikinciArray.size());
        System.out.println("------------------------------");
        System.out.println("Birinci dizi: " + birinciArray);
        System.out.println("İkinci dizi: " + ikinciArray);
        if (ortakElemanlar.size() != 0) {
            System.out.println("Ortak elemanlar: " + ortakElemanlar);
        } else {
            System.out.println("Hiç ortak eleman yok");
        }
        System.out.println("Birinciye özgün elemanlar: " + birincininOzgunElemanları);
        System.out.println("İkinciye özgün elemanlar: " + ikincininOzgunElemanları);

    }
}