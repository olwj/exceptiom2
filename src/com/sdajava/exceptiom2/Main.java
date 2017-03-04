package com.sdajava.exceptiom2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        int tab[] = {1,2,3,4,5};

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int index = -10;
        boolean correct = false;

        System.out.println("Podaj index tablicy ktory chcesz zobaczyc");

	while (!correct){

        try{

            index = Integer.parseInt(in.readLine());


        }catch(IOException e) {
            System.out.println("blad odczytu danych");
        }catch (NumberFormatException e) {
            System.out.println("Podaj wartosc liczbowa!!");
        }

        if (index!= -10){
            correct = true;
        }
        }

        try{
            System.out.println(tab[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Niepoprawny numer");
        }


        }

    }



