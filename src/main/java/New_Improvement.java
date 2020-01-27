public class New_Improvement {
    public static void New_ImprovementInsert(){

        try {
            PreparedStatement ps = db.prepareStatement("INSERT INTO Stats_Units(UnitID, Faction, UnitType, UnitHealth, tileID) VALUES (?, ?, ?, ?, ?)");

            ps.setString(1, ImprovementID);
            ps.setString(2, Password);
            ps.setString(3, ImprovementType);
            ps.setString(4, ImprovementHealth);
            ps.executeUpdate();

        } catch (Exception exception) {
            System.out.println("Database error: " + exception.getMessage());
        }
    }
}

