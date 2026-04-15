package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone cellPhone3 = new CellPhone(1212,"tem","ver","267-437","rick");

        System.out.println("Phone one");
        CellPhone cellPhone1 = getInfo(scanner);

        System.out.println("Phone two");
        CellPhone cellPhone2 = getInfo(scanner);
//        System.out.print("What is the serial number? ");
//        int serialNumber = scanner.nextInt();
//        scanner.nextLine();
//        cellPhone1.setSerialNumber(serialNumber);
//
//        System.out.println("What model is the phone? ");
//        String model = scanner.nextLine();
//        cellPhone1.setModel(model);
//
//        System.out.println("Who is the carrier? ");
//        String carrier = scanner.nextLine();
//        cellPhone1.setCarrier(carrier);
//
//        System.out.println("What is the phone number? ");
//        String phoneNumber = scanner.nextLine();
//        cellPhone1.setPhoneNumber(phoneNumber);
//
//        System.out.println("Who is the owner of the phone? ");
//        String owner = scanner.nextLine();
//        cellPhone1.setOwner(owner);
//==========================================================================================
//        System.out.print("What is the serial number? ");
//        int serialNumber2 = scanner.nextInt();
//        scanner.nextLine();
//        cellPhone2.setSerialNumber(serialNumber2);
//
//        System.out.println("What model is the phone? ");
//        String model2 = scanner.nextLine();
//        cellPhone2.setModel(model2);
//
//        System.out.println("Who is the carrier? ");
//        String carrier2 = scanner.nextLine();
//        cellPhone2.setCarrier(carrier2);
//
//        System.out.println("What is the phone number? ");
//        String phoneNumber2 = scanner.nextLine();
//        cellPhone2.setPhoneNumber(phoneNumber2);
//
//        System.out.println("Who is the owner of the phone? ");
//        String owner2 = scanner.nextLine();
//        cellPhone2.setOwner(owner2);
        System.out.println("Phone one details ");
        printInfo(cellPhone1);

        System.out.println("Phone two details");
        printInfo(cellPhone2);

        //cellPhone3.dial(cellPhone1.getPhoneNumber());

        cellPhone3.dail(cellPhone1);

        cellPhone1.dial(cellPhone2.getPhoneNumber());

        cellPhone2.dial(cellPhone3.getPhoneNumber());

        scanner.close();
    }
    public static void printInfo(CellPhone cellPhone){
        System.out.println("\n=========" + cellPhone.getOwner() + "=========");
        System.out.println("serial number: " + cellPhone.getSerialNumber());
        System.out.println("model: " + cellPhone.getModel());
        System.out.println("carrier: " + cellPhone.getCarrier());
        System.out.println("phone number: " + cellPhone.getPhoneNumber());
        System.out.println("owner: " + cellPhone.getOwner());
        System.out.println("===============");
    }

    public static CellPhone getInfo(Scanner scanner){
        CellPhone cellPhone = new CellPhone();

        System.out.print("What is the serial number? ");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();
        cellPhone.setSerialNumber(serialNumber);

        System.out.println("What model is the phone? ");
        String model = scanner.nextLine();
        cellPhone.setModel(model);

        System.out.println("Who is the carrier? ");
        String carrier = scanner.nextLine();
        cellPhone.setCarrier(carrier);

        System.out.println("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        cellPhone.setPhoneNumber(phoneNumber);

        System.out.println("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        cellPhone.setOwner(owner);

        return cellPhone;

    }
}
