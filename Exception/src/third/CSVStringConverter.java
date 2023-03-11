package third;

public class CSVStringConverter implements StringConverter {

    @Override
    public String toStringRepresentation(Student student) {
        // TODO Auto-generated method stub
        String string = student.getName() + ", " + student.getLastName() + ", " + student.getGender() + ", " + student.getId() + ", " + student.getGroupName();
        return string;
    }

    @Override
    public Student fromStringRepresentation(String string) {
        String[] arr = string.split(", ");
        Student student = new Student(arr[0], arr[1], setGender(arr[2]), Integer.parseInt(arr[3]), arr[4]);
        return student;
    }

    private Gender setGender(String string) {
        Gender gender = Gender.MALE;
        if (gender.equals("FEMALE")) {
            gender = Gender.FEMALE;
        }
        return null;
    }
}
