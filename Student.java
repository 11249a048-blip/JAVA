class Student {
    String name = "Rahul";
    int age = 20;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s = new Student(); // Object creation
        s.display();               // Calling method using object reference
    }
}