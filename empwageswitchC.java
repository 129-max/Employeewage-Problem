import java.util.Random;

public class empwageswitchC {
    public static void main(String[] args) {
        Random atte=new Random();
        int max=3;
        int half_time=4;
        int wage_per_hour=20;
        int hour_in_day=8;
        int Present = 1;
        int check=atte.nextInt(max);
        int totalWage;
        switch (check) {
            case 1 -> {
                totalWage = wage_per_hour * hour_in_day;
                System.out.println("total Wage for Day : " + totalWage);
            }
            case 2 -> {
                totalWage = wage_per_hour * half_time;
                System.out.println("PartTime Wage : " + totalWage);
            }
            default -> System.out.println("Employee is absent");
        }

    }

}
