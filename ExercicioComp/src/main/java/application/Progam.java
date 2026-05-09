package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entitiesEnum.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Progam {
    public static void main (String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Dados do Departamento
        System.out.print("Entre com o nome do Departamento: ");
        String departmentName = sc.nextLine();

        // Dados do trabalhador
        System.out.println("Entre com os dados do trabalhador: ");
        System.out.print("Nome: ");
        String workerName = sc.nextLine();
        System.out.print("LEVEL: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base Salario: ");
        Double baseSalary = sc.nextDouble();

        // Instanciando o trabalhador associado ao departamento
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.print("Quantos contratos esse trabalhador tem? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Entre com os dados do contrato #" + i + ":");
            System.out.print("Data (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duracao (horas): ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Entre o ano e mes para calcular o ganho (MM/YYYY): ");
        String monthAndYear = sc.next();

        // Extraindo mês e ano da string (MM/YYYY)
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Nome: " + worker.getName());
        System.out.println("Departamento: " + worker.getDepartment().getName());
        System.out.println("Ganho para " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}