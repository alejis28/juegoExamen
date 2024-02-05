package org.example;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Integer opcionUsuario;
        Integer opcionComputadora;

        Scanner leer = new Scanner(System.in);
        System.out.println("*****  bienbenido al juego piedra papel tijera *****");

        System.out.println(" elige una opcion 1 piedra , 2 papel, 3 tijera");
        opcionUsuario = leer.nextInt();

       Random random = new Random();
        opcionComputadora=random.nextInt(3) + 1;
        System.out.println(opcionComputadora);



        if(opcionUsuario==opcionComputadora){
            System.out.println("empate!");

       }else if ((opcionUsuario==1&&opcionComputadora==3)||(opcionUsuario==2&&opcionComputadora==1)||(opcionUsuario==3&&opcionComputadora==2)){
            System.out.println("ganaste");

        }else{

            System.out.println("la computadora gana");
        }



    }
}