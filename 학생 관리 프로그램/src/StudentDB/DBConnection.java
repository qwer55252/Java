package StudentDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DBConnection {
    private Connection con;
    private Statement st;
    private ResultSet rs;

    public DBConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smp","root","mjymsy9598@");
            st = con.createStatement();

        }catch (Exception e){
            System.out.println("데이터베이스 연결 오류 : " + e.getMessage());
        }
    }

    public boolean isTrue(String name, int num){
        try {
            String SQL = "SELECT '"+ name +"' FROM student WHERE '"+ num +"' =0";
            rs = st.executeQuery(SQL);
            if(rs.next()){
                return true;
            }
        }catch (Exception e){
            System.out.println("데이터베이스 연결 오류 : " + e.getMessage());
        }
        return false;
    }

    public void showStudents(){
        try {
            String SQL = "SELECT * FROM student";

            rs = st.executeQuery(SQL);

            ArrayList<StudentData> sList = new ArrayList<StudentData>();
            while(rs.next()){
                StudentData sd = new StudentData();
                sd.setName(rs.getString("이름"));
                sd.setAssignment_comment(rs.getString("과제"));
                sd.setAttendance(rs.getString("출결"));
                sd.setConcentration(rs.getString("수업집중도"));
                sd.setAssignment_performance(rs.getString("과제수행도"));
                sd.setNum(rs.getInt("순번"));
                sd.setPlanner_performance(rs.getString("플래너수행도"));
                sd.setProgress(rs.getString("진도"));
                sd.setTextbook(rs.getString("교재"));
                sd.setTest_score(rs.getString("테스트결과"));
                sd.setDate(rs.getString("날짜"));
                sList.add(sd);

            }
            for(int i=0;i<2;i++){
                System.out.println("<"+sList.get(i).getName()+">");
                System.out.println("집중도: "+sList.get(i).getConcentration());
                System.out.println("플래너 수행도: "+sList.get(i).getPlanner_performance());
                System.out.println("교재: "+sList.get(i).getTextbook());
                System.out.println("진도: "+sList.get(i).getProgress());
                System.out.println("과제 내용: "+sList.get(i).getAssignment_comment());
                System.out.println("-------------------------");
            }
        }catch (Exception e){
            System.out.println("학생 조회에 실패하였습니다.");

        }
    }

    public ArrayList<StudentData> getStudentList(){
        try {
            String SQL = "SELECT * FROM student";
            rs = st.executeQuery(SQL);
            ArrayList<StudentData> sList = new ArrayList<StudentData>();
            while(rs.next()){
                StudentData sd = new StudentData();
                sd.setName(rs.getString("이름"));
                sd.setAssignment_comment(rs.getString("과제"));
                sd.setAttendance(rs.getString("출결"));
                sd.setConcentration(rs.getString("수업집중도"));
                sd.setAssignment_performance(rs.getString("과제수행도"));
                sd.setNum(rs.getInt("순번"));
                sd.setPlanner_performance(rs.getString("플래너수행도"));
                sd.setProgress(rs.getString("진도"));
                sd.setTextbook(rs.getString("교재"));
                sd.setTest_score(rs.getString("테스트결과"));
                sd.setDate(rs.getString("날짜"));
                sList.add(sd);
            }
            return sList;
        }catch (Exception e){
            System.out.println("학생 조회에 실패하였습니다.");
        }
        return null;
    }
}
