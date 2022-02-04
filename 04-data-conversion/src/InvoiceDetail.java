import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The task is to create a new class with the main method called InvoiceDetail, it is required to develop a program that receives data from the invoice using the Scanner class as follows:
 * 1. Receive the invoice name or description, use nextLine() method to get the invoice name with spaces.
 * Receive 2 product prices of type double, use method nextDouble() to obtain prices with decimals.
 * Calculate the total, add both prices and add a 19% tax value.
 * You are asked to display in a single String the invoice name, the gross total (before tax), the tax and the net total including tax.
 * For example, the result could be something like this:
 * The invoice office product has a gross total of 134.78, with a tax of 25.6082 and the amount after tax is 160.3882.
 */

/**
 * La tarea consiste en crear una nueva clase con el método main llamada DetalleDeFactura, se requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner de la siguiente manera:
 * 1. Reciba el nombre de la factura o descripción, utilizar método nextLine() para obtener el nombre de la factura con espacios.
 * 2. Reciba 2 precios de productos de tipo double, utilizar método nextDouble() para obtener precios con decimales.
 * 3. Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%
 * Se pide mostrar en un solo String el nombre de la factura, el total bruto (antes de impuesto), el impuesto y el total neto incluyendo impuesto.
 * Por ejemplo, el resultado podría ser algo así:
 * La factura producto de oficina tiene un total bruto de 134.78, con un impuesto de 25.6082 y el monto después de impuesto es de 160.3882
 */

public class InvoiceDetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String invoiceName;
        double product1, product2, grossTotal = 0, tax = 0, netTotal = 0;
        System.out.print("Enter invoice name: ");
        invoiceName = sc.nextLine();
        try {
            System.out.println("Enter price of first product:");
            product1 = sc.nextDouble();
            System.out.println("Enter price of second product:");
            product2 = sc.nextDouble();
            grossTotal = product1 + product2;
            tax = grossTotal * 0.19;
            netTotal = grossTotal + tax;
        } catch (InputMismatchException e) {
            System.out.println("You must enter a real number");
            main(args);
            System.exit(0);
        }
        sc.close();
        System.out.println("The invoice " + invoiceName +
                " has a gross total of " + grossTotal + "€" +
                " with a tax of " + tax +"€" +
                " and the net total is " + netTotal + "€");
    }
}
