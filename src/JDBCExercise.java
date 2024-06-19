import java.sql.*;

public class JDBCExercise {
    public JDBCExercise(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/javaexamsem2","rith","@Rith123");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from product");
            while(rs.next())
                System.out.println("id="+rs.getInt(1)+", name="+rs.getString(2)+", pricePerUnit="+rs.getDouble(3)+", activeForSell="+rs.getInt(4));
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}
