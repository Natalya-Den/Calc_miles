//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double ticket = 13676; // стоимость билета
        byte rubles = 20; //количество рублей для одной мили
        int miles; // бонусные мили

        miles = (int) ticket / rubles;

        System.out.println("Количество начисленных миль = " + miles);

    }
}