package dao;
import java.sql.*;
import metier.entities.Utilisateur;



public class UtilisateurDao {
	
	
	public Utilisateur connexion(String login,String Password) throws SQLException,
    ClassNotFoundException
	{
		
				Utilisateur Util=null;
			
				
			 	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			 	Connection connection=DriverManager.getConnection("jdbc:sqlserver://localhost;database=tpDevOPs;integratedSecurity=true;");

			 
			 PreparedStatement ps =connection.prepareStatement("select * from Utilisateurs where [login] like ? and [password] like ?");
				ps.setString(1, login);
				ps.setString(2, Password);
				
				ResultSet Rs=ps.executeQuery();
				
					if(Rs.next())
					{
						Util=new Utilisateur();
						Util.setLogin(Rs.getString("[login]"));
						Util.setNom(Rs.getString("nom"));
						Util.setPrenom(Rs.getString("prenom"));
						Util.setPassWord(Rs.getNString("[password]"));
					}
				
				
				
			
		
		connection.close();
		return Util;
	}
	
	public boolean inscription(Utilisateur util) throws SQLException,
    ClassNotFoundException
	{
		boolean updt=false;
		int nbupdt=0;
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	 	Connection connection=DriverManager.getConnection("jdbc:sqlserver://localhost;database=tpDevOPs;integratedSecurity=true;");
		
		
		
		
			PreparedStatement ps =connection.prepareStatement("insert into utilisateur ([login],[password],nom,prenom) values (?,?,?,?");
			ps.setString(1, util.getLogin());
			ps.setString(2, util.getPassWord());
			ps.setString(3, util.getNom());
			ps.setString(4, util.getPrenom());
			
			nbupdt=ps.executeUpdate();
			
			if (nbupdt!=0) {
				return true;
			}
			connection.close();
			return updt;
			
	}	
			
		
	
	
	

}
