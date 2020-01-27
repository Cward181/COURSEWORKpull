public class Stats_Units {
    public static void Stats_UnitsInsert(String UnitID, String Faction, String UnitType, int UnitHealth, String TileID){

        try {
            PreparedStatement ps = db.pre pareStatement("INSERT INTO Stats_Units(UnitID, Faction, UnitType, UnitHealth, TileID) VALUES (?, ?, ?, ?, ?);

            ps.setString(1, UnitID);
            ps.setString(2, Faction);
            ps.setString(3, UnitType);
            ps.setString(4, UnitHealth);
            ps.setString(4, TileID);
            ps.executeUpdate();

        } catch (Exception exception) {
            System.out.println("Database error: " + exception.getMessage());
        }
    }
    public static void Select_Stats_Units() {
        try {
            PreparedStatement ps = db.prepareStatement("SELECT UnitID, Faction, UnitType, UnitHealth, TileID FROM Stats_Units");

            ResultSet results = ps.executeQuery();
            while (results.next()) {
                String UnitID = results.getString(1);
                String Faction = results.getString(2);
                String UnitType = results.getString(3);
                int UnitHealth = results.getint(4);
                String TileID = results.getString(5);
                System.out.println(userID + " " + username + " " + dateOfBirth);
            }

        } catch (Exception exception) {
            System.out.println("Database error: " + exception.getMessage());
        }
    }
    public static void Update_Stats_Units (String UnitID, String Faction, String UnitType, int UnitHealth, String TileID){
        try {

            PreparedStatement ps = db.prepareStatement("UPDATE Stats_Units SET Faction = ?, UnitType = ?, UnitHealth = ?, TileID = ? WHERE UnitID = ?");
            ps.setString(1, UnitID);
            ps.setString(2, Faction);
            ps.setString(3, UnitType);
            ps.setString(4, UnitHealth);
            ps.setString(4, TileID);
            ps.executeUpdate();

        } catch (Exception exception) {

            System.out.println(e.getMessage());
        }
    }
    public static void delete_Stats_Units (int weightID){
        try {

            PreparedStatement ps = db.prepareStatement("DELETE FROM Stats_Units WHERE UnitID = ?");
            ps.setInt(1, UnitID);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }
}
