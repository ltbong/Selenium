
/*class Sample {
    public static void main(String[] args){
        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }
    }
}*/


//package database_connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//import poly.Dog;

public class Sample 
    {
        public static void main(String[] args)
        {
            /*try
            {
                Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");

                String userName = "sa";
                String password = "Design_20";
                //String url = "jdbc:microsoft:sqlserver://192.168.0.11/TECHNOID:1433"+";databaseName=OBTS";
                String url ="jdbc:sqlserver://RAVITEJA;instanceName=RAVITEJA;DatabaseName=OBTS;";
                Connection con = DriverManager.getConnection(url, userName, password);
                Statement s1 = con.createStatement();
                ResultSet rs = s1.executeQuery("SELECT * FROM Depot");
                
                String[] result = new String[20];
                if(rs!=null){
                    while (rs.next()){
                        for(int i = 0; i <result.length ;i++)
                        {
                            for(int j = 0; j <result.length;j++)
                            {
                                result[j]=rs.getString(i);
                            System.out.println(result[j]);
                        }
                        }
                    }
                }

                //String result = new result[20];

            } catch (Exception e)
            {
                e.printStackTrace();
            }*/
        MyExample me = new MyExample();
        Dog dg = new Dog();
        me.add(dg);
    }


}
