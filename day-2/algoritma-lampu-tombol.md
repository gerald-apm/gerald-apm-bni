# Algoritma Lampu dan Tombol

## Flowchart Link
```
https://files.digi46.id/index.php/s/GcLs4ejokPKixsb
``` 

## Code Implementation (Java)
```
public class Main {

    static String lampuTombol(int tombol, boolean lampu) {
        int bagi = 1;
        while (bagi <= tombol) {
            // cek apakah faktor dari "bagi"?
            if (tombol % bagi == 0) {
                // membalik status lampu yg false menjadi true, dan sebaliknya
                lampu = !lampu;
            }
            bagi++;
        }

        if (lampu)
            return "lampu menyala";
        else
            return "lampu mati";
    }

    public static void main (String[] args) {
        String lampu = lampuTombol(10, false);
        System.out.println(lampu);
    }

}
```
