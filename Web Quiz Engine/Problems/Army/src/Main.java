import java.util.ArrayList;

class Army {

    public static void createArmy() {
        // Implement this method
        ArrayList<Object> objects = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            objects.add(new Unit("Unit " + i));
        }

        for (int i = 1; i < 4; i++) {
            objects.add(new Knight("Knight " + i));
        }

        objects.add(new General("General 1"));
        objects.add(new Doctor("Doctor 1"));
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}