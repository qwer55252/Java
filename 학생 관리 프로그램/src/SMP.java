import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class SMP extends JFrame {
    JPanel [] p = new JPanel[7]; //카테고리
    String [] category= {"출석", "진도", "수업 집중도", "과제 수행도", "플래너 수행도", "과제", "TEST"};
    Color [] colorName = {Color.GREEN,Color.WHITE,Color.CYAN,Color.LIGHT_GRAY, Color.ORANGE,Color.PINK,Color.magenta};
    public SMP() {
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
            p[i].add(la,BorderLayout.CENTER);
            p[i].setBackground(colorName[i]);
            p[i].setOpaque(true);
            if(i==0){ //출석
                p[i].setLocation(x,y);
                p[i].setSize(80,80);
                x = 90;
                //날짜, 출석시간 표
                JPanel pa = new JPanel();
                pa.setLocation(x,y);
                pa.setSize(200,80);
                pa.setLayout(new GridLayout(3,2,3,3));
                pa.setBorder(new LineBorder(Color.red));
                JLabel la0[] = new JLabel[6];
                la0[0] = new JLabel("날짜");
                la0[0].setBorder(new LineBorder(Color.blue));
                la0[0].setHorizontalAlignment(JLabel.CENTER);
                pa.add(la0[0]);
                la0[1] = new JLabel("출석시간");
                la0[1].setHorizontalAlignment(JLabel.CENTER);
                pa.add(la0[1]);
                pa.add(la0[1]);
                pa.add(la0[1]);
                pa.add(la0[1]);
                pa.add(la0[1]);

                c.add(pa);
            }
            else if(i==1){
                x = 5; y = 90;
                p[i].setLocation(x,y);
                p[i].setSize(80, 110);
            }
            else if(i==2){
                x = 5; y = 205;
                p[i].setLocation(x,y);
                p[i].setSize(80, 110);
            }
            else if(i==3){
                x = 5; y = 320;
                p[i].setLocation(x,y);
                p[i].setSize(80, 110);
            }
            else if(i==4){
                x = 5; y = 435;
                p[i].setLocation(x,y);
                p[i].setSize(80, 110);
            }
            else if(i==5){
                x = 5; y = 550;
                p[i].setLocation(x,y);
                p[i].setSize(80, 110);
            }
            else{
                x = 5; y = 665;
                p[i].setLocation(x,y);
                p[i].setSize(80, 110);
            }

            c.add(p[i]);
        }

        setSize(700,1000);
        setVisible(true);
    }
    public static void main(String[] args){
        new SMP();
    }
}
