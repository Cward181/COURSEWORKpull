public class New_Unit {
    public static void New_Unit(){

        try {
            PreparedStatement ps = db.prepareStatement("INSERT INTO Stats_Units(UnitID, Faction, UnitType, UnitHealth) VALUES (?, ?, ?, ?)");

            ps.setString(1, UnitID);
            ps.setString(2, Password);
            ps.setString(3, UnitType);
            ps.setString(4, UnitHealth);
            ps.executeUpdate();

        } catch (Exception exception) {
            System.out.println("Database error: " + exception.getMessage());
        }
    }
}
