package Day01.singly_linkedlist.student_record_management;

public class StudentLinkedList {
    private StudentNode head;

    // Add a new student record at the beginning
    public void addAtBeginning(int rollNumber, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    // Add a new student record at the end
    public void addAtEnd(int rollNumber, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }
        StudentNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Add a new student record at a specific position
    public void addAtPosition(int position, int rollNumber, String name, int age, String grade) {
        if (position < 1) {
            System.out.println("Position must be greater than 0");
            return;
        }
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        StudentNode current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // Delete a student record by Roll Number
    public void deleteByRollNumber(int rollNumber) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.rollNumber == rollNumber) {
            head = head.next;
            return;
        }
        StudentNode current = head;
        while (current.next != null && current.next.rollNumber != rollNumber) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Student with Roll Number " + rollNumber + " not found");
            return;
        }
        current.next = current.next.next;
    }

    // Search for a student record by Roll Number
    public void searchByRollNumber(int rollNumber) {
        StudentNode current = head;
        while (current != null) {
            if (current.rollNumber == rollNumber) {
                System.out.println("Student Found: Roll Number: " + current.rollNumber + ", Name: " + current.name + ", Age: " + current.age + ", Grade: " + current.grade);
                return;
            }
            current = current.next;
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found");
    }

    // Update a student's grade by Roll Number
    public void updateGrade(int rollNumber, String newGrade) {
        StudentNode current = head;
        while (current != null) {
            if (current.rollNumber == rollNumber) {
                current.grade = newGrade;
                System.out.println("Updated grade for Roll Number " + rollNumber + " to " + newGrade);
                return;
            }
            current = current.next;
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found");
    }

    // Display all student records
    public void displayAllRecords() {
        if (head == null) {
            System.out.println("No student records available");
            return;
        }
        StudentNode current = head;
        while (current != null) {
            System.out.println("Roll Number: " + current.rollNumber + ", Name: " + current.name + ", Age: " + current.age + ", Grade: " + current.grade);
            current = current.next;
        }
    }
}
