public class Main {
    public static void main(String[] args) {
        int count = 100;
        int pay = 1500;
        int bonus;
               if (pay > 1000) {
            bonus = pay / 100;
            count = count + pay + bonus;
            System.out.println("За Ваш плтёж " + pay + " рублей было начислено " + bonus + " бонуснов! Ваш баланс " + count + "рублей.");
        } else {
            count = count + pay;
            System.out.println("Поступил платёж " + pay + " рублей. Ваш баланс " + count);
        }

        System.out.println("Спасибо, что выбрали нашу компанию!");
    }
}