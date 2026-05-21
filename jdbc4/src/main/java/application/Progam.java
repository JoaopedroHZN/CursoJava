package application;

import db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Progam {

    public static void main(String[] args){
        Connection conn = null;
        PreparedStatement st = null;
        //Atualizar Dados
        try {
            conn = DB.getConnection();
            st = conn.prepareStatement(
                    "UPDATE seller "
                    + "SET BaseSalary  =  BaseSalary + ?"
                    + "WHERE"
                    + "(DepartmentId = ?)");

            st.setDouble(1,200);
            st.setInt(2,2);

            int rowsAffected = st.executeUpdate();
            System.out.println("Done! Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            DB.closeStatements(st);
            DB.closeConnection();
        }
    }

}
