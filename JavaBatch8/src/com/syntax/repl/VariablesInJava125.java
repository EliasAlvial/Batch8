package com.syntax.repl;

public class VariablesInJava125 {
    String nameOfCountry, capital,populationSize;

    public static void main(String[] args) {
        VariablesInJava125 mm=new VariablesInJava125();
        mm.nameOfCountry="USA";
        mm.capital="Washington DC";
        mm.populationSize="300000000";
        System.out.println("The capital of "+ mm.nameOfCountry+" is "+ mm.capital+" and population is "+ mm.populationSize);

        VariablesInJava125 mm1=new VariablesInJava125();
        mm.nameOfCountry="Kazakhstan";
        mm.capital="Astana";
        mm.populationSize="18500000";
        System.out.println("The capital of "+ mm.nameOfCountry+" is "+ mm.capital+" and population is "+ mm.populationSize);
    }
    //  Syntax version
    //  String name, capital;
    //	int population;
    //
    //	void displayDetails() {
    //		System.out.println("The capital of "+name+" is "+capital+" and population is "+population);
    //	}
    //
    //	public static void main(String[] args) {
    //
    //		Main country1=new Main();
    //		country1.name="USA";
    //		country1.capital="Washington DC";
    //		country1.population=330000000;
    //		country1.displayDetails();
    //
    //		Main country2=new Main();
    //		country2.name="Kazakhstan";
    //		country2.capital="Astana";
    //		country2.population=18500000;
    //		country2.displayDetails();
    //	}
}
