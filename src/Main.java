public class Main {

    public static void main(String[] args) {

        int amount = 200; // сумма на счету
        int addamount = 1300; // сумма пополнения
        int bonus = 100; // бонусный рубль за 100 рублей

        int totalbonus;
        if (addamount > 1000) {
            totalbonus = addamount / bonus;
        } else {
            totalbonus = 0;
        }

        // int totalbonus = addamount > 1000 ? addamount / bonus : 0;

        int totalamount = amount + totalbonus + addamount;

        System.out.println("Сумма бонуса: " + totalbonus);
        System.out.println("Итого на счету: " + totalamount);
    }

}

