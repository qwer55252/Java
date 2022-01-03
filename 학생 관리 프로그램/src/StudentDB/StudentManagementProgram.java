package StudentDB;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.util.ArrayList;

public class StudentManagementProgram extends JFrame {
    Font font = new Font("Aharoni 굵게",Font.BOLD, 12);
    JPanel [] p = new JPanel[7]; //카테고리
    String [] category= {"출석", "진도", "수업 집중도", "과제 수행도", "플래너 수행도", "과제", "TEST"};
    Color [] colorName = {new Color(0xCCFFCC),new Color(0xFFFFCC),new Color(0xFFCCFF), new Color(0xCCCCFF)
            ,new Color(0xCCCCCC),new Color(0xFFCCCC), new Color(0xCCFFFF)};
    private ArrayList<StudentData> sList;
    public StudentManagementProgram(ArrayList<StudentData> sList) {
        this.sList = sList;
        int k = 0;
        String[] str = sList.get(k).getDate().split("/");
        String setStr = str[2]+"."+str[1]+"."+str[0];
        sList.get(k).setDate(setStr);
        setTitle("주간 관리표");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        int x = 5, y = 5;
        for(int i=0;i<7;i++){
            p[i] = new JPanel();
            p[i].setLayout(new BorderLayout());
            JLabel la = new JLabel();
            la.setText(category[i]);
            la.setHorizontalAlignment(JLabel.CENTER);
            la.setBackground(colorName[i]);
            la.setFont(font);
            p[i].add(la,BorderLayout.CENTER);
            p[i].setBackground(colorName[i]);
            p[i].setOpaque(true);
            if(i==0){ //출석
                p[i].setLocation(x,y);
                p[i].setSize(80,80);
                x = 90;

                //날짜, 출석시간 표
                String[] header = {"날짜", "출석시간"};
                String[][] contents = {{sList.get(k).getDate(), sList.get(k).getAttendance()},{"#","#"}};
                DefaultTableModel model = new DefaultTableModel(contents,header);
                JTable table = new JTable(model);
                table.setRowHeight(25); //셀 높이 설정
                table.getTableHeader().setFont(font);

                //헤더 설정
                JTableHeader h = table.getTableHeader();
                h.setBackground(colorName[i]);
                h.setPreferredSize(new Dimension(400,30));

                //셀 설정
                DefaultTableCellRenderer cAC = new DefaultTableCellRenderer();
                cAC.setHorizontalAlignment(JLabel.CENTER);
                table.getColumn("날짜").setCellRenderer(cAC);
                table.getColumn("출석시간").setCellRenderer(cAC);
                table.setFont(this.font);

                //스크롤(필수인듯)
                JScrollPane scrollpane = new JScrollPane(table);
                scrollpane.setLocation(x,y);
                scrollpane.setSize(400,80);
                c.add(scrollpane);

                String text = """
                        # 출석시간 10분 전에 하루도 빠지지 않고 출석하는 경우 학생들의 공부를 도와줄 선물이 준비되어 있습니다.
                        # 무단지각을 5회이상 하게 되면 퇴원 처리 됩니다.""";
                JTextArea ta = new JTextArea(text,7,25);
                ta.setLocation(x+405,y);
                ta.setSize(250,80);
                ta.setFont(this.font);
                ta.setLineWrap(true);
                c.add(ta);
            }
            else if(i==1){
                x = 5; y = 90;
                p[i].setLocation(x,y);
                p[i].setSize(80, 110);
                x = 90;

                //날짜, 교재, 진도 표
                String[] header = {"날짜", "교재", "진도"};
                String[][] contents = {{
                    sList.get(k).getDate(),
                    sList.get(k).getTextbook(),
                    sList.get(k).getProgress()
                },{"#","#","#"}};
                JTable table = new JTable(contents,header);
                table.setRowHeight(40); //셀 높이 설정
                table.getTableHeader().setFont(font);

                //셀 가운데 정렬
                DefaultTableCellRenderer cAC = new DefaultTableCellRenderer();
                cAC.setHorizontalAlignment(JLabel.CENTER);
                table.getColumn("날짜").setCellRenderer(cAC);
                table.getColumn("교재").setCellRenderer(cAC);
                table.getColumn("진도").setCellRenderer(cAC);
                table.setFont(this.font);

                //헤더 설정
                JTableHeader h = table.getTableHeader();
                h.setBackground(colorName[i]);
                h.setPreferredSize(new Dimension(650,30));

                //스크롤(필수인듯)
                JScrollPane scrollpane = new JScrollPane(table);
                scrollpane.setLocation(x,y);
                scrollpane.setSize(650,110);
                c.add(scrollpane);
            }
            else if(i==2){
                x = 5; y = 205;
                p[i].setLocation(x,y);
                p[i].setSize(80, 110);
                x = 90;

                //수업 집중도 표
                String[] header = {sList.get(k).getDate(), "2021.12.18(예비)"};
                String[][] contents = {{sList.get(k).getTest_score(),"#"}};
                JTable table = new JTable(contents,header);
                table.setRowHeight(80); //셀 높이 설정
                table.getTableHeader().setFont(font);
                Font cellFont = new Font("Aharoni 굵게",Font.BOLD, 30);
                table.setFont(cellFont);

                //셀 가운데 정렬
                DefaultTableCellRenderer cAC = new DefaultTableCellRenderer();
                cAC.setHorizontalAlignment(JLabel.CENTER);
                table.getColumn(sList.get(k).getDate()).setCellRenderer(cAC);
                table.getColumn("2021.12.18(예비)").setCellRenderer(cAC);

                //헤더 설정
                JTableHeader h = table.getTableHeader();
                h.setBackground(colorName[i]);
                h.setPreferredSize(new Dimension(300,30));

                //스크롤(필수인듯)
                JScrollPane scrollpane = new JScrollPane(table);
                scrollpane.setLocation(x,y);
                scrollpane.setSize(300,110);
                c.add(scrollpane);

                //설명
                String text = """
                        # 수업 집중도 1/2/3/4/5

                        2 - 수업시간동안 집중한 시간보다 집중하지 못한 시간이 더 많음
                        3 - 어느 정도 선생님과의 의사소통을 하며 교감함
                        4 - 선생님과의 의사소통이 원활히 되고, 수업에 완전히 집중함
                        5 - 완벽 집중도""";
                JTextArea ta = new JTextArea(text,7,25);
                ta.setLocation(x+305,y);
                ta.setSize(350,110);
                ta.setLineWrap(true);
                ta.setFont(this.font);
                c.add(ta);
            }
            else if(i==3){
                x = 5; y = 320;
                p[i].setLocation(x,y);
                p[i].setSize(80, 110);
                x = 90;

                //과제 수행도 표
                String[] header = {sList.get(k).getDate(), "2021.12.18(예비)"};
                String[][] contents = {{sList.get(k).getAssignment_performance(),"#"}};
                JTable table = new JTable(contents,header);
                table.setRowHeight(80); //셀 높이 설정
                table.getTableHeader().setFont(font);
                Font cellFont = new Font("Aharoni 굵게",Font.BOLD, 30);
                table.setFont(cellFont);

                //셀 가운데 정렬
                DefaultTableCellRenderer cAC = new DefaultTableCellRenderer();
                cAC.setHorizontalAlignment(JLabel.CENTER);
                table.getColumn(sList.get(k).getDate()).setCellRenderer(cAC);
                table.getColumn("2021.12.18(예비)").setCellRenderer(cAC);

                //헤더 설정
                JTableHeader h = table.getTableHeader();
                h.setBackground(colorName[i]);
                h.setPreferredSize(new Dimension(300,30));

                //스크롤(필수인듯)
                JScrollPane scrollpane = new JScrollPane(table);
                scrollpane.setLocation(x,y);
                scrollpane.setSize(300,110);
                c.add(scrollpane);

                //설명
                String text = """
                        # 과제 수행도 1/2/3/P

                        1 - 숙제를 50%미만으로 이행해 옴
                        2 - 숙제 달성률 50~70%
                        3 - 숙제 달성률 70~90%
                        P [Perfect] - 숙제 달성률 90~100% + 오답 완벽 처리""";
                JTextArea ta = new JTextArea(text,7,25);
                ta.setLocation(x+305,y);
                ta.setSize(350,110);
                ta.setLineWrap(true);
                ta.setFont(this.font);
                c.add(ta);
            }
            else if(i==4){
                x = 5; y = 435;
                p[i].setLocation(x,y);
                p[i].setSize(80, 110);
                x = 90;

                //플래너 수행도 표
                String[] header = {sList.get(k).getDate(), "2021.12.18(예비)"};
                String[][] contents = {{sList.get(k).getPlanner_performance(),"#"}};
                JTable table = new JTable(contents,header);
                table.setRowHeight(80); //셀 높이 설정
                table.getTableHeader().setFont(font);
                Font cellFont = new Font("Aharoni 굵게",Font.BOLD, 30);
                table.setFont(cellFont);

                //셀 가운데 정렬
                DefaultTableCellRenderer cAC = new DefaultTableCellRenderer();
                cAC.setHorizontalAlignment(JLabel.CENTER);
                table.getColumn(sList.get(k).getDate()).setCellRenderer(cAC);
                table.getColumn("2021.12.18(예비)").setCellRenderer(cAC);

                //헤더 설정
                JTableHeader h = table.getTableHeader();
                h.setBackground(colorName[i]);
                h.setPreferredSize(new Dimension(300,30));

                //스크롤(필수인듯)
                JScrollPane scrollpane = new JScrollPane(table);
                scrollpane.setLocation(x,y);
                scrollpane.setSize(300,110);
                c.add(scrollpane);

                //설명
                String text = """
                        # 플래너 수행도 A/B/C

                        A - 자세한 계획을 세우고 이행 정도를 정확히 기입함
                        B - 계획을 세웠으나, 자세하지 않거나 이행정도를 기입하지 않음
                        C - 플래너를 작성하지 않음
                        """;
                JTextArea ta = new JTextArea(text,7,25);
                ta.setLocation(x+305,y);
                ta.setSize(350,110);
                ta.setLineWrap(true);
                ta.setFont(this.font);
                c.add(ta);
            }
            else if(i==5){
                x = 5; y = 550;
                p[i].setLocation(x,y);
                p[i].setSize(80, 90);
                x = 90;

                //과제 표
                String[] header = {sList.get(k).getDate(), "2021.12.18(예비)"};
                String[][] contents = {{sList.get(k).getAssignment_comment(),"#"}};
                JTable table = new JTable(contents,header);
                table.setRowHeight(60); //셀 높이 설정
                table.getTableHeader().setFont(font);

                //헤더 설정
                JTableHeader h = table.getTableHeader();
                h.setBackground(colorName[i]);
                h.setPreferredSize(new Dimension(400,30));

                //셀 가운데 정렬
                DefaultTableCellRenderer cAC = new DefaultTableCellRenderer();
                cAC.setHorizontalAlignment(JLabel.CENTER);
                table.getColumn(sList.get(k).getDate()).setCellRenderer(cAC);
                table.getColumn("2021.12.18(예비)").setCellRenderer(cAC);
                table.setFont(this.font);

                //스크롤(필수인듯)
                JScrollPane scrollpane = new JScrollPane(table);
                scrollpane.setLocation(x,y);
                scrollpane.setSize(400,90);
                c.add(scrollpane);

                String text = "";
                JTextArea ta = new JTextArea(text,7,25);
                ta.setLocation(x+405,y);
                ta.setSize(250,90);
                ta.setLineWrap(true);
                c.add(ta);
            }
            else{
                x = 5; y = 645;
                p[i].setLocation(x,y);
                p[i].setSize(80, 110);
                x = 90;

                //TEST 표
                String[] header = {sList.get(k).getDate(), "2021.12.18(예비)"};
                String[][] contents = {{sList.get(k).getTest_score(),"#"}};
                JTable table = new JTable(contents,header);
                table.setRowHeight(80); //셀 높이 설정
                table.getTableHeader().setFont(font);
                Font cellFont = new Font("Aharoni 굵게",Font.BOLD, 30);
                table.setFont(cellFont);

                //헤더 설정
                JTableHeader h = table.getTableHeader();
                h.setBackground(colorName[i]);
                h.setPreferredSize(new Dimension(400,30));

                //셀 가운데 정렬
                DefaultTableCellRenderer cAC = new DefaultTableCellRenderer();
                cAC.setHorizontalAlignment(JLabel.CENTER);
                table.getColumn(sList.get(k).getDate()).setCellRenderer(cAC);
                table.getColumn("2021.12.18(예비)").setCellRenderer(cAC);
                table.setFont(this.font);

                //스크롤(필수인듯)
                JScrollPane scrollpane = new JScrollPane(table);
                scrollpane.setLocation(x,y);
                scrollpane.setSize(400,110);
                c.add(scrollpane);

                String text = "";
                JTextArea ta = new JTextArea(text,7,25);
                ta.setLocation(x+405,y);
                ta.setSize(250,110);
                ta.setLineWrap(true);
                ta.setFont(this.font);
                c.add(ta);
            }

            c.add(p[i]);
        }

        setSize(800,1000);
        setVisible(true);
    }
}

