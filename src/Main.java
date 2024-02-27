public class Main {
//Geri Dönüşlü bir metot oluşturuldu
    static boolean isPalindrom(int number) {
//Değişkenler
        int temp = number, reverseNumber = 0, lastNumber;
//Döngü
        while (temp !=0 ){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
//İf sorgusu
        if (number == reverseNumber)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(2442));
//Program Bitişi
    }
}