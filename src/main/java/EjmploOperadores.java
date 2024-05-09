import java.util.ArrayList;
import java.util.Random;

public class EjmploOperadores {

    public static void main(String[] args) {
        //int a = 2, b = 3, c = 5;
        //boolean y = c * b++ <10 && b < 6;
        //System.out.println(y);
        //System.out.println(b);

        //boolean y2 = (--b + 2 * a < 10) && 7 * b++ < 5 * (c + 2);
        //System.out.println(b);
        //System.out.println(y2);

        //int y3 = (c - 3) / a * (--b + --b) / a + c;
        //System.out.println(y3);
        //System.out.println(b);

        /* //1. 
        for( int i = 1; i < 101; i++){
            System.out.println(i);
        }
        int i2 = 1; 
        while (i2 < 101){
            System.out.println(i2);
            i2++;
        }


        //2
        for(int j = 100; j > 0; j--){
            System.err.println(j);
        }        
        int j2 = 100;
        while (j2 > 0) {
            System.out.println(j2);
            j2 -- ;
        }


        //3. 
        for (int i3 = 7; i3 <= 77; i3+=7){
            System.out.println(i3);
        }
        int j3 = 7;
        while (j3 >= 70) {
            System.out.println(j3);
            j3 += 7;
        }


        //4.
        for (int i4 = 20; i4 >= 2; i4 -= 2){
            System.out.println(i4);
        }
        int j4 = 20;
        while (j4 >= 2) {
            System.out.println(j4);
            j4 -= 2;
        }


        //5. 
        for (int i5 = 2; i5 <= 20; i5 += 3){
            System.out.println(i5);
        }
        int j5 = 2;
        while (j5 <= 20) {
            System.out.println(j5);
            j5 += 3;
        }


        //6.
        for (int i6 = 99; i6 >= 33; i6 -= 11){
            System.out.println(i6);
        }
        int j6 = 99;
        while (j6 >= 33) {
            System.out.println(j6);
            j6 -= 11;
        }

        //7 "acumulador"
        int j7 = 0, acumulador=0;
        while (j7 <=10) {
            System.out.println(acumulador);
            acumulador+=  j7;
            j7++;
        }
        System.out.println("Resultado con while: " + acumulador );

        int total = 0;
        for(int i7 = 0; i7<=10;i7++){
            total += i7;
            System.out.println(i7);
        }
        System.out.println("El total es: " + total);

        //8. ""
        int cuenta = 1;
        System.out.println((cuenta > 10)? "Cuenta es mayor a 10": "Cuenta es menor a 10"); */

        //9. 
        /* int totalNotas = 0;
        ArrayList<Integer> notas = new ArrayList<Integer>();
        notas.add(3);
        notas.add(1);
        notas.add(2);
        notas.add(1);
        notas.add(5);
        notas.add(4);
        notas.add(3);
        notas.add(4);
        notas.add(5);
        notas.add(1);
        

        for(int nota: notas  ){
            totalNotas += nota;
        }
        System.out.println("El promedio de notas es " + totalNotas/10 ); */
        
        int totalNotas = 0;
        ArrayList<Integer> notas = new ArrayList<Integer>();
        Random random = new Random();
        
        for(int i = 0 ; i < 10 ; i++){
            notas.add(random.nextInt(5)+1);
            totalNotas += notas.get(i);
            //System.out.println(notas);
            //System.out.println(totalNotas);
        }
        System.out.println("El promedio de notas es " + totalNotas/10);

    }   





}
