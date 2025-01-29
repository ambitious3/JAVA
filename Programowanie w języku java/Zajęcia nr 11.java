import java.util.*;

public class Main {
    public static void main(String[] args) {
        zadanie2();
        zadanie3();
        zadanie4();
    }

    public static void zadanie2() {
        Scanner scanner = new Scanner(System.in);
        Set<Double> liczbyRzeczywiste = new HashSet<Double>();
        System.out.println("Ile liczb chcesz podać?");
        int howMany = scanner.nextInt();

        for (int i = 0; i < howMany; i++) {
            System.out.println("Podaj liczbę: ");
            liczbyRzeczywiste.add(scanner.nextDouble());
        }
        System.out.println(liczbyRzeczywiste);
    }

    public static void zadanie3() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> mapa = new HashMap<String, Integer>();
        mapa.put("STYCZEŃ", 31);
        mapa.put("LUTY", 28);
        mapa.put("LUTYP", 29);
        mapa.put("MARZEC", 31);
        mapa.put("KWIECIEŃ", 30);
        mapa.put("MAJ", 31);
        mapa.put("CZERWIEC", 30);
        mapa.put("LIPIEC", 31);
        mapa.put("SIERPIEŃ", 31);
        mapa.put("WRZESIEŃ", 30);
        mapa.put("PAŹDZIERNIK", 31);
        mapa.put("LISTOPAD", 30);
        mapa.put("GRUDZIEŃ", 31);

        System.out.println("Podaj nazwę miesiąca, którego chcesz znać dni. Dla roku przestępnego" +
                "chcąc znać dni lutego, wpisz 'Lutyp'");

        String input = scanner.next();
        if (input != null){
            System.out.println(mapa.get(input.toUpperCase()) + " dni");
        }
    }

    public static void zadanie4() {
        class Employee {
            private String name;
            private int age;
            private int salary;
            public Employee(String name, int age, int salary) {
                this.name = name;
                this.age = age;
                this.salary = salary;
            }
            public void display(){
                System.out.println("Salary: " + salary);
            }

            public int getAge() {
                return age;
            }

            public String getName() {
                return name;
            }

            public int getSalary() {
                return salary;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public void setSalary(int salary) {
                this.salary = salary;
            }
        }

        Map<String, Employee> staff = new HashMap<>();
        staff.put("144-25-5464", new Employee("John Doe", 22, 4000));
        staff.put("264-36-2789", new Employee("Jane Smith", 26, 4200));
        staff.put("358-82-5733", new Employee("Bob Johnson", 34, 5000));
        staff.put("557-63-5527", new Employee("Alice Brown", 20, 3800));
        staff.put("127-43-6666", new Employee("Charlie White", 28, 4100));
        staff.put("512-55-9999", new Employee("Eva Black", 31, 4300));

        for (Map.Entry<String, Employee> entry : staff.entrySet()) {
            if (entry.getValue().getAge() > 15 && entry.getValue().getAge() < 30) {
                String key = entry.getKey();
                Employee value = entry.getValue();
                String n = entry.getValue().getName();
                int salary = entry.getValue().getSalary();
                System.out.println("key=" + key + ", name: " + n + ", salary: " + salary);
            }
        }
    }
}
