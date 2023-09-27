public class Formatter {

    public String formatSum(float sum) {
        int num = (int)sum;
        int penultimateNumber = num % 100 / 10;
        int lastNumber = num % 10;

        if (penultimateNumber == 1) {
            return "рублей";
        }

        switch (lastNumber) {
            case 1:
                return "рубль";
            case 2:
            case 3:
            case 4:
                return "рубля";
        }

        return "рублей";
    }
}