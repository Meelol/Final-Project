package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ActivitiesModel {

    static Connection conn = null;

    public static ResultSet getListOfActivities() {
        conn = DBConnect.startConnection();
        String query = "SELECT * FROM public.\"PRODUCTS\" AS P WHERE P.\"productID\" >= 3000 ;";
        try {
            Statement stmnt = conn.createStatement();
            ResultSet set = stmnt.executeQuery(query);
            return set;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
