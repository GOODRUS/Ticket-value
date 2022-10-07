public class Main {
    public static void main(String[] args) {
        int ticketValue = 21_337; // Стоимость авиабилета в рублях
        int bonus = 20; // количества рублей для одной бонусной мили
        int bonusMile = (ticketValue / bonus ); // количество начисляемых бонусных миль за покупку авиабилета

        System.out.println(bonusMile + " бонусных миль");
    }
}