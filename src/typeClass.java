public class typeClass {

/*
    public static void main(String args[]) {

        long ci;

        long im;

        im = 5280 * 12;

        ci = im * im * im;

        System.out.println("B одной кубической миле содержится " + ci +" кубических дюймов");

    }


    public static void main(String args[]) {

        double x, у, z;

        x = 3;

        у = 4;

        z = Math.sqrt(x*x + у*у);

        System.out.println("Длинa гипотенузы: " +z);

    }
    */

    public static void main(String args[]) {

        boolean b;

        b = false;

        System.out.println("Знaчeниe b: " + b);

        b = true;

        System.out.println("Знaчeниe b " + b);

        // Логическое значение можно использовать для

        // управления условным оператором if

        if (b) {

            System.out.println("Эта инструкция вьполняется");

        }

        b = false;

        if (b) {

            System.out.println("Этa инструкция не выполняется");

        }

        // В результате выполнения сравнения получается логическое значение

        System.out.println("Peзyльтaт сравнения 10 > 9: " + (10 > 9));

    }

}
