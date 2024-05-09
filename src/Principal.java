import com.aluracursos.modelos.ConsultaDivisa;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        ConsultaDivisa consultaDivisa = new ConsultaDivisa();
        Scanner lectura = new Scanner(System.in);
        var aConvertir = 0;
        consultaDivisa.consulta();
        System.out.println(consultaDivisa.consulta());
        System.out.println("************************************************");
        System.out.println("Bienvenido al sistema de conversion de divisas");
        while (true){
            System.out.println("Por favor seleccione la opcion deseada");
            System.out.println("1) Dolar ==> Peso Argentino");
            System.out.println("2) Peso argentino ==> Dolar");
            System.out.println("3) Dolar ==> Real brasilenio");
            System.out.println("4) Real brasilenio ==> Dolar");
            System.out.println("5) Dolar ==> Peso colombiano");
            System.out.println("6) Peso colombiano ==> Dolar");
            System.out.println("7) Salir");
            var opcion = Integer.valueOf(lectura.nextLine());
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el valor a convertir");
                    aConvertir = Integer.valueOf(lectura.nextLine());
            }
            System.out.println("************************************************");
        }
    }
}
