package InterfacesAndAbstraction_Exercise.Telephony;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Smartphone implements Callable, Browsable{
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String call() {
        StringBuilder calledNumbers = new StringBuilder();

        getCalledNumbers(calledNumbers);

        return calledNumbers.toString().trim();
    }

    @Override
    public String browse() {
        StringBuilder browsedSites = new StringBuilder();

        getBrowsedSites(browsedSites);

        return browsedSites.toString().trim();
    }

    private void getBrowsedSites(StringBuilder browsedSites) {
        Pattern pattern = Pattern.compile("^([^0-9]+)$");

        for (String url : urls) {
            Matcher matcher = pattern.matcher(url);

            if (matcher.find()) {
                browsedSites.append("Browsing: ").append(url).append("!").append(System.lineSeparator());
            }else {
                browsedSites.append("Invalid URL!").append(System.lineSeparator());
            }
        }
    }

    private void getCalledNumbers(StringBuilder calledNumbers) {
        Pattern pattern = Pattern.compile("^([0-9]+)$");

        for (String number : numbers) {
            Matcher matcher = pattern.matcher(number);

            if (matcher.find()) {
                calledNumbers.append("Calling... ").append(number).append(System.lineSeparator());
            }else {
                calledNumbers.append("Invalid number!").append(System.lineSeparator());
            }
        }
    }
}
