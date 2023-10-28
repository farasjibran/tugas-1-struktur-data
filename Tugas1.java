import java.util.Arrays;
import java.util.LinkedList;

public class Tugas1 {
  public static void main(String[] args) {
    // Deklarasi variable nilai dengan tipe data integer
    int nilai = 0;

    // Deklarasi variable kata dengan tipe data string dengan value struktur
    String kata = "struktur";

    // Deklarasi array satu dimensi dengan variable arraySatu dengan tipe data integer
    int[] arraySatu = {12, 10, 40};

    // Deklarasi array dua dimensi dengan variable arrayDua dengan tipe data integer
    int[][] arrayDua = {
      {12, 10, 40},
      {13, 11, 41},
      {14, 12, 42}
    };

    // Deklarasi linkedlist dengan variable linkedlist
    LinkedList<Integer> linkedList = new LinkedList<>();

    // Tambah value
    linkedList.add(10);
    linkedList.add(20);
    linkedList.add(30);
    linkedList.add(40);
    linkedList.add(50);

    // Print Hasil
    System.out.println("Variable Nilai : " + nilai);
    System.out.println("Variable Kata : " + kata);
    System.out.println("Array Satu Dimensi : " + Arrays.toString(arraySatu));

    System.out.println("Array Dua Dimensi : ");

    for (int i = 0; i < arrayDua.length; i++) {
      System.out.println(Arrays.toString(arrayDua[i]));
    }

    System.out.println("Linked List : " + linkedList);
  }
}