package DatabaseFiles;
import java.sql.*;
import java.util.Random;


public class LoginDB
{
    String sql = "select * from login where uname=? and pass=?";

    public boolean check(String uname,String pass)
    {
        try
        {
            // Connection myConn = DriverManager.getConnection("jdbc:mysql://russet.wccnet.edu/mhuwio", "mhuwio", "3XgYJ9RF2EUU");

            Class.forName("com.mysql.jdbc.Driver");
            Connection myConn = DriverManager.getConnection("jdbc:mysql:PutYourOwnHost", "UserName", "Password");
            System.out.println("connected");

            PreparedStatement st = myConn.prepareStatement(sql) ;


            st.setString(1,uname);
            st.setString(2,pass);

            ResultSet rs = st.executeQuery();
            if (rs.next())
            {
                return true;
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
    public void AddUser(String newUname,String newPass)
    {
        try
        {
            String sqlQ = "INSERT INTO login (uname, pass) VALUE ('" + newUname + "','" + newPass + "')";

            Class.forName("com.mysql.jdbc.Driver");
            Connection myConn = DriverManager.getConnection("jdbc:mysql:PutYourOwnHost", "UserName", "Password");
            System.out.println("connected");

            PreparedStatement PS = myConn.prepareStatement(sqlQ);

            PS.executeUpdate(sqlQ);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public String PickupLine()
    {
        try
        {
            String[] initArray = new String[6];
            String SqlQ = "SELECT * FROM pickupLines";

            Class.forName("com.mysql.jdbc.Driver");
            Connection myConn = DriverManager.getConnection("jdbc:mysql:PutYourOwnHost", "UserName", "Password");

            System.out.println("connected");
            Statement stmt = myConn.createStatement();

            Random rand = new Random();

            ResultSet RS = stmt.executeQuery(SqlQ);

            String Lines = "";
            int z = 0;
            while (RS.next())
            {
                initArray[z] = RS.getString("line");
                z++;
                //Lines += RS.getString("line");
            }

            int x = rand.nextInt(initArray.length) ;

            return initArray[x];

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return "error";
    }
}
