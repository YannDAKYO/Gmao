
import java.sql.*;
	import java.util.ArrayList;
	import java.util.List;

public class ClientDAO {
	

	/**
	 * Classe d'accès aux données contenues dans la table client
	 * 
	 * @version 1.2
	 */
public class ClientDAO {

	    /**
	     * Paramètres de connexion à la base de données oracle URL, LOGIN et PASS
	     * sont des constantes
	     */
	    final static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	    final static String LOGIN = "GMAO"; // exemple BDD1
	    final static String PASS = "1234"; // exemple BDD1

	    /**
	     * Constructeur de la classe
	     */
	    public ClientDAO() {
	        // chargement du pilote de bases de données
	        try {
	            Class.forName("oracle.jdbc.OracleDriver");
	        } catch (ClassNotFoundException e) {
	            System.err.println("Impossible de charger le pilote de BDD, ne pas oublier d'importer le fichier .jar dans le projet");
	        }
	    }

	    /**
	     * Permet d'ajouter un client dans la table client Le mode est auto-commit
	     * par défaut : chaque insertion est validée
	     * 
	     * @param client le client à ajouter
	     * @return retourne le nombre de lignes ajoutées dans la table
	     */
	    public int ajouter(Client client) {
	        Connection con = null;
	        PreparedStatement ps = null;
	        int retour = 0;

	        // connexion à la base de données
	        try {
	            // tentative de connexion
	            con = DriverManager.getConnection(URL, LOGIN, PASS);
	            // préparation de l'instruction SQL, chaque ? représente une valeur à communiquer dans l'insertion
	            ps = con.prepareStatement("INSERT INTO Client (nomEntreprise, numIFU, numRCCM, adresse, codeAPE) VALUES (?, ?, ?, ?, ?)");
	            ps.setString(1, client.getNomEntreprise());
	            ps.setString(2, client.getNumIFU());
	            ps.setString(3, client.getNumRCCM());
	            ps.setString(4, client.getAdresse());
	            ps.setString(5, client.getCodeAPE());

	            // Exécution de la requête
	            retour = ps.executeUpdate();

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // fermeture du preparedStatement et de la connexion
	            try {
	                if (ps != null) ps.close();
	            } catch (Exception ignore) {}
	            try {
	                if (con != null) con.close();
	            } catch (Exception ignore) {}
	        }
	        return retour;
	    }

	    /**
	     * Permet de récupérer un client à partir de son nom d'entreprise
	     * 
	     * @param nomEntreprise le nom de l'entreprise du client à récupérer
	     * @return le client trouvé; null si aucun client ne correspond à ce nom
	     */
	    public Client getClient(String nomEntreprise) {
	        Connection con = null;
	        PreparedStatement ps = null;
	        ResultSet rs = null;
	        Client retour = null;

	        // connexion à la base de données
	        try {
	            con = DriverManager.getConnection(URL, LOGIN, PASS);
	            ps = con.prepareStatement("SELECT * FROM Client WHERE nomEntreprise = ?");
	            ps.setString(1, nomEntreprise);

	            // on exécute la requête
	            rs = ps.executeQuery();
	            // passe à la première (et unique) ligne retournée
	            if (rs.next()) {
	                retour = new Client(rs.getString("nomEntreprise"), rs.getString("numIFU"),
	                        rs.getString("numRCCM"), rs.getString("adresse"), rs.getString("codeAPE"));
	            }

	        } catch (Exception ee) {
	            ee.printStackTrace();
	        } finally {
	            // fermeture du ResultSet, du PreparedStatement et de la Connexion
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

	    /**
	     * Permet de récupérer tous les clients stockés dans la table client
	     * 
	     * @return une ArrayList de Clients
	     */
	    public List<Client> getListeClient() {
	        Connection con = null;
	        PreparedStatement ps = null;
	        ResultSet rs = null;
	        List<Client> retour = new ArrayList<Client>();

	        // connexion à la base de données
	        try {
	            con = DriverManager.getConnection(URL, LOGIN, PASS);
	            ps = con.prepareStatement("SELECT * FROM Client");

	            // on exécute la requête
	            rs = ps.executeQuery();
	            // on parcourt les lignes du résultat
	            while (rs.next()) {
	                retour.add(new Client(rs.getString("nomEntreprise"), rs.getString("numIFU"),
	                        rs.getString("numRCCM"), rs.getString("adresse"), rs.getString("codeAPE")));
	            }

	        } catch (Exception ee) {
	            ee.printStackTrace();
	        } finally {
	            // fermeture du rs, du preparedStatement et de la connexion
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

	    /**
	     * Permet de modifier un client dans la table client
	     * 
	     * @param client le client à modifier
	     * @return retourne le nombre de lignes mises à jour dans la table
	     */
	    public int modifier(Client client) {
	        Connection con = null;
	        PreparedStatement ps = null;
	        int retour = 0;

	        // connexion à la base de données
	        try {
	            con = DriverManager.getConnection(URL, LOGIN, PASS);
	            // préparation de l'instruction SQL
	            ps = con.prepareStatement("UPDATE Client SET numIFU = ?, numRCCM = ?, adresse = ?, codeAPE = ? WHERE nomEntreprise = ?");
	            ps.setString(1, client.getNumIFU());
	            ps.setString(2, client.getNumRCCM());
	            ps.setString(3, client.getAdresse());
	            ps.setString(4, client.getCodeAPE());
	            ps.setString(5, client.getNomEntreprise());

	            // Exécution de la requête
	            retour = ps.executeUpdate();

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // fermeture du preparedStatement et de la connexion
	            try {
	                if (ps != null) ps.close();
	            } catch (Exception ignore) {}
	            try {
	                if (con != null) con.close();
	            } catch (Exception ignore) {}
	        }
	        return retour;
	    }

	    /**
	     * Permet de supprimer un client dans la table client
	     * 
	     * @param nomEntreprise le nom de l'entreprise du client à supprimer
	     * @return retourne le nombre de lignes supprimées dans la table
	     */
	    public int supprimer(String nomEntreprise) {
	        Connection con = null;
	        PreparedStatement ps = null;
	        int retour = 0;

	        // connexion à la base de données
	        try {
	            con = DriverManager.getConnection(URL, LOGIN, PASS);
	            // préparation de l'instruction SQL
	            ps = con.prepareStatement("DELETE FROM Client WHERE nomEntreprise = ?");
	            ps.setString(1, nomEntreprise);

	            // Exécution de la requête
	            retour = ps.executeUpdate();

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // fermeture du preparedStatement et de la connexion
	            try {
	                if (ps != null) ps.close();
	            } catch (Exception ignore) {}
	            try {
	                if (con != null) con.close();
	            } catch (Exception ignore) {}
	        }
	        return retour;
	    }

	    /**
	     * Affiche la liste de tous les clients stockés dans la table client
	     */
	    public void afficherListe() {
	        List<Client> liste = getListeClient();
	        // affichage des clients
	        for (Client client : liste) {
	            System.out.println(client.toString());
	        }
	    }

	    // main permettant de tester la classe
	    public static void main(String[] args) throws SQLException {
	        ClientDAO clientDAO = new ClientDAO();
	        
	        // test de la méthode ajouter
	        Client c1 = new Client("secoma", "123456ZE789", "98765AE4321", "Koudougou 01", "APE1234");
	        int retour = clientDAO.ajouter(c1);
	        System.out.println(retour + " lignes ajoutées");

	        // test de la méthode getClient
	        Client c2 = clientDAO.getClient("secoma");
	        System.out.println(c2);

	        // test de la méthode getListeClient
	        List<Client> liste = clientDAO.getListeClient();
	        for (Client client : liste) {
	            System.out.println(client.toString());
	        }

	        // test de la méthode modifier
	        c1.setNomEntreprise("Secoma Modifié");
	        int modifRetour = clientDAO.modifier(c1);
	        System.out.println(modifRetour + " lignes modifiées");

	        // test de la méthode supprimer
	        int supprRetour = clientDAO.supprimer("Secoma Modifié");
	        System.out.println(supprRetour + " lignes supprimées");

	        // test de la méthode afficherListe
	        clientDAO.afficherListe();
	    }
	}

}
