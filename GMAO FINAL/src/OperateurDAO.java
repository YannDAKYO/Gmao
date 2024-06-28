
public class OperateurDAO {
	import java.sql.*;
	import java.util.ArrayList;
	import java.util.List;

	/**
	 * Classe d'accès aux données contenues dans la table operateur
	 * 
	 * @version 1.0
	 */
	public class OperateurDAO {

	    final static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	    final static String LOGIN = "GMAO"; // exemple BDD1
	    final static String PASS = "1234"; // exemple BDD1

	    public OperateurDAO() {
	        try {
	            Class.forName("oracle.jdbc.OracleDriver");
	        } catch (ClassNotFoundException e) {
	            System.err.println("Impossible de charger le pilote de BDD, ne pas oublier d'importer le fichier .jar dans le projet");
	        }
	    }

	    public int ajouter(Operateur operateur) {
	        Connection con = null;
	        PreparedStatement ps = null;
	        int retour = 0;

	        try {
	            con = DriverManager.getConnection(URL, LOGIN, PASS);
	            ps = con.prepareStatement("INSERT INTO Operateur (ID_OPERATOR, FIRST_NAME, LAST_NAME, SERVICE_START_DATE, SERVICE_STOP_DATE, SPECIALITIES, TELEPHONE) VALUES (?, ?, ?, ?, ?, ?, ?)");
	            ps.setString(1, operateur.getIdOperator());
	            ps.setString(2, operateur.getFirstName());
	            ps.setString(3, operateur.getLastName());
	            ps.setDate(4, operateur.getServiceStartDate());
	            ps.setDate(5, operateur.getServiceStopDate());
	            ps.setString(6, operateur.getSpecialities());
	            ps.setInt(7, operateur.getTelephone());

	            retour = ps.executeUpdate();

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (ps != null) ps.close();
	            } catch (Exception ignore) {}
	            try {
	                if (con != null) con.close();
	            } catch (Exception ignore) {}
	        }
	        return retour;
	    }

	    public Operateur getOperateur(String idOperator) {
	        Connection con = null;
	        PreparedStatement ps = null;
	        ResultSet rs = null;
	        Operateur retour = null;

	        try {
	            con = DriverManager.getConnection(URL, LOGIN, PASS);
	            ps = con.prepareStatement("SELECT * FROM Operateur WHERE ID_OPERATOR = ?");
	            ps.setString(1, idOperator);

	            rs = ps.executeQuery();
	            if (rs.next()) {
	                retour = new Operateur(
	                    rs.getString("ID_OPERATOR"),
	                    rs.getString("FIRST_NAME"),
	                    rs.getString("LAST_NAME"),
	                    rs.getDate("SERVICE_START_DATE"),
	                    rs.getDate("SERVICE_STOP_DATE"),
	                    rs.getString("SPECIALITIES"),
	                    rs.getInt("TELEPHONE")
	                );
	            }

	        } catch (Exception ee) {
	            ee.printStackTrace();
	        } finally {
	            try {
	                if (rs != null) rs.close();
	            } catch (Exception ignore) {}
	            try {
	                if (ps != null) ps.close();
	            } catch (Exception ignore) {}
	            try {
	                if (con != null) con.close();
	            } catch (Exception ignore) {}
	        }
	        return retour;
	    }

	    public List<Operateur> getListeOperateur() {
	        Connection con = null;
	        PreparedStatement ps = null;
	        ResultSet rs = null;
	        List<Operateur> retour = new ArrayList<>();

	        try {
	            con = DriverManager.getConnection(URL, LOGIN, PASS);
	            ps = con.prepareStatement("SELECT * FROM Operateur");

	            rs = ps.executeQuery();
	            while (rs.next()) {
	                retour.add(new Operateur(
	                    rs.getString("ID_OPERATOR"),
	                    rs.getString("FIRST_NAME"),
	                    rs.getString("LAST_NAME"),
	                    rs.getDate("SERVICE_START_DATE"),
	                    rs.getDate("SERVICE_STOP_DATE"),
	                    rs.getString("SPECIALITIES"),
	                    rs.getInt("TELEPHONE")
	                ));
	            }

	        } catch (Exception ee) {
	            ee.printStackTrace();
	        } finally {
	            try {
	                if (rs != null) rs.close();
	            } catch (Exception ignore) {}
	            try {
	                if (ps != null) ps.close();
	            } catch (Exception ignore) {}
	            try {
	                if (con != null) con.close();
	            } catch (Exception ignore) {}
	        }
	        return retour;
	    }

	    public int modifier(Operateur operateur) {
	        Connection con = null;
	        PreparedStatement ps = null;
	        int retour = 0;

	        try {
	            con = DriverManager.getConnection(URL, LOGIN, PASS);
	            ps = con.prepareStatement("UPDATE Operateur SET FIRST_NAME = ?, LAST_NAME = ?, SERVICE_START_DATE = ?, SERVICE_STOP_DATE = ?, SPECIALITIES = ?, TELEPHONE = ? WHERE ID_OPERATOR = ?");
	            ps.setString(1, operateur.getFirstName());
	            ps.setString(2, operateur.getLastName());
	            ps.setDate(3, operateur.getServiceStartDate());
	            ps.setDate(4, operateur.getServiceStopDate());
	            ps.setString(5, operateur.getSpecialities());
	            ps.setInt(6, operateur.getTelephone());
	            ps.setString(7, operateur.getIdOperator());

	            retour = ps.executeUpdate();

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (ps != null) ps.close();
	            } catch (Exception ignore) {}
	            try {
	                if (con != null) con.close();
	            } catch (Exception ignore) {}
	        }
	        return retour;
	    }

	    public int supprimer(String idOperator) {
	        Connection con = null;
	        PreparedStatement ps = null;
	        int retour = 0;

	        try {
	            con = DriverManager.getConnection(URL, LOGIN, PASS);
	            ps = con.prepareStatement("DELETE FROM Operateur WHERE ID_OPERATOR = ?");
	            ps.setString(1, idOperator);

	            retour = ps.executeUpdate();

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (ps != null) ps.close();
	            } catch (Exception ignore) {}
	            try {
	                if (con != null) con.close();
	            } catch (Exception ignore) {}
	        }
	        return retour;
	    }

	    public void afficherListe() {
	        List<Operateur> liste = getListeOperateur();
	        for (Operateur operateur : liste) {
	            System.out.println(operateur.toString());
	        }
	    }

	    public static void main(String[] args) throws SQLException {
	        OperateurDAO operateurDAO = new OperateurDAO();
	        
	        // test de la méthode ajouter
	        Operateur o1 = new Operateur("OP001", "John", "Doe", Date.valueOf("2022-01-01"), Date.valueOf("2022-12-31"), "Electrician", 123456789);
	        int retour = operateurDAO.ajouter(o1);
	        System.out.println(retour + " lignes ajoutées");

	        // test de la méthode getOperateur
	        Operateur o2 = operateurDAO.getOperateur("OP001");
	        System.out.println(o2);

	        // test de la méthode getListeOperateur
	        List<Operateur> liste = operateurDAO.getListeOperateur();
	        for (Operateur operateur : liste) {
	            System.out.println(operateur.toString());
	        }

	        // test de la méthode modifier
	        o1.setLastName("Doe Modified");
	        int modifRetour = operateurDAO.modifier(o1);
	        System.out.println(modifRetour + " lignes modifiées");

	        // test de la méthode supprimer
	        int supprRetour = operateurDAO.supprimer("OP001");
	        System.out.println(supprRetour + " lignes supprimées");

	        // test de la méthode afficherListe
	        operateurDAO.afficherListe();
	    }
	}

}
