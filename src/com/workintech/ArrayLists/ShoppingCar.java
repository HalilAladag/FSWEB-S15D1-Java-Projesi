package com.workintech.ArrayLists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ShoppingCar {
    private static ArrayList<String> shopList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = -1;
        while (choice != 0) {
            try {System.out.println("Seçenekler 0-1-2: ");
                System.out.println("0 - Uygulama sonlandırılıyor.");
                System.out.println("1 - Eklenmesini istediğiniz elemanları giriniz.");
                System.out.println("2 - Cıkarılmasını istediğiniz elemanları giriniz.");

                System.out.print("Seçiniz: ");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Eklenmesini istediğiniz elemanları giriniz: ");
                        String itemsToAdd = scanner.nextLine();
                        addItems(itemsToAdd);
                        break;
                    case 2:
                        System.out.print("Cıkarılmasını istediğiniz elemanları giriniz: ");
                        String itemsToRemove = scanner.nextLine();
                        removeItems(itemsToRemove);
                        break;
                    case 3:
                        printSorted();
                        break;
                    case 0:
                        System.out.println("Uygulama sonlandırılıyor.");
                        break;
                    default:
                        System.out.println("Geçerli bir seçenek girin.");
                }}
            catch (Exception ex){
                System.out.println(ex.getMessage());
                System.exit(0);
            }
        }

        scanner.close();
    }

    public static void addItems(String input) {
        String[] items = input.split(",");
        for (String item : items) {
            String formattedItem = item.trim();
            if (formattedItem != null && !formattedItem.isEmpty() && !shopList.contains(formattedItem)) {
                shopList.add(formattedItem);
            }
        }
        Collections.sort(shopList);
    }

    public static void removeItems(String input) {
        String[] items = input.split(",");
        for (String item : items) {
            String formattedItem = item.trim();
            if (shopList.contains(formattedItem)) {
                shopList.remove(formattedItem);
            }
        }
        Collections.sort(shopList);
    }

    public static void printSorted() {
        System.out.println("Grocery List:");
        for (String item : shopList) {
            System.out.println(item);
        }
    }
}