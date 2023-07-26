public class Main {
    public static void main(String[] args) {

        int ticketPrice = 12650; // Cтоимость билета
        int milePrice = 20; // Количество рублей для получения одной бонусной мили
        int mileBonus = (ticketPrice / milePrice);

        System.out.println((mileBonus) + " Миль(и) начислено за купленный билет");

    }
}