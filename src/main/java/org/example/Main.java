package org.example;

import org.example.MODELOS.Apartamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("**********************************");
        System.out.println("Hola Propietario ");
        System.out.println("**********************************");

        System.out.println("\n Bienvenido!!!");

        Scanner lea = new Scanner (System.in);
        Apartamento apartamento = new Apartamento();

        System.out.print("Digita tu ubicacion:");
        apartamento.setUbicacioin(lea.nextLine());

        System.out.print("Digita el tamaño del apartamento:");
        apartamento.setTamaño(lea.nextInt());

        System.out.print("Digita tipo de iluminacion:");
        apartamento.setIluminacionNatural(lea.next());

        System.out.println("Que acabados posee el apartamento:");
        apartamento.setAcabados(lea.nextLine());

        System.out.println("Digita las areas de lujo:");
        apartamento.setAmenidades(lea.next());

        System.out.println("Digite el costo:");
        apartamento.setCosto(lea.nextInt());

        System.out.println("Digite las condiciones del apartemento:");
        apartamento.setAcabados(lea.next());

        System.out.println(apartamento);

        

    }
}