public class UniversityGroup {
    private String groupName;
    private int startYear;
    private int endYear;
    private String[] studentArray;

    public String getGroupName() {
        return groupName;
    }

    public int getStartYear() {
        return startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public String[] getStudentArray() {
        return studentArray;
    }

    public UniversityGroup(String groupName, int startYear) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.endYear = startYear + 5;
    }

    public UniversityGroup(String groupName, int startYear, String[] studentArray) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.studentArray = studentArray;
        this.endYear = startYear + 5;
    }

    public void addStudents(String[] students) {
        if (studentArray == null) {
            studentArray = students;
        }
    }

    public String getGroupDescription() {
        String groupDescription = String.format("Group name: %s, Start year is %d, End year is %d, Students: .", groupName, startYear, endYear);
        for (int i = 0; i < studentArray.length; i++) {
            groupDescription = groupDescription + studentArray[i];
        }
        return groupDescription;
    }

    public static void main(String[] args) {
        UniversityGroup group1 = new UniversityGroup("Kh-067-Java", 2022);
        UniversityGroup group2 = new UniversityGroup("Kh-013-Python", 2021, null);


        String[] students = new String[]{"Pikhulya Yana, ", "Kraynov Andrey, ", "Lisa Boyko."};
        group1.addStudents(students);
        System.out.println(group1.getGroupDescription());

        group2.addStudents(students);
        System.out.println(group2.getGroupDescription());
    }
}
