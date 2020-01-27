public class New_Faction {
    public static void New_Faction(){

        try {
            PreparedStatement ps = db.prepareStatement("INSERT INTO FactionInfo(Faction, Password) VALUES (?, ?)");

            ps.setString(1, Faction);
            ps.setString(2, Password);

            ps.executeUpdate();

        } catch (Exception exception) {
            System.out.println("Database error: " + exception.getMessage());
        }
    }
}
