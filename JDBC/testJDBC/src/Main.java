import java.sql.*;  //it has all the jdbc drivers
public class Main{       //this code is for retrieving data from MySQL
    public static void main(String[] args) throws ClassNotFoundException{

        //for making the connection to database we need three things
        String url = "jdbc:mysql://localhost:3306/mydb";    //database url
        String username = "root";                           //database username
        String password = "rohitrp@123";                    //database password
        String query = "SELECT * FROM employees;";

        try{
            Class.forName("com.mysql.jdbc.Driver"); //Loading the JDBC driver from com.mysql package
            System.out.println("Drivers Loaded successfully!!!");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection con = DriverManager.getConnection(url, username, password);  //here connection is an interface and con is its instance
            System.out.println("Connection Established successfully!!!");
            Statement stmt = con.createStatement();      //to run queries
            ResultSet rs = stmt.executeQuery(query);     //ResultSet interface is created to store results of query in instance named rs
            while(rs.next()){                            //extract data from ResultSet, rs.next means jb tk rs instance me data rhega tb tk iski value true rhegi
                int id = rs.getInt("id");          //on L.H.S we've local Java Variables int,String,Double
                String name = rs.getString("name");    //on R.H.S. we've mysql Field names
                String job_title = rs.getString("job_title"); //you can change name for java local variables but not mysql field names
                double sallary = rs.getDouble("sallary");

                System.out.println();               //Now we have to display the result of queries fetched.Therefore we'll print the result
                System.out.println("=====================");
                System.out.println("ID: "+id);
                System.out.println("Name: "+name);
                System.out.println("Job Title: "+job_title);
                System.out.println("Sallary: "+sallary);

            }
            rs.close();    //as a good developer it is our responsibility to close the connection
            stmt.close();
            con.close();
            System.out.println();
            System.out.println("Connection closed Successfully!!!");

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }

    }

}