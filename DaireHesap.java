Öğrenci No:260541037
AD-SOYAD:KÜBRA DEVECİ

Lütfen seçtiğiniz algoritmaya ait çözümü ve diğer isterleri aşağıya ekleyiniz:
public class DaireHesap {
        public static void main(String[] args) {
                    double yaricap = 3.5;
                            double cevre = 2 * Math.PI * yaricap;
                                    double alan = Math.PI * Math.pow(yaricap, 2);
                                            System.out.println("Çevre: " + cevre);
                                                    System.out.printf("Alan: %.2f%n", alan);
        }

             // Bu program, yarıçapı 3.5 olan bir dairenin çevresini ve alanını hesaplar.
             // Math.PI sabiti kullanılarak çevre (2 * PI * r) ve Math.pow() fonksiyonu ile alan (PI * r^2) formülleri hesaplanır.
             // Sonuçlar ekrana ek olarak printf("%.2f%n") ile virgülden sonra iki basamak olacak şekilde formatlanarak yazdırılır.