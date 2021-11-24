# Algoritma Bilangan Prima

## link flowchart
```
https://files.digi46.id/index.php/s/X47Yn2AxRQgTgRW
``` 

## Code Implementation (Java)
```
public class Main {

    // menentukan apakah bilangan itu prima atau tidak
    // mengembalikan String
    static String isPrime (int bil) {
        if (bil == 1 || bil == 0) return "Bukan bilangan prima";
        int bagi = 2;
        while (bagi < bil) {
            if (bil % bagi == 0)
                return "Bukan bilangan prima";
            bagi++;
        }
        return "Bilangan prima";
    }

    public static void main (String[] args) {
        int angka = 17;
        String prima = isPrime(angka);
        System.out.println(prima);
    }
    
}
```
