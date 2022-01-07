package sudabang_management;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;

import com.microsoft.schemas.office.office.BorderleftcolorAttribute;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Vacation_week_table extends JFrame{
	
	public Vacation_week_table() {
		setTitle("주간관리표 GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// font
		Font title_font = new Font("Dialog",Font.PLAIN, 15); 
		Font font1 = new Font("Dialog",Font.BOLD, 10);
		Font font2 = new Font("Dialog", Font.BOLD, 15);
		Font font3 = new Font("Dialog", Font.PLAIN, 15);
		
		
		// Color
		Color light_yellow_color = new Color(255, 255, 204);
		Color light_red_color = new Color(255, 204, 204);
		Color light_blue_color = new Color(204, 229, 255);
		Color light_green_color = new Color(204, 255, 229);
		Color light_gray_color = new Color(240, 240, 240);
		Color green_color = new Color(102, 204, 0);
		
		// Border
		
		LineBorder border1 = new LineBorder(Color.white, 1);
		LineBorder border2 = new LineBorder(Color.white, 2);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		
		// title - NORTH
		JPanel title = new JPanel(); // NORTH
		title.setPreferredSize(new Dimension(this.getWidth(), 30));
		title.setBackground(Color.white);
		
		JLabel title_label = new JLabel("<ㅇㅇㅇ 학생 ㅇ월 ㅇ주차 주간관리표>");
		title_label.setFont(title_font);
		title_label.setHorizontalAlignment(JLabel.CENTER);
		title.add(title_label);
		
		
		JPanel center = new JPanel();
		center.setLayout(null);
		//center.setBackground(Color.red); // 확인차 레드레드 
		
	
		
		//------------------------------------------------------------
		// <출석 란> 
		JPanel attendence = new JPanel(); // 1X4 패널
		attendence.setLayout(null);
		attendence.setBorder(border2);
		attendence.setBounds(0, 0, 1300, 150);

		JPanel att_panel1 = new JPanel(new BorderLayout()); // default : FlowLayout -> 맨 위에 가운데에 설정
		att_panel1.setBounds(0, 0, 50, 150); 
		att_panel1.setBackground(light_yellow_color);
		att_panel1.setBorder(border1);
		
		JLabel att_label = new JLabel("출석");
		att_label.setFont(font1);
		att_label.setHorizontalAlignment(JLabel.CENTER);
		att_label.setVerticalAlignment(JLabel.CENTER);
		att_panel1.add(att_label, BorderLayout.CENTER);
		
		JPanel att_panel2 = new JPanel(new GridLayout(6, 1));
		att_panel2.setBounds(50, 0, 300, 150);
		att_panel2.setBorder(border1);
		
		JLabel att_date_label = new JLabel("날짜");
		att_date_label.setFont(font2);
		att_date_label.setHorizontalAlignment(JLabel.CENTER);
		att_date_label.setVerticalAlignment(JLabel.CENTER);
		
		JPanel att_panel2_1 = new JPanel(new BorderLayout());
		att_panel2_1.setBackground(light_yellow_color);
		att_panel2_1.setBorder(border1);
		att_panel2_1.add(att_date_label, BorderLayout.CENTER);
		
		JPanel att_panel2_2 = new JPanel();
		att_panel2_2.setBorder(border1);
		att_panel2_2.setBackground(light_gray_color);
		
		JPanel att_panel2_3 = new JPanel();
		att_panel2_3.setBorder(border1);
		att_panel2_3.setBackground(light_gray_color);
		
		JPanel att_panel2_4 = new JPanel();
		att_panel2_4.setBorder(border1);
		att_panel2_4.setBackground(light_gray_color);
		
		JPanel att_panel2_5 = new JPanel();
		att_panel2_5.setBorder(border1);
		att_panel2_5.setBackground(light_gray_color);
		
		JPanel att_panel2_6 = new JPanel();
		att_panel2_6.setBorder(border1);
		att_panel2_6.setBackground(light_gray_color);
		
		
		att_panel2.add(att_panel2_1);
		att_panel2.add(att_panel2_2);
		att_panel2.add(att_panel2_3);
		att_panel2.add(att_panel2_4);
		att_panel2.add(att_panel2_5);
		att_panel2.add(att_panel2_6);
		
		
		JPanel att_panel3 = new JPanel(new GridLayout(6, 1));
		att_panel3.setBounds(350, 0, 300, 150); // attendence의 350, 0위치에 300X150 삽입
		att_panel3.setBorder(border1);
		
		JLabel att_time_label = new JLabel("출석시간");
		att_time_label.setFont(font2);
		att_time_label.setHorizontalAlignment(JLabel.CENTER);
		att_time_label.setVerticalAlignment(JLabel.CENTER);
		
		JPanel att_panel3_1 = new JPanel(new BorderLayout());
		att_panel3_1.setBounds(0, 0, 300, 25);
		att_panel3_1.setBackground(light_yellow_color);
		att_panel3_1.setBorder(border1);
		att_panel3_1.add(att_time_label, BorderLayout.CENTER);
		
		JPanel att_panel3_2 = new JPanel();
		att_panel3_2.setBorder(border1);
		att_panel3_2.setBackground(light_gray_color);
		
		JPanel att_panel3_3 = new JPanel();
		att_panel3_3.setBorder(border1);
		att_panel3_3.setBackground(light_gray_color);
		
		JPanel att_panel3_4 = new JPanel();
		att_panel3_4.setBorder(border1);
		att_panel3_4.setBackground(light_gray_color);
		
		JPanel att_panel3_5 = new JPanel();
		att_panel3_5.setBorder(border1);
		att_panel3_5.setBackground(light_gray_color);
		
		JPanel att_panel3_6 = new JPanel();
		att_panel3_6.setBorder(border1);
		att_panel3_6.setBackground(light_gray_color);
		
		att_panel3.add(att_panel3_1);
		att_panel3.add(att_panel3_2);
		att_panel3.add(att_panel3_3);
		att_panel3.add(att_panel3_4);
		att_panel3.add(att_panel3_5);
		att_panel3.add(att_panel3_6);
		
		
		JPanel att_panel4 = new JPanel(new GridLayout(6, 1));
		att_panel4.setBounds(650, 0, 650, 150);
		att_panel4.setBorder(border1);
		att_panel4.add(new JLabel(" # 출석시간 10분 전에 하루도 빠지지 않고"));
		att_panel4.add(new JLabel(" 출석하는 경우 학생들의 공부를 도와줄"));
		att_panel4.add(new JLabel(" 선물이 준비되어 있습니다."));
		att_panel4.add(new JLabel(""));
		att_panel4.add(new JLabel(" # 무단지각을 5회이상 하게 되면"));
		att_panel4.add(new JLabel(" 퇴원 처리 됩니다."));
		
		
		attendence.add(att_panel1);
		attendence.add(att_panel2);
		attendence.add(att_panel3);
		attendence.add(att_panel4);
		attendence.setBackground(Color.blue);
		
		
		
		//------------------------------------------------------------
		// <진도 란>
		JPanel progress = new JPanel();
		progress.setLayout(null);
		progress.setBounds(0, 150, 1300, 200); // center의 0,150위치에 1300X200 삽입
		progress.setBorder(border2);
		progress.setBackground(Color.red);
		
		
		
		JPanel pro_panel1 = new JPanel(new BorderLayout()); // default : FlowLayout -> 맨 위에 가운데에 설정
		pro_panel1.setBounds(0, 0, 50, 200); 
		pro_panel1.setBorder(border1);
		pro_panel1.setBackground(light_red_color);
		
		JLabel pro_label = new JLabel("진도");
		pro_label.setFont(font1);
		pro_label.setHorizontalAlignment(JLabel.CENTER);
		pro_label.setVerticalAlignment(JLabel.CENTER);
		pro_panel1.add(pro_label, BorderLayout.CENTER);
		
		
		
		JPanel pro_panel2 = new JPanel();
		pro_panel2.setLayout(null);
		pro_panel2.setBounds(50, 0, 300, 200); // progress의 50, 0 위치에 300X200 삽입 
		pro_panel2.setBorder(border1);
		
		JPanel pro_panel2_grid = new JPanel(new GridLayout(5, 1)); // 진도 날짜 밑 5개의 grid칸
		pro_panel2_grid.setBounds(0, 25, 300, 175); // pro_panel2의 0, 25위치에 300X175 삽입 
		pro_panel2_grid.setBorder(border1);
		
		JLabel pro_date_label = new JLabel("날짜"); // att_date_label이랑 겹쳐주자 
		pro_date_label.setFont(font2);
		pro_date_label.setHorizontalAlignment(JLabel.CENTER);
		pro_date_label.setVerticalAlignment(JLabel.CENTER);
		
		JPanel pro_panel2_1 = new JPanel(new BorderLayout());
		pro_panel2_1.setBounds(0, 0, 300, 25); // pro_panel2의 (0, 0)위치에 300X25 삽입
		pro_panel2_1.setBorder(border1);
		pro_panel2_1.setBackground(light_red_color);
		pro_panel2_1.add(pro_date_label, BorderLayout.CENTER);
		
		JPanel pro_panel2_2 = new JPanel();
		pro_panel2_2.setBorder(border1);
		pro_panel2_2.setBackground(light_gray_color);
		
		JPanel pro_panel2_3 = new JPanel();
		pro_panel2_3.setBorder(border1);
		pro_panel2_3.setBackground(light_gray_color);
		
		JPanel pro_panel2_4 = new JPanel();
		pro_panel2_4.setBorder(border1);
		pro_panel2_4.setBackground(light_gray_color);

		JPanel pro_panel2_5 = new JPanel();
		pro_panel2_5.setBorder(border1);
		pro_panel2_5.setBackground(light_gray_color);
		
		JPanel pro_panel2_6 = new JPanel();
		pro_panel2_6.setBorder(border1);
		pro_panel2_6.setBackground(light_gray_color);
		
		
		pro_panel2_grid.add(pro_panel2_2);
		pro_panel2_grid.add(pro_panel2_3);
		pro_panel2_grid.add(pro_panel2_4);
		pro_panel2_grid.add(pro_panel2_5);
		pro_panel2_grid.add(pro_panel2_6);
		
		pro_panel2.add(pro_panel2_1);
		pro_panel2.add(pro_panel2_grid);
		
		
		
		
		JPanel pro_panel3 = new JPanel();
		pro_panel3.setLayout(null);
		pro_panel3.setBounds(350, 0, 300, 200); // progress의 (350, 0)위치에 300X200 삽입 
		pro_panel3.setBorder(border1);
		
		JPanel pro_panel3_grid = new JPanel(new GridLayout(5, 1)); // 진도 날짜 밑 5개의 grid칸
		pro_panel3_grid.setBounds(0, 25, 300, 175); // pro_panel3의 0, 25위치에 300X175 삽입 
		pro_panel3_grid.setBorder(border1);
		
		JLabel pro_book_label = new JLabel("교재"); 
		pro_book_label.setFont(font2);
		pro_book_label.setHorizontalAlignment(JLabel.CENTER);
		pro_book_label.setVerticalAlignment(JLabel.CENTER);
		
		JPanel pro_panel3_1 = new JPanel(new BorderLayout());
		pro_panel3_1.setBounds(0, 0, 300, 25);
		pro_panel3_1.setBorder(border1);
		pro_panel3_1.setBackground(light_red_color);
		pro_panel3_1.add(pro_book_label);
		
		
		JPanel pro_panel3_2 = new JPanel();
		pro_panel3_2.setBorder(border1);
		pro_panel3_2.setBackground(light_gray_color);
		
		JPanel pro_panel3_3 = new JPanel();
		pro_panel3_3.setBorder(border1);
		pro_panel3_3.setBackground(light_gray_color);

		JPanel pro_panel3_4 = new JPanel();
		pro_panel3_4.setBorder(border1);
		pro_panel3_4.setBackground(light_gray_color);

		JPanel pro_panel3_5 = new JPanel();
		pro_panel3_5.setBorder(border1);
		pro_panel3_5.setBackground(light_gray_color);
		
		JPanel pro_panel3_6 = new JPanel();
		pro_panel3_6.setBorder(border1);
		pro_panel3_6.setBackground(light_gray_color);
		
		pro_panel3_grid.add(pro_panel3_2);
		pro_panel3_grid.add(pro_panel3_3);
		pro_panel3_grid.add(pro_panel3_4);
		pro_panel3_grid.add(pro_panel3_5);
		pro_panel3_grid.add(pro_panel3_6);
		
		pro_panel3.add(pro_panel3_1);
		pro_panel3.add(pro_panel3_grid);
		
		
		JPanel pro_panel4 = new JPanel();
		pro_panel4.setLayout(null);
		pro_panel4.setBounds(650, 0, 650, 200); // progress의 (650, 0)위치에 650X200 삽입
		pro_panel4.setBorder(border1);
		
		JPanel pro_panel4_grid = new JPanel(new GridLayout(5, 1));
		pro_panel4_grid.setBounds(0, 25, 650, 175);
		pro_panel4_grid.setBorder(border1);
		
		JLabel pro_pro_label = new JLabel("진도"); 
		pro_pro_label.setFont(font2);
		pro_pro_label.setHorizontalAlignment(JLabel.CENTER);
		pro_pro_label.setVerticalAlignment(JLabel.CENTER);
		
		JPanel pro_panel4_1 = new JPanel(new BorderLayout());
		pro_panel4_1.setBounds(0, 0, 650, 25);
		pro_panel4_1.setBorder(border1);
		pro_panel4_1.setBackground(light_red_color);
		pro_panel4_1.add(pro_pro_label, BorderLayout.CENTER);
		
		
		JPanel pro_panel4_2 = new JPanel();
		pro_panel4_2.setBorder(border1);
		pro_panel4_2.setBackground(light_gray_color);
		
		JPanel pro_panel4_3 = new JPanel();
		pro_panel4_3.setBorder(border1);
		pro_panel4_3.setBackground(light_gray_color);
		
		JPanel pro_panel4_4 = new JPanel();
		pro_panel4_4.setBorder(border1);
		pro_panel4_4.setBackground(light_gray_color);
		
		JPanel pro_panel4_5 = new JPanel();
		pro_panel4_5.setBorder(border1);
		pro_panel4_5.setBackground(light_gray_color);
		
		JPanel pro_panel4_6 = new JPanel();
		pro_panel4_6.setBorder(border1);
		pro_panel4_6.setBackground(light_gray_color);
		
		pro_panel4_grid.add(pro_panel4_2);
		pro_panel4_grid.add(pro_panel4_3);
		pro_panel4_grid.add(pro_panel4_4);
		pro_panel4_grid.add(pro_panel4_5);
		pro_panel4_grid.add(pro_panel4_6);
		
		pro_panel4.add(pro_panel4_1);
		pro_panel4.add(pro_panel4_grid);
		
		
		progress.add(pro_panel1);
		progress.add(pro_panel2);
		progress.add(pro_panel3);
		progress.add(pro_panel4);
		
		
		
		//------------------------------------------------------------
		// <수업집중도 란>
		JPanel concentration = new JPanel();
		concentration.setLayout(null);
		concentration.setSize(1300, 90);
		concentration.setBorder(border2);
		
		
		JPanel con_panel1 = new JPanel(new GridLayout(2, 1)); // default : FlowLayout -> 맨 위에 가운데에 설정
		con_panel1.setBounds(0, 0, 50, 90); // concentration의 (0, 0)위치에 50X90 삽입 
		con_panel1.setBorder(border1);
		con_panel1.setBackground(light_blue_color);
		
		JLabel con_label1 = new JLabel("수업");
		JLabel con_label2 = new JLabel("집중도");
		con_label1.setFont(font1);
		con_label1.setHorizontalAlignment(JLabel.CENTER);
		con_label1.setVerticalAlignment(JLabel.CENTER);
		con_panel1.add(con_label1, BOTTOM_ALIGNMENT);
		con_label2.setFont(font1);
		con_label2.setHorizontalAlignment(JLabel.CENTER);
		con_label2.setVerticalAlignment(JLabel.CENTER);
		con_panel1.add(con_label2, TOP_ALIGNMENT);
		
		
		JPanel con_date_grid = new JPanel(new GridLayout(1, 5)); // 월~금 수업집중도 날짜 5X1 그리드 
		con_date_grid.setBounds(50, 0, 750, 25); // concentration의 (50, 0)위치에 750X25 삽입
		con_date_grid.setBorder(border1);
		
		JPanel con_state_grid = new JPanel(new GridLayout(1, 5)); // 월~금 수업집중도 집중도 5X1 그리드
		con_state_grid.setBounds(50, 25, 750, 65); // concentration의 (50, 25)위치에 750X65 삽입
		con_state_grid.setBorder(border1);
		
		JLabel con_date1_label = new JLabel("oooo.oo.oo"); 
		con_date1_label.setFont(font3);
		con_date1_label.setHorizontalAlignment(JLabel.CENTER);
		con_date1_label.setVerticalAlignment(JLabel.CENTER);
		
		JPanel con_panel2_1 = new JPanel(new BorderLayout());
		con_panel2_1.setBorder(border1);
		con_panel2_1.setBackground(light_blue_color);
		con_panel2_1.add(con_date1_label, BorderLayout.CENTER);
		
		JPanel con_panel3_1 = new JPanel(new BorderLayout());
		con_panel3_1.setBorder(border1);
		con_panel3_1.setBackground(light_blue_color);
		con_panel3_1.add(con_date1_label, BorderLayout.CENTER);
		
		JPanel con_panel4_1 = new JPanel(new BorderLayout());
		con_panel4_1.setBorder(border1);
		con_panel4_1.setBackground(light_blue_color);
		con_panel4_1.add(con_date1_label, BorderLayout.CENTER);
		
		JPanel con_panel5_1 = new JPanel(new BorderLayout());
		con_panel5_1.setBorder(border1);
		con_panel5_1.setBackground(light_blue_color);
		con_panel5_1.add(con_date1_label, BorderLayout.CENTER);
		
		JPanel con_panel6_1 = new JPanel(new BorderLayout());
		con_panel6_1.setBorder(border1);
		con_panel6_1.setBackground(light_blue_color);
		con_panel6_1.add(con_date1_label, BorderLayout.CENTER);
		
		con_date_grid.add(con_panel2_1);
		con_date_grid.add(con_panel3_1);
		con_date_grid.add(con_panel4_1);
		con_date_grid.add(con_panel5_1);
		con_date_grid.add(con_panel6_1);
		
		JPanel con_panel2_2 = new JPanel();
		con_panel2_2.setBorder(border1);
		con_panel2_2.setBackground(light_gray_color);

		JPanel con_panel3_2 = new JPanel();
		con_panel3_2.setBorder(border1);
		con_panel3_2.setBackground(light_gray_color);

		JPanel con_panel4_2 = new JPanel();
		con_panel4_2.setBorder(border1);
		con_panel4_2.setBackground(light_gray_color);
		
		JPanel con_panel5_2 = new JPanel();
		con_panel5_2.setBorder(border1);
		con_panel5_2.setBackground(light_gray_color);
		
		JPanel con_panel6_2 = new JPanel();
		con_panel6_2.setBorder(border1);
		con_panel6_2.setBackground(light_gray_color);

		con_state_grid.add(con_panel2_2);
		con_state_grid.add(con_panel3_2);
		con_state_grid.add(con_panel4_2);
		con_state_grid.add(con_panel5_2);
		con_state_grid.add(con_panel6_2);
		
		
		
	
		
		JPanel con_panel7 = new JPanel(new GridLayout(6, 1));
		con_panel7.setBounds(800, 0, 500, 90); // concentration의 (800, 0)위치에 500X90 삽입
		con_panel7.setBorder(border1);
		//con_panel7.add(new JLabel(""));
		con_panel7.add(new JLabel(" # 수업집중도 1/2/3/4/5"));
		//con_panel7.add(new JLabel(""));
		con_panel7.add(new JLabel(" 1 - 수업시간 전반에 걸쳐 집중 못함"));
		con_panel7.add(new JLabel(" 2 - 수업시간 동안 집중한 시간보다 집중하지 못한 시간이 더 많음"));
		con_panel7.add(new JLabel(" 3 - 어느 정도 선생님과의 의사소통을 하며 교감함"));
		con_panel7.add(new JLabel(" 4 - 선생님과의 의사소통이 원활히 되고, 수업에 완전히 집중함"));
		con_panel7.add(new JLabel(" 5 - 완벽 집중도"));
		//con_panel7.add(new JLabel(""));
		
		concentration.add(con_panel1);
		concentration.add(con_date_grid);
		concentration.add(con_state_grid);
		concentration.add(con_panel7);

		

		//------------------------------------------------------------
		//<과제수행도 란>
		JPanel homework_state = new JPanel();
		homework_state.setLayout(null);
		homework_state.setSize(1300, 90);
		homework_state.setBorder(border2);
		
		
		JPanel hws_panel1 = new JPanel(new GridLayout(2, 1)); // default : FlowLayout -> 맨 위에 가운데에 설정
		hws_panel1.setBounds(0, 0, 50, 90); // concentration의 (0, 0)위치에 50X90 삽입 
		hws_panel1.setBorder(border1);
		hws_panel1.setBackground(light_green_color);
		
		JLabel hws_label1 = new JLabel("과제");
		JLabel hws_label2 = new JLabel("수행도");
		hws_label1.setFont(font1);
		hws_label1.setHorizontalAlignment(JLabel.CENTER);
		hws_label1.setVerticalAlignment(JLabel.CENTER);
		hws_panel1.add(hws_label1, BOTTOM_ALIGNMENT);
		hws_label2.setFont(font1);
		hws_label2.setHorizontalAlignment(JLabel.CENTER);
		hws_label2.setVerticalAlignment(JLabel.CENTER);
		hws_panel1.add(hws_label2, TOP_ALIGNMENT);
		
		
		JPanel hws_date_grid = new JPanel(new GridLayout(1, 5)); // 월~금 과제수행도 날짜 5X1 그리드 
		hws_date_grid.setBounds(50, 0, 750, 25); // homework_state의 (50, 0)위치에 750X25 삽입
		hws_date_grid.setBorder(border1);
		
		JLabel hws_date1_label = new JLabel("oooo.oo.oo"); 
		hws_date1_label.setFont(font3);
		hws_date1_label.setHorizontalAlignment(JLabel.CENTER);
		hws_date1_label.setVerticalAlignment(JLabel.CENTER);
		
		JPanel hws_panel2_1 = new JPanel(new BorderLayout());
		hws_panel2_1.setBorder(border1);
		hws_panel2_1.setBackground(light_green_color);
		hws_panel2_1.add(hws_date1_label, BorderLayout.CENTER);
		
		JPanel hws_panel3_1 = new JPanel(new BorderLayout());
		hws_panel3_1.setBorder(border1);
		hws_panel3_1.setBackground(light_green_color);
		hws_panel3_1.add(hws_date1_label, BorderLayout.CENTER);
		
		JPanel hws_panel4_1 = new JPanel(new BorderLayout());
		hws_panel4_1.setBorder(border1);
		hws_panel4_1.setBackground(light_green_color);
		hws_panel4_1.add(hws_date1_label, BorderLayout.CENTER);
		
		JPanel hws_panel5_1 = new JPanel(new BorderLayout());
		hws_panel5_1.setBorder(border1);
		hws_panel5_1.setBackground(light_green_color);
		hws_panel5_1.add(hws_date1_label, BorderLayout.CENTER);
		
		JPanel hws_panel6_1 = new JPanel(new BorderLayout());
		hws_panel6_1.setBorder(border1);
		hws_panel6_1.setBackground(light_green_color);
		hws_panel6_1.add(hws_date1_label, BorderLayout.CENTER);
		
		hws_date_grid.add(hws_panel2_1);
		hws_date_grid.add(hws_panel3_1);
		hws_date_grid.add(hws_panel4_1);
		hws_date_grid.add(hws_panel5_1);
		hws_date_grid.add(hws_panel6_1);
		
		
		// 월~금 과제 수행도 칸 
		JPanel hws_state_grid = new JPanel(new GridLayout(1, 5)); // 월~금 과제수행도 수행도 5X1 그리드
		hws_state_grid.setBounds(50, 25, 750, 65); // homework_state의 (50, 25)위치에 750X65 삽입
		hws_state_grid.setBorder(border1);
		
		JPanel hws_panel2_2 = new JPanel();
		hws_panel2_2.setBorder(border1);
		hws_panel2_2.setBackground(light_gray_color);

		JPanel hws_panel3_2 = new JPanel();
		hws_panel3_2.setBorder(border1);
		hws_panel3_2.setBackground(light_gray_color);

		JPanel hws_panel4_2 = new JPanel();
		hws_panel4_2.setBorder(border1);
		hws_panel4_2.setBackground(light_gray_color);
		
		JPanel hws_panel5_2 = new JPanel();
		hws_panel5_2.setBorder(border1);
		hws_panel5_2.setBackground(light_gray_color);
		
		JPanel hws_panel6_2 = new JPanel();
		hws_panel6_2.setBorder(border1);
		hws_panel6_2.setBackground(light_gray_color);

		hws_state_grid.add(hws_panel2_2);
		hws_state_grid.add(hws_panel3_2);
		hws_state_grid.add(hws_panel4_2);
		hws_state_grid.add(hws_panel5_2);
		hws_state_grid.add(hws_panel6_2);
	
		
		JPanel hws_panel7 = new JPanel(new GridLayout(5, 1));
		hws_panel7.setBounds(800, 0, 500, 90); // homework_state의 (800, 0)위치에 500X90 삽입
		hws_panel7.setBorder(border1);
		//hws_panel7.add(new JLabel(""));
		hws_panel7.add(new JLabel(" # 과제수행도 1/2/3/P"));
		//hws_panel7.add(new JLabel(""));
		hws_panel7.add(new JLabel(" 1 - 숙제를 50%미만으로 이행해 옴"));
		hws_panel7.add(new JLabel(" 2 - 숙제 달성률 50 ~ 70%"));
		hws_panel7.add(new JLabel(" 3 - 숙제 달성률 70 ~ 90%"));
		hws_panel7.add(new JLabel(" P - 숙제 달성률 90 ~ 100% + 오답 완벽 처리"));
		//hws_panel7.add(new JLabel(""));
		
		homework_state.add(hws_panel1);
		homework_state.add(hws_date_grid);
		homework_state.add(hws_state_grid);
		homework_state.add(hws_panel7);

		//------------------------------------------------------------
		// <플래너 수행도 란>
		JPanel planner = new JPanel();
		planner.setLayout(null);
		planner.setSize(1300, 90);
		planner.setBorder(border2);
		
		
		JPanel pln_panel1 = new JPanel(new GridLayout(2, 1)); // default : FlowLayout -> 맨 위에 가운데에 설정
		pln_panel1.setBounds(0, 0, 50, 90); // planner의 (0, 0)위치에 50X90 삽입 
		pln_panel1.setBorder(border1);
		pln_panel1.setBackground(green_color);
		
		JLabel pln_label1 = new JLabel("플래너");
		JLabel pln_label2 = new JLabel("수행도");
		pln_label1.setFont(font1);
		pln_label1.setHorizontalAlignment(JLabel.CENTER);
		pln_label1.setVerticalAlignment(JLabel.CENTER);
		pln_panel1.add(pln_label1, BOTTOM_ALIGNMENT);
		pln_label2.setFont(font1);
		pln_label2.setHorizontalAlignment(JLabel.CENTER);
		pln_label2.setVerticalAlignment(JLabel.CENTER);
		pln_panel1.add(pln_label2, TOP_ALIGNMENT);
		
		// 월~금 날짜 칸
		JPanel pln_date_grid = new JPanel(new GridLayout(1, 5)); // 월~금 플래너수행도 날짜 5X1 그리드 
		pln_date_grid.setBounds(50, 0, 750, 25); // planner의 (50, 0)위치에 750X25 삽입
		pln_date_grid.setBorder(border1);
		
		JLabel pln_date1_label = new JLabel("oooo.oo.oo"); 
		pln_date1_label.setFont(font3);
		pln_date1_label.setHorizontalAlignment(JLabel.CENTER);
		pln_date1_label.setVerticalAlignment(JLabel.CENTER);
		
		JPanel pln_panel2_1 = new JPanel(new BorderLayout());
		pln_panel2_1.setBorder(border1);
		pln_panel2_1.setBackground(green_color);
		pln_panel2_1.add(pln_date1_label, BorderLayout.CENTER);
		
		JPanel pln_panel3_1 = new JPanel(new BorderLayout());
		pln_panel3_1.setBorder(border1);
		pln_panel3_1.setBackground(green_color);
		pln_panel3_1.add(pln_date1_label, BorderLayout.CENTER);
		
		JPanel pln_panel4_1 = new JPanel(new BorderLayout());
		pln_panel4_1.setBorder(border1);
		pln_panel4_1.setBackground(green_color);
		pln_panel4_1.add(pln_date1_label, BorderLayout.CENTER);
		
		JPanel pln_panel5_1 = new JPanel(new BorderLayout());
		pln_panel5_1.setBorder(border1);
		pln_panel5_1.setBackground(green_color);
		pln_panel5_1.add(pln_date1_label, BorderLayout.CENTER);
		
		JPanel pln_panel6_1 = new JPanel(new BorderLayout());
		pln_panel6_1.setBorder(border1);
		pln_panel6_1.setBackground(green_color);
		pln_panel6_1.add(pln_date1_label, BorderLayout.CENTER);
		
		pln_date_grid.add(pln_panel2_1);
		pln_date_grid.add(pln_panel3_1);
		pln_date_grid.add(pln_panel4_1);
		pln_date_grid.add(pln_panel5_1);
		pln_date_grid.add(pln_panel6_1);
		
		
		// 월~금 플래너 수행도 칸 
		JPanel pln_state_grid = new JPanel(new GridLayout(1, 5)); // 월~금 플래너수행도 수행도 5X1 그리드
		pln_state_grid.setBounds(50, 25, 750, 65); // planner의 (50, 25)위치에 750X65 삽입
		pln_state_grid.setBorder(border1);
		
		JPanel pln_panel2_2 = new JPanel();
		pln_panel2_2.setBorder(border1);
		pln_panel2_2.setBackground(light_gray_color);

		JPanel pln_panel3_2 = new JPanel();
		pln_panel3_2.setBorder(border1);
		pln_panel3_2.setBackground(light_gray_color);

		JPanel pln_panel4_2 = new JPanel();
		pln_panel4_2.setBorder(border1);
		pln_panel4_2.setBackground(light_gray_color);
		
		JPanel pln_panel5_2 = new JPanel();
		pln_panel5_2.setBorder(border1);
		pln_panel5_2.setBackground(light_gray_color);
		
		JPanel pln_panel6_2 = new JPanel();
		pln_panel6_2.setBorder(border1);
		pln_panel6_2.setBackground(light_gray_color);

		pln_state_grid.add(pln_panel2_2);
		pln_state_grid.add(pln_panel3_2);
		pln_state_grid.add(pln_panel4_2);
		pln_state_grid.add(pln_panel5_2);
		pln_state_grid.add(pln_panel6_2);
	
		
		JPanel pln_panel7 = new JPanel(new GridLayout(4, 1));
		pln_panel7.setBounds(800, 0, 500, 90); // planner의 (800, 0)위치에 500X90 삽입
		pln_panel7.setBorder(border1);
		//pln_panel7.add(new JLabel(""));
		pln_panel7.add(new JLabel(" # 플래너 수행도 A/B/C"));
		//pln_panel7.add(new JLabel(""));
		pln_panel7.add(new JLabel(" A - 자세한 계획을 세우고 이행 정도를 정확히 기입함"));
		pln_panel7.add(new JLabel(" B - 계획을 세웠으나, 자세하지 않거나 이행 정도를 기입하지 않음"));
		pln_panel7.add(new JLabel(" C - 플래너를 작성하지 않음"));
		//pln_panel7.add(new JLabel(""));
		
		planner.add(pln_panel1);
		planner.add(pln_date_grid);
		planner.add(pln_state_grid);
		planner.add(pln_panel7);
		
		
		
		//------------------------------------------------------------
		// <과제 란>
		JPanel homework = new JPanel();
		homework.setLayout(null);
		homework.setSize(1300, 90);
		homework.setBorder(border2);
		
		
		JPanel hwk_panel1 = new JPanel(new BorderLayout()); // default : FlowLayout -> 맨 위에 가운데에 설정
		hwk_panel1.setBounds(0, 0, 50, 90); // homework의 (0, 0)위치에 50X90 삽입 
		hwk_panel1.setBorder(border1);
		hwk_panel1.setBackground(light_red_color);
		
		JLabel hwk_label1 = new JLabel("과제");
		hwk_label1.setFont(font1);
		hwk_label1.setHorizontalAlignment(JLabel.CENTER);
		hwk_label1.setVerticalAlignment(JLabel.CENTER);
		hwk_panel1.add(hwk_label1, BorderLayout.CENTER);
		
		
		JPanel hwk_date_grid = new JPanel(new GridLayout(1, 5)); // 월~금 플래너수행도 날짜 5X1 그리드 
		hwk_date_grid.setBounds(50, 0, 750, 25); // homework의 (50, 0)위치에 750X25 삽입
		hwk_date_grid.setBorder(border1);
		
		JLabel hwk_date1_label = new JLabel("oooo.oo.oo"); 
		hwk_date1_label.setFont(font3);
		hwk_date1_label.setHorizontalAlignment(JLabel.CENTER);
		hwk_date1_label.setVerticalAlignment(JLabel.CENTER);
		
		JPanel hwk_panel2_1 = new JPanel(new BorderLayout());
		hwk_panel2_1.setBorder(border1);
		hwk_panel2_1.setBackground(light_red_color);
		hwk_panel2_1.add(hwk_date1_label, BorderLayout.CENTER);
		
		JPanel hwk_panel3_1 = new JPanel(new BorderLayout());
		hwk_panel3_1.setBorder(border1);
		hwk_panel3_1.setBackground(light_red_color);
		hwk_panel3_1.add(hwk_date1_label, BorderLayout.CENTER);
		
		JPanel hwk_panel4_1 = new JPanel(new BorderLayout());
		hwk_panel4_1.setBorder(border1);
		hwk_panel4_1.setBackground(light_red_color);
		hwk_panel4_1.add(hwk_date1_label, BorderLayout.CENTER);
		
		JPanel hwk_panel5_1 = new JPanel(new BorderLayout());
		hwk_panel5_1.setBorder(border1);
		hwk_panel5_1.setBackground(light_red_color);
		hwk_panel5_1.add(hwk_date1_label, BorderLayout.CENTER);
		
		JPanel hwk_panel6_1 = new JPanel(new BorderLayout());
		hwk_panel6_1.setBorder(border1);
		hwk_panel6_1.setBackground(light_red_color);
		hwk_panel6_1.add(hwk_date1_label, BorderLayout.CENTER);
		
		hwk_date_grid.add(hwk_panel2_1);
		hwk_date_grid.add(hwk_panel3_1);
		hwk_date_grid.add(hwk_panel4_1);
		hwk_date_grid.add(hwk_panel5_1);
		hwk_date_grid.add(hwk_panel6_1);
		
		
		// 월~금 과제 칸 
		JPanel hwk_state_grid = new JPanel(new GridLayout(1, 5)); // 월~금 과제 5X1 그리드
		hwk_state_grid.setBounds(50, 25, 750, 65); // homework의 (50, 25)위치에 750X65 삽입
		hwk_state_grid.setBorder(border1);
		
		JPanel hwk_panel2_2 = new JPanel();
		hwk_panel2_2.setBorder(border1);
		hwk_panel2_2.setBackground(light_red_color);

		JPanel hwk_panel3_2 = new JPanel();
		hwk_panel3_2.setBorder(border1);
		hwk_panel3_2.setBackground(light_red_color);

		JPanel hwk_panel4_2 = new JPanel();
		hwk_panel4_2.setBorder(border1);
		hwk_panel4_2.setBackground(light_red_color);
		
		JPanel hwk_panel5_2 = new JPanel();
		hwk_panel5_2.setBorder(border1);
		hwk_panel5_2.setBackground(light_red_color);
		
		JPanel hwk_panel6_2 = new JPanel();
		hwk_panel6_2.setBorder(border1);
		hwk_panel6_2.setBackground(light_red_color);

		hwk_state_grid.add(hwk_panel2_2);
		hwk_state_grid.add(hwk_panel3_2);
		hwk_state_grid.add(hwk_panel4_2);
		hwk_state_grid.add(hwk_panel5_2);
		hwk_state_grid.add(hwk_panel6_2);
	
		
		JPanel hwk_panel7 = new JPanel();
		hwk_panel7.setBounds(800, 0, 500, 90); // planner의 (800, 0)위치에 500X90 삽입
		hwk_panel7.setBorder(border1);
		
		
		homework.add(hwk_panel1);
		homework.add(hwk_date_grid);
		homework.add(hwk_state_grid);
		homework.add(hwk_panel7);
	
		
		
		// <TEST 란>
		JPanel test = new JPanel();
		test.setLayout(null);
		test.setSize(1300, 90);
		test.setBorder(border2);
		
		
		JPanel tst_panel1 = new JPanel(new BorderLayout()); // default : FlowLayout -> 맨 위에 가운데에 설정
		tst_panel1.setBounds(0, 0, 50, 90); // test의 (0, 0)위치에 50X90 삽입 
		tst_panel1.setBorder(border1);
		tst_panel1.setBackground(light_yellow_color);
		
		JLabel tst_label1 = new JLabel("TEST");
		tst_label1.setFont(font1);
		tst_label1.setHorizontalAlignment(JLabel.CENTER);
		tst_label1.setVerticalAlignment(JLabel.CENTER);
		tst_panel1.add(tst_label1, BorderLayout.CENTER);
		
		
		JPanel tst_date_grid = new JPanel(new GridLayout(1, 5)); // 월~금 TEST 날짜 5X1 그리드 
		tst_date_grid.setBounds(50, 0, 750, 25); // test의 (50, 0)위치에 750X25 삽입
		tst_date_grid.setBorder(border1);
		
		JLabel tst_date1_label = new JLabel("oooo.oo.oo"); 
		tst_date1_label.setFont(font3);
		tst_date1_label.setHorizontalAlignment(JLabel.CENTER);
		tst_date1_label.setVerticalAlignment(JLabel.CENTER);
		
		JPanel tst_panel2_1 = new JPanel(new BorderLayout());
		tst_panel2_1.setBorder(border1);
		tst_panel2_1.setBackground(light_yellow_color);
		tst_panel2_1.add(tst_date1_label, BorderLayout.CENTER);
		
		JPanel tst_panel3_1 = new JPanel(new BorderLayout());
		tst_panel3_1.setBorder(border1);
		tst_panel3_1.setBackground(light_yellow_color);
		tst_panel3_1.add(tst_date1_label, BorderLayout.CENTER);
		
		JPanel tst_panel4_1 = new JPanel(new BorderLayout());
		tst_panel4_1.setBorder(border1);
		tst_panel4_1.setBackground(light_yellow_color);
		tst_panel4_1.add(tst_date1_label, BorderLayout.CENTER);
		
		JPanel tst_panel5_1 = new JPanel(new BorderLayout());
		tst_panel5_1.setBorder(border1);
		tst_panel5_1.setBackground(light_yellow_color);
		tst_panel5_1.add(tst_date1_label, BorderLayout.CENTER);
		
		JPanel tst_panel6_1 = new JPanel(new BorderLayout());
		tst_panel6_1.setBorder(border1);
		tst_panel6_1.setBackground(light_yellow_color);
		tst_panel6_1.add(tst_date1_label, BorderLayout.CENTER);
		
		tst_date_grid.add(tst_panel2_1);
		tst_date_grid.add(tst_panel3_1);
		tst_date_grid.add(tst_panel4_1);
		tst_date_grid.add(tst_panel5_1);
		tst_date_grid.add(tst_panel6_1);
		
		
		// 월~금 TEST 점수 칸 
		JPanel tst_state_grid = new JPanel(new GridLayout(1, 5)); // 월~금 과제 5X1 그리드
		tst_state_grid.setBounds(50, 25, 750, 65); // test의 (50, 25)위치에 750X65 삽입
		tst_state_grid.setBorder(border1);
		
		JPanel tst_panel2_2 = new JPanel();
		tst_panel2_2.setBorder(border1);
		tst_panel2_2.setBackground(light_yellow_color);

		JPanel tst_panel3_2 = new JPanel();
		tst_panel3_2.setBorder(border1);
		tst_panel3_2.setBackground(light_yellow_color);

		JPanel tst_panel4_2 = new JPanel();
		tst_panel4_2.setBorder(border1);
		tst_panel4_2.setBackground(light_yellow_color);
		
		JPanel tst_panel5_2 = new JPanel();
		tst_panel5_2.setBorder(border1);
		tst_panel5_2.setBackground(light_yellow_color);
		
		JPanel tst_panel6_2 = new JPanel();
		tst_panel6_2.setBorder(border1);
		tst_panel6_2.setBackground(light_yellow_color);

		tst_state_grid.add(tst_panel2_2);
		tst_state_grid.add(tst_panel3_2);
		tst_state_grid.add(tst_panel4_2);
		tst_state_grid.add(tst_panel5_2);
		tst_state_grid.add(tst_panel6_2);
	
		
		JPanel tst_panel7 = new JPanel();
		tst_panel7.setBounds(800, 0, 500, 90); // planner의 (800, 0)위치에 500X90 삽입
		tst_panel7.setBorder(border1);
		
		
		test.add(tst_panel1);
		test.add(tst_date_grid);
		test.add(tst_state_grid);
		test.add(tst_panel7);
		
		
		// 패널 작업 끝 
		// -------------------------------------------------------
		
		
		
		
		// <여백> 
		JPanel west_panel = new JPanel();
		west_panel.setPreferredSize(new Dimension(20, this.getHeight()));
		west_panel.setBackground(Color.white);
		
		JPanel east_panel = new JPanel();
		east_panel.setPreferredSize(new Dimension(20, this.getHeight()));
		east_panel.setBackground(Color.white);
		
		
		// 수업집중도~TEST란 이 들어갈 패널 (크기 지정하는 데에 있어서 반복적인 잡업을 줄이기 위해)
		JPanel center_grid = new JPanel(new GridLayout(5, 1));
		center_grid.setBounds(0, 350, 1300, 450); // center의 0, 350위치(패널의 왼쪽 위 좌표)에 1300X450의 패널 
		center_grid.setBorder(border2);
		
		center_grid.add(concentration);
		center_grid.add(homework_state);
		center_grid.add(planner);
		center_grid.add(homework);
		center_grid.add(test);
		
		
		// 각 패널들 추가
		c.add(title, BorderLayout.NORTH);
		c.add(center, BorderLayout.CENTER);
		c.add(east_panel, BorderLayout.EAST);
		c.add(west_panel, BorderLayout.WEST);
		center.add(attendence);
		center.add(progress);
		center.add(center_grid);
		
		
		
		
		
		setSize(1300, 860);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Vacation_week_table vacation_weektable = new Vacation_week_table();
	}
	
}




