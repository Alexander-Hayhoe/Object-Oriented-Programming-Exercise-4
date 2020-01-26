public class example {
    public static void main(String[] args) {  
        Student s1 = new Student("Blaze", 32, 7);
        Student s2 = new Student("John", 21, 7);
        Student s3 = new Student("Carmack", 53, 7);

        new User("Carmack", 53);

        Animal a1 = new Animal("Blue", "Dog");
        Animal a2 = new Animal("Diamondback", "Snake");
        Animal a3 = new Animal("E:T", "Extraterrestrial");

        // s1.studentDisplay();

        a1.attack(s1);
        a2.attack(s1);
        a3.attack(s3);
        a2.attack(s2);
    }
}