/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package wrappertypes;
/**
 *
 * @author mrust
 */
public class WrapperTypes {

    public static void main(String[] args) {

        Integer i = 5; // Bu yazilisla asaqidaki arasinda coxda bir ferq yoxdur.Sadece yaddasda qenaet edir bu cure yazdiqda
        
        Integer i2 = new Integer(4); // Wrapper types adlanir ve deyisken haqda muxtelif methodlardan istifade etmeye imkan verir
              
        // Asaqida yazilan kodlarla iki reqem arasinda rastgele eded alaciyiq
        
        int min = 9;
        int max = 17;
        int randomNum = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println(randomNum);
        
        String s0 = "Salam";
        String s1 = "Salam";
        
        String s2 = new String("Salam");
        String s3 = new String("Salam");
        
        char[] arr = {'S','a','l','a','m'};
        String s4 = new String(arr);
        System.out.println(s4);
        
        // Normalda Stringin uzerine basqa bir element gelmek basqa obyektyaranmasina ve
        // performansin dusmesine sebeb olur bu hallarda asaqidaki StringBuilder methodundan istifade edirik
        // Asaqidaki usulla yaradilan elementler massive doldurulur
        
        StringBuilder b = new StringBuilder(); 
        b.append("Salam");
        b.append("Necesen");
        String result = b.toString();
        System.out.println(result);
        
        // StringBuilder usulu ile StringBuffer usulunun ferqi budurki buffer usulu 
        // synchronized ile isleyir yeni buni static sekilde class daxilinde yazsaq ve 
        // diger class larda caqirib String append elemek istesek bu zaman bunlar birlerini
        // gozlemek mecburiyyetindedirler StringBuilder - de synchronized yoxdur
        
        StringBuffer b2 = new StringBuffer(); // thread safe
        b.append("Salam");
        b.append("Necesen");
        String result2 = b2.toString();
        System.out.println(result2);
        
 
    }

    public static void MathMethodlari() {

        // Deyeri integere cevirir
        int x = Integer.parseInt("10");
        System.out.println("parseInt " + x);

        // Math methodlari
        // 0.4 olduqda asaqiya yuvarlaqlasdirir boyuk olduqdaise yuxari
        System.out.println("round " + Math.round(0.4));

        // Her zaman asaqi yuvarlaqlasdirir
        System.out.println("floor " + Math.floor(0.9));

        // Her zaman yuxari yuvarlaqlasdirir
        System.out.println("ceil " + Math.ceil(0.1));

        // Menfi ededleri musbet edir
        System.out.println("abs " + Math.abs(-199));

        // Yazdiqin qeder quvvete qaldirir meselen 2 usdu 5
        System.out.println("pow " + Math.pow(2, 5));

        // Kok altina salir
        System.out.println("sqrt " + Math.sqrt(16));

        // 0 ve 1 arasinda bir eded qaytarir her defe
        System.out.println("random " + (int) (Math.random() * 10));
        
        

    }
}
