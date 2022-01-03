package StudentDB;

public class Main {
    public static void main(String[] args){
        DBConnection connection = new DBConnection();
//        System.out.println("순번이 0인 학생의 이름이 권규태 맞누?\n" + connection.isTrue("권규태",0));
//        connection.showStudents();
//        new StudentManagementProgram(connection.getStudentList());
        new Week_table(connection.getStudentList());
    }
}
