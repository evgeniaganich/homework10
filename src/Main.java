public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println();
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println();
        System.out.println("Задание 2");
        System.out.println();
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
        System.out.println();
        System.out.println("Задание 3");
        System.out.println();
        String fullName1 = "Иванов Семён Семёнович";
        fullName1 = fullName1.replace('ё' , 'е');
        System.out.println("Данные ФИО сотрудника — " + fullName1);
        System.out.println();
        System.out.println("Задания повышенной сложности");
        System.out.println();
        System.out.println("Задание 5");
        System.out.println();
        String fullName2 = "Ivanov Ivan Ivanovich";
        int cut1 = fullName2.indexOf(' ', 0);
        int cut2 = fullName2.lastIndexOf(" ");
        int cut3 = fullName2.length();
        String firstName2 = fullName2.substring(cut1, cut2);
        String lastName2 = fullName2.substring(0, cut1);
        String middleName2 = fullName2.substring(cut2, cut3);
        System.out.println("Имя сотрудника - " + firstName2);
        System.out.println("Фамилия сотрудника - " + lastName2);
        System.out.println("Отчество сотрудника - " + middleName2);
        System.out.println();
        System.out.println("Задание 6");
        System.out.println();
        String fullName3 = "ivanov ivan ivanovich";
        char [] fullNameCharArray = fullName3.toCharArray();
        fullNameCharArray[0] = Character.toUpperCase(fullNameCharArray[0]);
        fullNameCharArray[fullName.indexOf(" ")+1] = Character.toUpperCase(fullNameCharArray[fullName.indexOf(" ")+1]);
        fullNameCharArray[fullName.lastIndexOf(" ")+1] = Character.toUpperCase(fullNameCharArray[fullName.lastIndexOf(" ")+1]);
        System.out.println(fullNameCharArray);
        System.out.println();
        System.out.println("Задание 7");
        System.out.println();
        StringBuilder str1 = new StringBuilder("135");
        StringBuilder str2 = new StringBuilder("246");
        StringBuilder str3 = str1.append(str2);
        String result = str3.toString();
        String a = result.substring(1, 2);
        String b = result.substring(4, 5);
        char c = result.charAt(5);
        String d = Character.toString(c);
        result = result.replace(result.charAt(1), result.charAt(3));
        result = result.replace(result.charAt(4), result.charAt(2));
        result = result.substring(0, 2) + a + b + result.substring(4, 5) + d;
        System.out.println(result);
        System.out.println();
        System.out.println("Задание 8");
        System.out.println();
        String str4 = "aabccddefgghiijjkk";
        int n = 1;
        for (n = 1; n < str4.length();  n++) {
            char m = str4.charAt(n);
            if (m == str4.charAt(n - 1)) {
                System.out.print(m);
            }
        }



    }
}