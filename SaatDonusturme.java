Öğrenci no 260541037
AD-SOYAD KÜBRA DEVECİ 

public class SaatDonusturme{
    public static void main(String[] args) {
            int toplamSaniye = 7384;
                    int saat = toplamSaniye / 3600;
                            int kalanSaniye = toplamSaniye % 3600;
                                    int dakika = kalanSaniye / 60;
                                            int saniye = kalanSaniye % 60;
                                                    System.out.println(saat + " saat " + dakika + " dakika " + saniye + " saniye");
                                                        }
                                                        }
}
// Bu program, toplam saniyeyi saat, dakika ve saniye birimlerine dönüştürür.
// Bölme (/) operatörü ile saat ve dakika miktarları hesaplanırken, mod (%) operatörü ile kalan saniyeler bulunur.