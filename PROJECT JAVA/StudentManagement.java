import java.util.Scanner;

public class StudentManagement {
    static class Node {
        int roll;
        String name;
        Node next;

        Node(int roll, String name) {
            this.roll = roll;
            this.name = name;
            this.next = null;
        }
    }

    static Node head = null;

    // Add student using Linked List
    public static void addStudent(int roll, String name) {
        Node newNode = new Node(roll, name);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
        System.out.println("✅ Student Added Successfully!");
    }

    // Display all students
    public static void display() {
        if (head == null) {
            System.out.println("❌ No students found!");
            return;
        }
        Node temp = head;
        System.out.println("\n--- Student List ---");
        while (temp != null) {
            System.out.println("Roll: " + temp.roll + ", Name: " + temp.name);
            temp = temp.next;
        }
    }

    // Search student using Array
    public static void searchStudent(int[] rolls, String[] names, int count, int rollNo) {
        for (int i = 0; i < count; i++) {
            if (rolls[i] == rollNo) {
                System.out.println("✅ Found: " + names[i]);
                return;
            }
        }
        System.out.println("❌ Student not found!");
    }

    // Delete student using Linked List
    public static void deleteStudent(int rollNo) {
        if (head == null) {
            System.out.println("❌ No students to delete!");
            return;
        }
        if (head.roll == rollNo) {
            head = head.next;
            System.out.println("✅ Student deleted!");
            return;
        }
        Node prev = head;
        Node curr = head.next;

        while (curr != null && curr.roll != rollNo) {
            prev = curr;
            curr = curr.next;
        }

        if (curr == null) {
            System.out.println("❌ Student not found!");
        } else {
            prev.next = curr.next;
            System.out.println("✅ Student deleted!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rolls = new int[100];
        String[] names = new String[100];
        int count = 0;

        while (true) {
            System.out.println("\n===== Student Management Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    addStudent(roll, name);
                    rolls[count] = roll;
                    names[count] = name;
                    count++;
                    break;
                case 2:
                    System.out.print("Enter Roll No to Delete: ");
                    int droll = sc.nextInt();
                    deleteStudent(droll);
                    break;
                case 3:
                    System.out.print("Enter Roll No to Search: ");
                    int sroll = sc.nextInt();
                    searchStudent(rolls, names, count, sroll);
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    System.out.println("👋 Exiting... Thank you!");
                    return;
                default:
                    System.out.println("❌ Invalid Choice!");
            }
        }
    }
}
