import java.util.Scanner;

public class Calculator {

    public int scannerNumber() {
        int number = 0;
        while (number <= 1) {
            Scanner in = new Scanner(System.in);
            System.out.print("Укажите на сколько человек необходимо разделить счет: ");
            if (in.hasNextInt()) {
                number = in.nextInt();
            }
        }

        return number;
    }

    public boolean checkProduct(String[] scannerProduct) {
        if (scannerProduct.length != 2) {
            return false;
        }
        float f;
        try {
            f = Float.parseFloat(scannerProduct[1]);
            if (f <= 0) {
                return false;
            }
        }
        catch (NumberFormatException e) {
            return false;
        }

        return true;
    }

    public Product scannerProducts(Product prod) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите товар и его стоимость через пробел:");
            String productAndCost = sc.nextLine();
            String[] productAndCostArray = productAndCost.split(" ");

            if (checkProduct(productAndCostArray)) {
                float price = Float.parseFloat(productAndCostArray[1]);
                prod.addProduct(productAndCostArray[0], price);
                System.out.println("Продукт успешно добавлен");
            } else {
                System.out.println("Неверный формат данных, продукт не был добавлен");
            }

            System.out.println("Если хотите добавить ещё один продукт введите любой символ или \"Завершить\"");
            String newProduct = sc.nextLine();
            if (newProduct.equalsIgnoreCase("завершить")) {
                break;
            }
        }

        return prod;
    }
}