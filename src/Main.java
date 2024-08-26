
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Ejercicio 1
        String nombre = "David";
        System.out.println("Bienvenido " + nombre);

        // Ejercicio 2

        // Uso de JOptionPane para obtener el nombre
        nombre = JOptionPane.showInputDialog("Introduce tu nombre");
        System.out.println("Bienvenido " + nombre);


        System.out.println("Ingrese su nombre:");
        nombre = sc.nextLine();
        System.out.println("Bienvenido " + nombre);

        // Ejercicio 3

        float a = 5;
        float b = 6;
        System.out.println("La suma es " + (a + b));
        System.out.println("La resta es " + (a - b));
        System.out.println("La multpilicación es " + (a * b));
        System.out.println("La divison es " + (a / b));
        System.out.println("El módulo es " + (a % b));

        // Ejercicio 4

        int c = 9;
        int d = 9;
        if (c < d) { System.out.println( c + " es menor a " + d); }
        else if (d < c) { System.out.println( c + " es mayor a " + d); }
        else {System.out.println("Ambos números son iguales");}

        //Ejercicio 5

        float e;
        System.out.println("Ingrese el valor del número para conocer si es divisible entre 2");
        e = sc.nextFloat();
        if (e%2 == 0) { System.out.println("El número es divisible entre 2");
        } else {System.out.println("El número no es divisible entre 2");}

        //Ejercicio 6

        float f;
        String input = JOptionPane.showInputDialog("Introduce el precio a calcular");
        f = Float.parseFloat(input);
        JOptionPane.showMessageDialog(null,"El precio con IVA incluido es " + (f + f*0.21));

        //Ejercicio 7

        int g = 1;

        while ( g<= 100){
            System.out.println(g);
            g = g+1;
        };
        //Ejercicio 8

        int h = 1;

        for (int i = 0; i < 100 ; i++) {
            System.out.println(h);
            h = h+1;
        }

        //Ejercicio 9

        int j = 1;
        for (int i = 0; i < 100 ; i++) {
            if(j%2 == 0 && j%3 == 0){
                System.out.println(j); }
            j = j+1;
        }
        //Ejercicio 10
    int k;

        do{
            String datoIngresado = JOptionPane.showInputDialog("Ingresa un número");
            k = Integer.parseInt(datoIngresado);
        } while (k < 0);

        System.out.println(k);

    //Ejercicio 11

      String passwordInput;
      String password = "computadora";
      int intentos = 3;
      boolean access = false;


      do {
          System.out.println("Por favor, ingrese la contraseña");
          passwordInput = sc.nextLine();
          if(password.equals(passwordInput)){

              System.out.println("Acceso Correcto");
              access = true;


          }
          intentos = intentos-1;
      } while (!access && intentos > 0);

//Ejercicio 12

       int dia;

      do {
          String l = JOptionPane.showInputDialog("Introduce un número de día de la semana");
          dia = Integer.parseInt(l);
      } while (dia < 1 || dia > 7);
        switch (dia) {
            case 1, 2, 3, 4, 5 :
                System.out.println("Día laboral");
                break;
            case 6, 7:
                System.out.println("Día no laboral");
                break;

        }
//Ejecicio 13


    }
}