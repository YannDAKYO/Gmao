
public class maintenanceDAO {
	import java.sql.*;

	public class MaintenanceDAO {
	    private Connection connection;

	    public MaintenanceDAO(Connection connection) {
	        this.connection = connection;
	    }

	    public void addMaintenance(Maintenance maintenance) throws SQLException {
	        String query = "INSERT INTO Maintenance (nomEntreprise, dateDeDemandeMaintenance, objetDeMaintenance, typeMaintenance) VALUES (?, ?, ?, ?)";
	        try (PreparedStatement stmt = connection.prepareStatement(query)) {
	            stmt.setString(1, maintenance.getNomEntreprise());
	            stmt.setDate(2, maintenance.getDateDeDemandeMaintenance());
	            stmt.setString(3, maintenance.getObjetDeMaintenance());
	            stmt.setString(4, maintenance.getTypeMaintenance());
	            stmt.executeUpdate();
	        }
	    }

	    public Maintenance getMaintenance(String nomEntreprise, Date dateDeDemandeMaintenance) throws SQLException {
	        String query = "SELECT * FROM Maintenance WHERE nomEntreprise = ? AND dateDeDemandeMaintenance = ?";
	        try (PreparedStatement stmt = connection.prepareStatement(query)) {
	            stmt.setString(1, nomEntreprise);
	            stmt.setDate(2, dateDeDemandeMaintenance);
	            ResultSet rs = stmt.executeQuery();
	            if (rs.next()) {
	                return new Maintenance(
	                    rs.getString("nomEntreprise"),
	                    rs.getDate("dateDeDemandeMaintenance"),
	                    rs.getString("objetDeMaintenance"),
	                    rs.getString("typeMaintenance")
	                );
	            }
	        }
	        return null;
	    }

	    public void updateMaintenance(Maintenance maintenance) throws SQLException {
	        String query = "UPDATE Maintenance SET objetDeMaintenance = ?, typeMaintenance = ? WHERE nomEntreprise = ? AND dateDeDemandeMaintenance = ?";
	        try (PreparedStatement stmt = connection.prepareStatement(query)) {
	            stmt.setString(1, maintenance.getObjetDeMaintenance());
	            stmt.setString(2, maintenance.getTypeMaintenance());
	            stmt.setString(3, maintenance.getNomEntreprise());
	            stmt.setDate(4, maintenance.getDateDeDemandeMaintenance());
	            stmt.executeUpdate();
	        }
	    }

	    public void deleteMaintenance(String nomEntreprise, Date dateDeDemandeMaintenance) throws SQLException {
	        String query = "DELETE FROM Maintenance WHERE nomEntreprise = ? AND dateDeDemandeMaintenance = ?";
	        try (PreparedStatement stmt = connection.prepareStatement(query)) {
	            stmt.setString(1, nomEntreprise);
	            stmt.setDate(2, dateDeDemandeMaintenance);
	            stmt.executeUpdate();
	        }
	    }
	}

