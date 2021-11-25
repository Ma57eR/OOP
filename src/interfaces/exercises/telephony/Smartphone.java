package interfaces.exercises.telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable{
    List<String> numbers;
    List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder str = new StringBuilder();
        for (String url : urls) {
            boolean isValid = true;
            for (int index = 0; index < url.length(); index++) {
                if (Character.isDigit(url.charAt(index))) {
                    isValid = false;
                    str.append("Invalid URL!").append(System.lineSeparator());
                    break;
                }
            }
            if (isValid) {
                str.append("Browsing: ").append(url).append("!").append(System.lineSeparator());
            }
        }

        return str.toString();
    }

    @Override
    public String call() {
        StringBuilder str = new StringBuilder();
        for (String number: numbers) {
            boolean isValid = true;
            for (int index = 0; index < number.length(); index++) {
                if (!Character.isDigit(number.charAt(index))) {
                    isValid = false;
                    str.append("Invalid number!").append(System.lineSeparator());
                    break;
                }
            }
            if (isValid) {
                str.append("Calling... ").append(number).append(System.lineSeparator());
            }
        }
        return str.toString();
    }
}
