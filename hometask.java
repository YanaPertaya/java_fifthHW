import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.toBinaryString;

public class hometask {
    


// Организовать вводи и хранение данных пользователей. ФИО возраст и пол
// вывод в формате Фамилия И.О. возраст пол
// добавить возможность выхода или вывода списка отсортированного по возрасту!)



    public static void main (String[] args){
        ArrayList<Integer> id = new ArrayList<>();
        ArrayList<String> surname = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> fathername = new ArrayList<>();
        ArrayList<String> age = new ArrayList<>();
        ArrayList<String> gendr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int i;
        i = 0;

        while (true) {
            System.out.println(String.format("%50s", "").replace(" ", " _ "));
            System.out.println("чтобы выйти нажмите Q");
            System.out.println("введите фамилию: ");
            id.add(i, i);
            surname.add(i, scanner.nextLine());
            if (surname.get(i).equals("q") || surname.get(i).equals("Q")) {
                break;

            }
            System.out.println("введите имя: ");
            name.add(i, scanner.nextLine());
            if (name.get(i).equals("q") || name.get(i).equals("Q")) {
                break;

            }

            System.out.println("введите отчество: ");
            fathername.add(i, scanner.next());
            if (fathername.get(i).equals("q") || fathername.get(i).equals("Q")) {
                break;

            }

            System.out.println("введите возраст: ");
            age.add(i, scanner.nextLine());
            if (age.get(i).equals("q") || age.get(i).equals("Q") {
                break;

            }

            System.out.println("введите пол - М или Ж : ");
            gendr.add(i, scanner.nextLine());
            if (gendr.get(i).equals("q") || gendr.get(i).equals("Q")) {
                break;

            }
            i += 1;

        }
        if (i == 0) System.out.println("отсутствует информация");
        else {
            System.out.println("введенная информация: ");
            for (i = 1; i < surname.size(); i ++) {
                System.out.println("информация о " + i + " человеке: " + surname.get(i-1) + " " + name.get(i-1) + " " + fathername.get(i-1) + " , " + age.get(i-1) + " , " + gendr.get(i-1) + " . ");

            }

            System.out.println("нажмите W чтобы выйти");
            System.out.println("нажмите S чтобы посмотреть список отсортированный по возрасту");
            String choice = scanner.nextLine();
            while (choice.equals ("W") || choice.equals("w")) {
                System.out.println("вышли из программы");
                break;
            }
            if (choice.equals ("S") || choice.equals("s")) {
                for (i = 0; i < age.size() -1 ; i ++) {
                    for (int j = i +1; j < age.size(); j++) {
                        if (Integer.parseInt(age.get(j)) < Integer.parseInt(age.get(i))) {
                            Collection.swap(age, i, j);
                            Collection.swap(surname, i , j);
                            Collection.swap(name, i, j);
                            Collection.swap(fathername, i, j);
                            Collection.swap(gendr, i, j);
                            }
                        }
                    }
                System.out.println("Информация, отсортирована по возрасту: ");
                for (i = 1; i < surname.size(); i++){
                    System.out.println("информация о " + i + " человеке: " + surname.get(i-1) + " " + name.get(i-1) + " " + fathername.get(i-1) + " , " + age.get(i-1) + " , " + gendr.get(i-1) + " . ");
                    
                }
                scanner.close();

            }
        }

    }
}



