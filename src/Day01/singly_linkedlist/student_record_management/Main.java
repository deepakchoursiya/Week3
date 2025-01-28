package Day01.singly_linkedlist.student_record_management;

public class Main {
    public static void main(String[] args) {
        StudentLinkedList studentList = new StudentLinkedList();

        // Adding student records
        studentList.addAtBeginning(1, "Deepak", 20, "A");
        studentList.addAtEnd(2, "kumar", 21, "B");
        studentList.addAtPosition(2, 3, "Choursiya", 22, "C");

        // Display all records
        System.out.println("All Student Records:");
        studentList.displayAllRecords();

        // Update a grade
        studentList.updateGrade(2, "A+");

        // Search for a student
        studentList.searchByRollNumber(3);

        // Delete a record
        studentList.deleteByRollNumber(1);

        // Display all records after deletion
        System.out.println("All Student Records After Deletion:");
        studentList.displayAllRecords();
    }
}
