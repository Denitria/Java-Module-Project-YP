public class  Main {
    public static void main(String[] args) {
        System.out.println("Калькулятор счёта");
        int number;
        float sum;
        float allPrice;
        Calculator calc = new Calculator();
        number = calc.scannerNumber();
        Product prod = new Product();
        prod = calc.scannerProducts(prod);
        System.out.println("Добавленные товары:");
        System.out.println(prod.getProducts());
        sum = prod.getPrice() / number;
        allPrice = prod.getPrice();
        Formatter format = new Formatter();
        System.out.printf("Общая сумма: %,.2f %s\n", allPrice, format.formatSum(allPrice));
        System.out.printf("Сумма которую должен заплатить каждый: %,.2f %s", sum, format.formatSum(sum));
    }
}