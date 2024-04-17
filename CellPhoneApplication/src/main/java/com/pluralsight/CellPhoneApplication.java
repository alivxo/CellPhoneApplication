package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to CellPhoneApplication!");

    CellPhone phone = new CellPhone();
    System.out.print("What is the serial number ? ");
    int serial = in.nextInt();
    phone.setSerialNumber(serial);

    System.out.print("What model is the phone? ");
    String model = in.next();
    phone.setModel(model);

    System.out.print("What is the carrier? ");
    String carrier = in.next();
    phone.setCarrier(carrier);

    System.out.print("What is the phone number?");
    String phoneNumber = in.next();
    phone.setPhoneNumber();

    System.out.print("Who is the owner of the phone? ");
    String owner = in.next();
    phone.setOwner(owner);

    }
}
