package todo;

import java.awt.EventQueue;

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
	private final JPanel contentPane;
	private static int nowDay;
	private static int nowMonth;
	private static int nowYear;
	private static int endDay;
	private static String nowDate() {
		switch (getNowMonth()) {
		case 0:
			setNowMonth(12);
			break;
		case 13:
			setNowMonth(1);
		default:
			break;
		}
		return getNowYear()+"."+getNowMonth()+"."+getNowDay();
	};
	
	
	
	public static int getNowDay() {
		return nowDay;
	}



	public static void setNowDay(int nowDay) {
		Todolist.nowDay = nowDay;
	}



	public static int getNowMonth() {
		return nowMonth;
	}



	public static void setNowMonth(int nowMonth) {
		Todolist.nowMonth = nowMonth;
	}



	public static int getNowYear() {
		return nowYear;
	}



	public static void setNowYear(int nowYear) {
		Todolist.nowYear = nowYear;
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

		List list = new List();
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
		calendar_top.setBounds(145, 55, 437, 75);
		contentPane.add(calendar_top);
		calendar_top.setLayout(null);

		// 일단 전월 후월 변경 기능 추가
        nowDay = cal.get(Calendar.DAY_OF_MONTH);
        nowMonth = (cal.get(Calendar.MONTH)+1);
        nowYear = cal.get(Calendar.YEAR);
		JLabel selectedDate = new JLabel(nowDate());
		
        // 클릭시 전년 출력
		JButton preYear = new JButton("<<");
		preYear.setBounds(14, 20, 55, 25);
		calendar_top.add(preYear);
		preYear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setNowYear(getNowYear()-1);
				selectedDate.setText(nowDate());
			}
		});
		

        // 클릭시 내년 출력
		JButton nextYear = new JButton(">>");
		nextYear.setBounds(368, 20, 55, 25);
		calendar_top.add(nextYear);
		nextYear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setNowYear(getNowYear()+1);
				selectedDate.setText(nowDate());
			}
		});

        // 클릭시 전월 출력
		JButton preMonth = new JButton("<");
		preMonth.setBounds(83, 20, 55, 25);
		calendar_top.add(preMonth);
		preMonth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setNowMonth(getNowMonth()-1);
				selectedDate.setText(nowDate());
			}
		});

        // 클릭시 다음월 출력
		JButton nextMonth = new JButton(">");
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
		// 기본 캘린더 하단 패널 끝


		JPanel calendar_bottom = new JPanel();
		calendar_bottom.setBounds(145, 130, 437, 223);
		// 기본 노출.
		calendar_bottom.setVisible(true);
		calendar_bottom.setLayout(new GridLayout(5, 7, 5, 5));
		String[] days = {"일","월","화","수","목","금","토"};
		for(int i=0;i<7;i++) {
			JButton daysBtn = new JButton(days[i]);
			calendar_bottom.add(daysBtn);
		}

		// 현재 월 가져와서, 총 일수를 계산한 후,
		// 해당 일자들을 배열로 가져옴.
		
		contentPane.add(calendar_bottom);


		// 상단 버튼 시작
		JButton addTaskBtn = new JButton("일정 추가");
		addTaskBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calendar_top.setVisible(false);
				addTaskPan.setVisible(true);
			}
		});
		addTaskBtn.setBounds(14, 15, 102, 30);
		contentPane.add(addTaskBtn);

		JButton delTaskBtn = new JButton("일정 삭제");
		delTaskBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		delTaskBtn.setBounds(126, 15, 102, 30);
		contentPane.add(delTaskBtn);

		JButton allTaskBtn = new JButton("전체 일정");
		allTaskBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		allTaskBtn.setBounds(240, 15, 102, 30);
		contentPane.add(allTaskBtn);

		JButton completeTaskBtn = new JButton("완료 처리");
		completeTaskBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		completeTaskBtn.setBounds(354, 15, 102, 30);
		contentPane.add(completeTaskBtn);

		JButton supportBtn = new JButton("후원 하기");
		supportBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		}
		});
		supportBtn.setBounds(468, 15, 102, 30);
		contentPane.add(supportBtn);

		JPanel calTopPan = new JPanel();
		calTopPan.setBounds(0, 0, 582, 55);
		contentPane.add(calTopPan);


		// 상단 끝

	}
}