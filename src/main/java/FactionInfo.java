import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FactionInfo {
    public static void FactionInfoInsert(String Faction, String Password, int Credits){

        try {
            PreparedStatement ps = Main.db.prepareStatement("INSERT INTO FactionInfo(Faction, Password, Credits) VALUES (?, ?, ?, ?, ?)");

            ps.setString(1, Faction);
            ps.setString(2, Password);
            ps.setInt(3, Credits);
            ps.executeUpdate();

        } catch (Exception exception) {
            System.out.println("Database error: " + exception.getMessage());
        }
    }
    public static void Select_FactionInfo() {
        try {
            PreparedStatement ps = Main.db.prepareStatement("SELECT Faction, Password, Credits FROM FactionInfo");

            ResultSet results = ps.executeQuery();
            while (results.next()) {
                String Faction = results.getString(1);
                String Password = results.getString(2);
                int Credits = results.getInt(3);
                System.out.println(Faction + " " + Password + " " + Credits);
            }

        } catch (Exception exception) {
            System.out.println("Database error: " + exception.getMessage());
        }
    }
    public static void Update_FactionInfo (String Faction, String Password, int Credits){
        try {

            PreparedStatement ps = Main.db.prepareStatement("UPDATE FactionInfo SET Password = ?, Credits = ?, WHERE Faction = ?");
            ps.setString(1, Faction);
            ps.setString(2, Password);
            ps.setInt(3, Credits);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
    public static void delete_FactionInfo (int Faction){
        try {

            PreparedStatement ps = Main.db.prepareStatement("DELETE FROM FactionInfo WHERE Faction = ?");
            ps.setInt(1, Faction);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
