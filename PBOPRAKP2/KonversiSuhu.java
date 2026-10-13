
package PBOPRAKP2;

public class KonversiSuhu {
     double c;
    double f;
    double r;
    
    void hitung(){
        System.out.println("Celcius To Fahrenheit : " + ((c * 9 / 5 ) + 32));
        System.out.println("Fahrenheit To Celcius : " + ((f - 32) * 5 / 9));
        System.out.println("Celcius to Reamur : " + (c * 4 / 5));
        System.out.println("Reamur to celcius : " + (r * 5 / 4));
        System.out.println("Fahrenheit to Reamur : " + ((f - 32) * 4 / 9));
        System.out.println("Reamur to Fahrenheit : " + ((r * 9 / 4) + 32));
        
        
    }
}

