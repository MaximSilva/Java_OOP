package third;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Group{
	private String groupName;
	private Student[] students = new Student[10];
	
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public Student[] getStudents() {
		return students;
	}
	public void setStudents(Student[] students) {
		this.students = students;
	}
	
	public void addStudent(Student student) throws GroupOverflowException{
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
			}
		}
		throw new GroupOverflowException();
	}
	
	public Student searchStudentByLastName(String lastName) throws StudentNotFoundException{
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				if (students[i].getLastName().equals(lastName)) {
					System.out.println("The student " + lastName +" is in the group");
					return students[i];
				}
			}
		}
		System.out.println("The student " + lastName +" isn`t in the group");
		throw new StudentNotFoundException();
	}
	
	public boolean removeStudentByID(int id) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				if (students[i].getId() == id) {
					students[i] = null;
					System.out.println("It`s done. Student with id " + id +" isn`t in the group now.");
					return true;
				}
			}
		}
		System.out.println("Class block - Student not found");
		return false;
	}
	public void sortStudentsByLastName() {
		Arrays.sort(students, Comparator.nullsFirst(new StudentsNameComparator()));

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Group other = (Group) obj;
		return Objects.equals(groupName, other.groupName) && Arrays.equals(students, other.students);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(students);
		result = prime * result + Objects.hash(groupName);
		return result;
	}

	@Override
	public String toString() {
		return "Group [groupName=" + groupName + ", students=" + Arrays.toString(students) + "]";
	}
	
	
}
