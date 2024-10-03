import java.util.Scanner;

public class SeasonExample {

    public enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the month");
        String month = scanner.nextLine();

        Season  season;

        switch (month.toLowerCase()) {
            case "december":
            case "january":
            case "february":
                season = Season.WINTER;
                System.out.println(season);
                break;
            case "march":
            case "april":
            case "may":
                season = Season.SPRING;
                System.out.println(season);
                break;
            case "june":
            case "july":
            case "august":
                season = Season.SUMMER;
                System.out.println(season);
                break;
            case "september":
            case "october":
            case "november":
                season = Season.AUTUMN;
                System.out.println(season);
                break;
            default:
                System.out.println("Try again please!");

        }
        scanner.close();
    }
}
