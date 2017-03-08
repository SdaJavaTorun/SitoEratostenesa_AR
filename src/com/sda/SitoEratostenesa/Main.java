package com.sda.SitoEratostenesa;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int index = 2;      // pierwsza liczba pierwsza
        int n = 155;        // dla jakiego zakresu -1 szukac liczb pierwszych
        // pewnie da sie zrobic bez odejmowania ale ni widze gdzie jest konieczna zmiana
        int [] tab = new int[n+1]; // tablica robocza
        List<Integer> res = new ArrayList<>();  // lista do przechowywania liczb pierwszych

        // wypelnienie roboczej tablicy tab wartosciami = indeksowi tablicy
        for (int i=0; i<tab.length; i++)
            tab[i] = i;

        tab[index] = 2;         // inicjalizacja sita dla liczby 2 jako pierwszej z liczb pierwszych

        while (tab[index]+1 < tab.length) {
            if (index < n) {
                if (tab[index] != 1) {
                    res.add(tab[index]);
                    for (int i = tab[index] + tab[index]; i < tab.length; i += tab[index])
                        if (i % tab[index] == 0)
                            tab[i] = 1;
                }
                index++;
            }
            else break;
        }
        System.out.println("Tablica liczb pierwszych dla górnego zakresu 'n' = " + (n-1) + " : " + res.toString());
    }
}
