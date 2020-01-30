import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Attributes_Units {
    public static void Select_Attributes_Units() {
        try {
            PreparedStatement ps = Main.db.prepareStatement("SELECT UnitType, UnitLevel, ProductionTime, Cost, HealthDefault, Attack, UI FROM Stats_Units");

            ResultSet results = ps.executeQuery();
            while (results.next()) {
                String UnitType = results.getString(1);
                int UnitLevel = results.getInt(2);
                int ProductionTime = results.getInt(3);
                int Cost = results.getInt(4);
                int HealthDefault = results.getInt(5);
                int Attack = results.getInt(6);
                String UI = results.getString(7);

                System.out.println(UnitType + " " + UnitLevel + " " + ProductionTime + " " + Cost + " " + HealthDefault + " " + Attack + " " + UI);
            }

        } catch (Exception exception) {
            System.out.println("Database error: " + exception.getMessage());
        }
    }
}
