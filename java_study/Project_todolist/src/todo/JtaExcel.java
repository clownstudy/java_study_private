package todo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import jxl.Workbook;
import jxl.write.NumberFormats;
import jxl.write.WritableCellFormat;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class JtaExcel extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	
 String[] column ={"aa", "bb"} ;  // 컬럼명
 String FilePath = "D:\\apri_ncs\\data.xls" ; // 파일 경로 및 파일명
 String SheetName = "test" ;   // 시트 이름
 JTable tb ;
 String[][] data = new String[4][2] ;// 데이터
 
 public void Excel(){
  for(int i = 0 ; i < 4 ; i++){ // 데이터 넣기
   for(int j = 1 ; j < 3 ; j++){
    data[i][j-1] = i * j + "" ;
   }
  }
  
  tb = new JTable(data, column) ; // 테이블을 만듦
  JScrollPane jsp = new JScrollPane(tb) ;
  JButton btn = new JButton("저장") ;
  this.add(jsp, BorderLayout.CENTER) ;
  this.add(btn, BorderLayout.SOUTH) ;
  
  this.setSize(300, 280) ;
  this.setVisible(true) ;
  
  btn.addActionListener(this) ;

 }

 public void actionPerformed(ActionEvent e) {
  String[] getColumn = new String[tb.getColumnCount()] ;
  for(int i = 0 ; i < tb.getColumnCount() ; i++){ // 컬럼명 받기
   getColumn[i] = tb.getColumnName(i) ;
  }
  
  String[][] getData = new String[tb.getRowCount()][tb.getColumnCount()] ; // 데이터 받기
  for(int i = 0 ; i < tb.getRowCount() ; i++){
   for(int j = 0 ; j < tb.getColumnCount() ; j++){
    getData[i][j] = (String) tb.getValueAt(i, j) ;
   }
  }
  
  try {
   WritableWorkbook workbook = Workbook.createWorkbook(new File(FilePath)) ;  // 파일경로 설정
   WritableSheet sheet = workbook.createSheet(SheetName, 0);      // 시트이름과 몇번째 시트인덱스
   
   jxl.write.WritableCellFormat format_column = new WritableCellFormat();  // 컬럼 포멧. 스트링
   jxl.write.WritableCellFormat format_data = new WritableCellFormat();  // 데이터 포멧. 스트링

   jxl.write.WritableCellFormat format_integer1 = new WritableCellFormat(NumberFormats.INTEGER);  // 데이터 포멧. 정수형.

   jxl.write.WritableCellFormat format_float1 = new WritableCellFormat(NumberFormats.FLOAT);  // 데이터 포멧. 실수형.

   format_column.setBackground(jxl.format.Colour.GRAY_25 ); // 컬럼 백그라운드 색 설정.
   format_column.setBorder(jxl.format.Border.ALL,jxl.format.BorderLineStyle.THIN ); // 컬럼 보더라인 스타일 설정.

   for (int i = 0; i < getColumn.length; i++ ) {  // 컬럼명  넣기
       jxl.write.Label label = new jxl.write.Label(i, 0, column[i], format_column);
       sheet.addCell(label);
   }
   
   for (int i = 0 ; i < data.length  ; i++) { // 데이터 넣기. 컬럼명이 0번에 들어가므로 데이터는 1부터 넣는다.
       for(int j = 0 ; j < getData[i].length ; j++){
        jxl.write.Label lbl = new jxl.write.Label(j, i + 1, getData[i][j], format_data) ;
        sheet.addCell(lbl) ;
       }
   }
   
   workbook.write();  // 파일 저장
   workbook.close();  // 파일 닫기
  } catch (Exception e1) {
   e1.printStackTrace();
  }
 }
 
 public static void main(String[] args){
  new JtaExcel().Excel() ;
 }
}