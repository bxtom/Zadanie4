package com.tomek;

/*
* 4. Napisz​ ​ program,​ ​ który​ ​ będzie​ ​ symulować​ ​ pracę​ ​ biletomatu.
* a. Użytkownik​ ​ podaje​ ​ ilość​ ​ biletów​ ​ (zakładamy,​ ​ że​ ​ każdy​ ​ kosztuje​ ​ 4​ ​ PLN).
* b. Program​ ​ prosi​ ​ o​ ​ dokonanie​ ​ zapłaty.
* c. Użytkownik​ ​ wpisuje​ ​ kwotę​ ​ do​ ​ konsoli.
* d. Program​ ​ wypisuje​ ​ należną​ ​ resztę​ ​ w​ ​ postaci:
* Suma​ ​ reszty:​ ​ (a+b+c+d+e)​ ​ PLN
* a​ ​ =​ ​ 200*A
* b​ ​ =​ ​ 100*B
* c​ ​ =​ ​ 50*C
* d​ ​ =​ ​ 20*D
* e​ ​ =​ ​ 10*E
* f​ ​ =​ ​ 5*F
* g​ ​ =​ ​ 2*G
* h​ ​ =​ ​ 1*H
* Gdzie​ ​ A-H​ ​ to​ ​ ilość​ ​ wydanych​ ​ banknotów/monet,​ ​ z​ ​ których​ ​ składa​ ​ się​ ​ reszta.
* e. Zakładamy,​ ​ że​ ​ biletomat​ ​ posiada​ ​ nieograniczoną​ ​ liczbę​ ​ zasobów​ ​ banknotów
* oraz​ ​ monet,​ ​ a​ ​ także​ ​ priorytetyzuje​ ​ wypłatę​ ​ możliwie​ ​ największych​ ​ nominałów.
* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int TICKET_PRICE = 4;

        System.out.println("Ile biletow chcesz kupic");
        Scanner scanner = new Scanner(System.in);
        int numberOfTickets = scanner.nextInt();
        int amountToPay = numberOfTickets * TICKET_PRICE;

        System.out.println("Kwota do zaplaty: " + amountToPay);
        System.out.println("Ile masz pieniedzy?");
        int providedAmountOfMoney = scanner.nextInt();

        int rest = providedAmountOfMoney - amountToPay;
        System.out.println("Reszta: " + rest);

        int denominations[] = {200, 100, 50, 20, 10, 5, 2, 1};

        StringBuilder result = new StringBuilder();
        for (int denomination : denominations) {
            int howMany = rest / denomination;
            rest = rest - (denomination * howMany);
            result.append(denomination).append("x").append(howMany).append(" ");
        }

        System.out.println(result);

    }
}
