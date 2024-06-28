
public class DevisDAO {
	import java.sql.*;

	public class DevisDAO {
	    private Connection connection;

	    public DevisDAO(Connection connection) {
	        this.connection = connection;
	    }

	    public void addDevis(Devis devis) throws SQLException {
	        String query = "INSERT INTO Devis (numeroDevis, nomEntreprise, adresse, telephone, designation, quantite, prixUnitaireHT, prixTotalHT, totalHT, tva, totalTTC, date, validation) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	        try (PreparedStatement stmt = connection.prepareStatement(query)) {
	            stmt.setString(1, devis.getNumeroDevis());
	            stmt.setString(2, devis.getNomEntreprise());
	            stmt.setString(3, devis.getAdresse());
	            stmt.setInt(4, devis.getTelephone());
	            stmt.setString(5, devis.getDesignation());
	            stmt.setInt(6, devis.getQuantite());
	            stmt.setInt(7, devis.getPrixUnitaireHT());
	            stmt.setInt(8, devis.getPrixTotalHT());
	            stmt.setInt(9, devis.getTotalHT());
	            stmt.setFloat(10, devis.getTva());
	            stmt.setFloat(11, devis.getTotalTTC());
	            stmt.setDate(12, devis.getDate());
	            stmt.setString(13, devis.getValidation());
	            stmt.executeUpdate();
	        }
	    }

	    public Devis getDevis(String numeroDevis) throws SQLException {
	        String query = "SELECT * FROM Devis WHERE numeroDevis = ?";
	        try (PreparedStatement stmt = connection.prepareStatement(query)) {
	            stmt.setString(1, numeroDevis);
	            ResultSet rs = stmt.executeQuery();
	            if (rs.next()) {
	                return new Devis(rs.getString("numeroDevis"), rs.getString("nomEntreprise"), rs.getString("adresse"), rs.getInt("telephone"), rs.getString("designation"), rs.getInt("quantite"), rs.getInt("prixUnitaireHT"), rs.getInt("prixTotalHT"), rs.getInt("totalHT"), rs.getFloat("tva"), rs.getFloat("totalTTC"), rs.getDate("date"), rs.getString("validation"));
	            }
	        }
	        return null;
	    }

	    public void updateDevis(Devis devis) throws SQLException {
	        String query = "UPDATE Devis SET nomEntreprise = ?, adresse = ?, telephone = ?, designation = ?, quantite = ?, prixUnitaireHT = ?, prixTotalHT = ?, totalHT = ?, tva = ?, totalTTC = ?, date = ?, validation = ? WHERE numeroDevis = ?";
	        try (PreparedStatement stmt = connection.prepareStatement(query)) {
	            stmt.setString(1, devis.getNomEntreprise());
	            stmt.setString(2, devis.getAdresse());
	            stmt.setInt(3, devis.getTelephone());
	            stmt.setString(4, devis.getDesignation());
	            stmt.setInt(5, devis.getQuantite());
	            stmt.setInt(6, devis.getPrixUnitaireHT());
	            stmt.setInt(7, devis.getPrixTotalHT());
	            stmt.setInt(8, devis.getTotalHT());
	            stmt.setFloat(9, devis.getTva());
	            stmt.setFloat(10, devis.getTotalTTC());
	            stmt.setDate(11, devis.getDate());
	            stmt.setString(12, devis.getValidation());
	            stmt.setString(13, devis.getNumeroDevis());
	            stmt.executeUpdate();
	        }
	    }

	    public void deleteDevis(String numeroDevis) throws SQLException {
	        String query = "DELETE FROM Devis WHERE numeroDevis = ?";
	        try (PreparedStatement stmt = connection.prepareStatement(query)) {
	            stmt.setString(1, numeroDevis);
	            stmt.executeUpdate();
	        }
	    }
	}

}
