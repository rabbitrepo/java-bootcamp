
/**
 * Main
 */
import java.sql.DriverManager;

class Main {
    public static void main(String[] data) {

        String serverIp = "100.112.13.86:3306";
        String source = "jdbc:mysql://" + serverIp + "/icoffee?user=bill&password=gates";

        String sql = "select * from staff";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // 1. Start Driver
            var cn = DriverManager.getConnection(source); // 2. Connect DBMS
            var ps = cn.prepareStatement(sql); // 3. Prepare Statement
            var rs = ps.executeQuery(); // 4. Query
            while (rs.next()) { // 5. Read one by one
                String w = rs.getString("name");
                System.out.println(w);
            }
            rs.close();
            ps.close();
            cn.close(); // 6. Clean Up
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}