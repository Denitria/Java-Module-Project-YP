public class Formatter {

    public String formatSum(float sum) {
        int num = (int)sum;
        var penultimateNumber = num % 100 / 10;
        var lastNumber = num % 10;

        if (penultimateNumber == 1) {
            return "рублей";
        }

        switch (lastNumber) {
            case 1:
                return "рубль";
            case 2, 3, 4:
                return "рубля";
        }

        return "рублей";
    }
}