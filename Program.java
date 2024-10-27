package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Person;
import entities.Company;
import entities.Individual;

public class Program {

	
	public static void main(String[] args) {
		

			Scanner sc = new Scanner(System.in);
				Locale.setDefault(Locale.US);
		
		List<Person> list = new ArrayList<>();	
				
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i=1; i<=n; i++) {
			System.out.println("Tax  payer #" + i + " data:");
			System.out.print("Individual or Company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
		sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExp = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExp));
			}
			else {
				System.out.print("Number of Employees: ");
				int employees = sc.nextInt();
				list.add(new Company(name, anualIncome, employees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		double sum =  0;
		for (Person pers : list) {
			System.out.println(pers.getName() + ": $ " +String.format("%.2f", pers.tax()) );
			sum += pers.tax();
		}
		System.out.println();
		System.out.println("TOTAL TAXEX: $ " + String.format("%.2f%n", sum));
		
		sc.close();
	}
	
	
	
}
