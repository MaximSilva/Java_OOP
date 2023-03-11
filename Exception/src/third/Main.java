package third;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student("Max", "Spirkin", Gender.MALE, 100, "JavaOOP");
		Student student2 = new Student("Natasha", "Romanoff", Gender.FEMALE, 101, "JavaOOP");
		Student student3 = new Student("Tony", "Stark", Gender.MALE, 102, "JavaOOP");
		Student student4 = new Student("Steve", "Rogers", Gender.MALE, 103, "JavaOOP");
		Student student5 = new Student("Vanda", "Maximoff", Gender.FEMALE, 104, "JavaOOP");
		Student student6 = new Student("Marya", "Heel", Gender.FEMALE, 105, "JavaOOP");
		Student student7 = new Student("Nick", "Fury", Gender.MALE, 106, "JavaOOP");
		Student student8 = new Student("Stepan", "Bandera", Gender.MALE, 107, "JavaOOP");
		Student student9 = new Student("Lesya", "Kosach-Kvitka", Gender.FEMALE, 108, "JavaOOP");
		Student student10 = new Student("Tyler", "Derden", Gender.MALE, 109, "JavaOOP");
		Student student11 = new Student("Oleksyi", "Arestovich", Gender.MALE, 110, "JavaOOP");
		
		
		Group gr = new Group();
		gr.setGroupName("JavaOOP");
		
		try {
			gr.addStudent(student1);
			gr.addStudent(student2);
			gr.addStudent(student3);
			gr.addStudent(student4);
			gr.addStudent(student5);
			gr.addStudent(student6);
			gr.addStudent(student7);
			gr.addStudent(student8);
			gr.addStudent(student9);
			gr.addStudent(student10);
			gr.addStudent(student11);
		} catch (GroupOverflowException e) {
			System.out.println("Group overflow");
		} finally {
			System.out.println("Thank you for using our program");
		}

		try {
			gr.searchStudentByLastName("Spirkin");
			gr.searchStudentByLastName("Zelenskyi");
		} catch (StudentNotFoundException e) {
			System.out.println("Catch block - Student not found");
		}

		Scanner sc = new Scanner(System.in);

		try {
			GroupFileStorage.saveGroupToCSV(gr);
			System.out.println("Group saved to CSV");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("Group not saved to CSV");
			e1.printStackTrace();
		}

		String createGroup  = sc.nextLine();
		File file = new File(createGroup + ".csv");



		System.out.println("Enter directory to search:");
		File workFolder = new File(sc.nextLine());
		System.out.println("Enter group name to search:");
		String searchedGroupName = sc.nextLine();
		String groupNameFile = searchedGroupName + ".csv";

		try {
			Group groupLoaded = GroupFileStorage.loadGroupFromCSV(file);
			groupLoaded.sortStudentsByLastName();
			System.out.println("Group loaded from CSV");
		} catch (IOException | GroupOverflowException e1) {
			// TODO Auto-generated catch block
			System.out.println("Group not loaded from CSV");
			e1.printStackTrace();
		}

		try {
			File fileGroup = GroupFileStorage.findFileByGroupName(groupNameFile, workFolder);
			if (searchedGroupName.equals(gr.getGroupName())) {
				System.out.println("Group file created " + fileGroup.getAbsolutePath());
			} else {
				System.out.println("Group file not found");
			}
		} catch (IOException | NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}
}
