package com.dai4;


import com.dai4.model.Formateur;

import java.sql.*;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Connection cx = null;
        PreparedStatement stm = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;





        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cx = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testjdbc", "root", ""
            );

            stm = cx.prepareStatement("select*from Formateur");
            stmt = cx.prepareStatement("select*from Apprenant");

            if(stmt.execute()) {
                rs = stmt.getResultSet();
            }

            while(rs.next()) {
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString("nom"));
                System.out.println(rs.getString("prenom"));
                System.out.println("***********************************************************************************");
            }

            if(stm.execute()) {
                rs = stm.getResultSet();
            }

            if(rs.next()) {
                System.out.println("***********************************************************************************");
                System.out.println(rs.getString("siren"));
                System.out.println(rs.getString("nom"));
                System.out.println(rs.getString("prenom"));
                System.out.println("***********************************************************************************");
            }

            rs.close();
            stm.close();
            cx.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //f.afficher();

/*
        Formateur f = new Formateur("gggg","mmmm","pl12mo36uh");
        f.afficher();

        System.out.println("***********************************************************************************");


        List<Apprenant> apprenantList = new ArrayList<>();
        Apprenant a = new Apprenant("pp","oo",000001);
        a.afficher();
        System.out.println("***********************************************************************************");

        apprenantList.add(a);


        Apprenant b = new Apprenant("aa","uu",000002);
        b.afficher();
        System.out.println("***********************************************************************************");

        apprenantList.add(b);


        Apprenant c = new Apprenant("ff","vv",000003);
        c.afficher();

        System.out.println("***********************************************************************************");
        apprenantList.add(c);


        Apprenant d = new Apprenant("dd","ii",000004);
        d.afficher();

        System.out.println("***********************************************************************************");
        apprenantList.add(d);


        Apprenant e = new Apprenant("bb","jj",000005);
        e.afficher();
        apprenantList.add(e);
    }**/
    }
}
