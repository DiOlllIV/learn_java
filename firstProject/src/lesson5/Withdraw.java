package lesson5;

public class Withdraw {

    public static void main(String[] args) {
        String[] clients = {"Jack", "Ann", "Denis", "Andrey", "Nikola", "Irina", "John"};
        int[] balances = {100, 500, 8432, 99, 12000, -54, 0};

        System.out.println(withdraw(clients, balances, "Irina", 5));
        //write your code here
    }

    public static int withdraw(String[] clients, int[] balances, String client, int money) {
        int count = 0;
        //write your code here
        for (int i = 0; i < clients.length; i++){
            if (clients[i] == client)
                count = i;
        }

        return ((balances[count] - money) <= 0 ) ? -1 : balances[count] - money;
    }
}