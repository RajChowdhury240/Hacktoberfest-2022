package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class jdbc {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
     
	
     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","your_id","your_password");
     Statement st = con.createStatement();
     String sql = "CREATE TABLE EMPwL(EMPNO NUMBER(5),ENAME VARCHAR2(30),SALARY NUMBER(10,2),PRIMARY KEY(EMPNO)) ";
     try {
    	 st.execute(sql);
    	 System.out.println("$------DB TABLE CREATED-------$");
     }catch(Exception ex) {
    	 System.out.println("ERROR:::::"+ex.toString());
     }
     st.close();
     con.close();
}
}
