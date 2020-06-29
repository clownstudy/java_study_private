package todo;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Todolist extends JFrame {
	private final static Calendar cal = Calendar.getInstance();
	private final JPanel contentPane, calendar_bottom;
	private static JButton nextYear, preYear, nextMonth, preMonth;
	private static int nowDay;
	private static int nowMonth;
	private static int nowYear;
	private static int startDay;
	private static int endDay;
	private static int[] endDays = {31,28,31,30,31,30,31,31,30,31,30,31};
	private static String[] test = {"일","월","화","수","목","금","토"};
	private static String nowDate() {
		switch (getNowMonth()) {
		case 0:
			setNowMonth(12);
			setNowYear(getNowYear()-1);
			break;
		case 13:
			setNowMonth(1);
			setNowYear(getNowYear()+1);
		default:
			break;
		}
		return getNowYear()+"."+getNowMonth()+"."+getNowDay();
	};
	
	public static int getNowDay() {
		return nowDay;
	}

	public static void setNowDay(int nowDay) {
//		cal.set(Calendar.DATE,nowDay);
//		Todolist.nowDay = cal.get(Calendar.DATE);
		Todolist.nowDay = nowDay;
	}

	public static int getNowMonth() {
		return nowMonth;
	}

	public static void setNowMonth(int nowMonth) {
//		cal.set(Calendar.MONTH,nowMonth);
//		Todolist.nowMonth = (cal.get(Calendar.MONTH));
		Todolist.nowMonth = nowMonth;
	}

	public static int getNowYear() {
		return nowYear;
	}

	public static void setNowYear(int nowYear) {
//		cal.set(Calendar.YEAR, nowYear);
//		Todolist.nowYear = cal.get(Calendar.YEAR);
		Todolist.nowYear = nowYear;
	}
	
	/* 
	 캘린더 구현
	 1. 현재월을 받아온다.int m = getNowMonth();
	 2. 현재월의 시작 일자를 정한다. setNowDay(startDay);
	 3. 1일의 요일을 계산한다. cal.get(Calendar.
	 3. 현재월의 마지막 날짜를 가져온다. endDay = endDays[m-1]
	 4. 현재 날짜를 마지막 날짜로 넣는다.
	 4. 마지막 날짜의 주차를 계산 cal.get(Calendar.
	 
	 */
	
	public void today() {
		setNowDay(cal.get(Calendar.DATE));
		setNowMonth(cal.get(Calendar.MONTH));
		setNowYear(cal.get(Calendar.YEAR));
	} // 오늘 날짜로 연월일 지정(setter)
	public void makeCal() {
//		setNowDay(startDay);
//		setNowMonth(5);
		System.out.println("오늘 날짜 : "+getNowDay());
		System.out.println("이번 달1 :"+getNowMonth());
		System.out.println("이번 달 2:"+cal.get(Calendar.MONTH));
		System.out.println("1일이 몇주차??"+cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("1일이 무슨 요일?"+cal.get(Calendar.DAY_OF_WEEK));
		JLabel testLB;

		for(int i=0;i<test.length;i++) {
			testLB = new JLabel(test[i]);
			testLB.setHorizontalAlignment(JLabel.CENTER);
			calendar_bottom.add(testLB);
		}
		int a = endDays[getNowMonth()-1];
		System.out.println(a);
		for(int j=1;j<a+1;j++) {
			JButton testBtn = new JButton(""+j);
			calendar_bottom.add(testBtn);
		}
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Todolist frame = new Todolist();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Todolist() {
		// 기본값 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// 각 패널 설정

		// 일정 목록 패널 시작
		JPanel listPan = new JPanel();
		listPan.setBounds(0, 55, 145, 298);
		contentPane.add(listPan);

		List list = new List(18, true);
		listPan.add(list);
		// 일정 목록 패널 끝


		// 일정 추가 패널
		JPanel addTaskPan = new JPanel();
		addTaskPan.setBounds(145, 55, 437, 298);
		addTaskPan.setVisible(false);
		contentPane.add(addTaskPan);
		addTaskPan.setLayout(null);


		Label subLb = new Label("일정 제목");
		subLb.setBounds(10, 10, 70, 25);
		addTaskPan.add(subLb);

		Label dateLb = new Label("날짜");
		dateLb.setBounds(10, 45, 70, 25);
		addTaskPan.add(dateLb);

		Label taskConLb = new Label("일정 내용");
		taskConLb.setBounds(10, 80, 70, 25);
		addTaskPan.add(taskConLb);

		JTextField subT = new JTextField();
		subT.setBounds(90, 10, 296, 25);
		subT.setColumns(10);
		subT.setText("일정 제목 입력 필요");
		addTaskPan.add(subT);

		JTextField dateT = new JTextField();
		dateT.setText("날짜입력하는 곳입니까?");
		dateT.setColumns(10);
		dateT.setBounds(90, 46, 177, 24);
		addTaskPan.add(dateT);

		JButton dateSelectBtn = new JButton("날짜선택");
		dateSelectBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		dateSelectBtn.setBounds(284, 44, 105, 27);
		addTaskPan.add(dateSelectBtn);



		JTextArea taskConT = new JTextArea();
		taskConT.setBounds(90, 82, 296, 187);
		addTaskPan.add(taskConT);

		// 일정추가 패널 끝


		// 기본 캘린더 상단 패널 시작
		JPanel calendar_top = new JPanel();
		calendar_top.setBounds(145, 55, 437, 57);
		contentPane.add(calendar_top);
		calendar_top.setLayout(null);

		// 일단 전월 후월 변경 기능 추가
        nowDay = cal.get(Calendar.DAY_OF_MONTH);
        nowMonth = (cal.get(Calendar.MONTH)+1);
        nowYear = cal.get(Calendar.YEAR);
		JLabel selectedDate = new JLabel(nowDate());
		String[] days = {"일","월","화","수","목","금","토"};
		
		JLabel daysLb = null;
		for(int i=0;i<7;i++) {
			daysLb= new JLabel(days[i]);
		}
		daysLb.setHorizontalAlignment(JLabel.CENTER);
		calendar_top.add(daysLb);
		
        // 클릭시 전년 출력
		preYear = new JButton("<<");
		preYear.setBounds(14, 20, 55, 25);
		calendar_top.add(preYear);
		preYear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setNowYear(getNowYear()-1);
				selectedDate.setText(nowDate());
			}
		});
		

        // 클릭시 내년 출력
		nextYear = new JButton(">>");
		nextYear.setBounds(368, 20, 55, 25);
		calendar_top.add(nextYear);
		nextYear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setNowYear(getNowYear()+1);
				selectedDate.setText(nowDate());
			}
		});

        // 클릭시 전월 출력
		preMonth = new JButton("<");
		preMonth.setBounds(83, 20, 55, 25);
		calendar_top.add(preMonth);
		preMonth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setNowMonth(getNowMonth()-1);
				selectedDate.setText(nowDate());
			}
		});

        // 클릭시 다음월 출력
		nextMonth = new JButton(">");
		nextMonth.setBounds(299, 20, 55, 25);
		calendar_top.add(nextMonth);
		nextMonth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setNowMonth(getNowMonth()+1);
				selectedDate.setText(nowDate());
			}
		});
		
		
		selectedDate.setHorizontalAlignment(SwingConstants.CENTER);
		selectedDate.setBounds(142, 19, 150, 30);
		calendar_top.add(selectedDate);
		// 기본 캘린더 상단 패널 끝

		// 기본 캘린더 하단 패널 시작

		calendar_bottom = new JPanel();
		
		calendar_bottom.setBounds(145, 112, 437, 240);
		calendar_bottom.setLayout(new GridLayout(6, 7, 5, 5));
		calendar_bottom.setVisible(true);
		makeCal();
		
		// 기본 캘린더 하단 패널 끝
		// 현재 월 가져와서, 총 일수를 계산한 후,
		// 해당 일자들을 배열로 가져옴.
		
		contentPane.add(calendar_bottom);


		// 상단 버튼 시작
		
		JPanel calTopPan = new JPanel();
		calTopPan.setBounds(0, 0, 582, 55);
		calTopPan.setLayout(new FlowLayout(FlowLayout.CENTER,10,20));
		contentPane.add(calTopPan);
		
		JButton addTaskBtn = new JButton("일정 추가");
		addTaskBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calendar_top.setVisible(false);
				calendar_bottom.setVisible(false); 
				addTaskPan.setVisible(true);
			}
		});
		calTopPan.add(addTaskBtn);

		JButton delTaskBtn = new JButton("일정 삭제");
		delTaskBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
//		delTaskBtn.setBounds(126, 15, 102, 30);
		calTopPan.add(delTaskBtn);

		JButton allTaskBtn = new JButton("전체 일정");
		allTaskBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
//		allTaskBtn.setBounds(240, 15, 102, 30);
		calTopPan.add(allTaskBtn);

		JButton completeTaskBtn = new JButton("완료 처리");
		completeTaskBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
//		completeTaskBtn.setBounds(354, 15, 102, 30);
		calTopPan.add(completeTaskBtn);

		JButton supportBtn = new JButton("후원 하기");
		supportBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		}
		});
//		supportBtn.setBounds(468, 15, 102, 30);
		calTopPan.add(supportBtn);

		


		// 상단 끝

	}
}