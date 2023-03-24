class Main {
    public static void main(String[] args) {
        int age = 31;
        String name = "Mr. Park";
        float temp = -2.5f;
        char grade = 'A';
        boolean working = false;

        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Current Outside Temperature: " + temp);
        System.out.println("Letter Grade: " + grade);
        System.out.println("Are they working?: " + working);

        String user_input = System.console().readLine();
        System.out.println(user_input);
    }
}