package QLPTGT;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Modify {
    private static String DB_URL = "jdbc:mysql://localhost:3306/quanlyptgt";
    public static List<QuanLyPTGT> findAll() {
        List<QuanLyPTGT> quanLyPTGTList = new ArrayList<>();
        Connection connection = null;

        Statement statement = null;
        try {
            connection = DriverManager.getConnection(DB_URL, "root","quyen1234" );
            String sql = "Select * from quanlyptgt";
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                QuanLyPTGT quanLyPTGT = new QuanLyPTGT(
                        resultSet.getInt("ID"),
                        resultSet.getString("HãngSX"),
                        resultSet.getFloat("NămSX"),
                        resultSet.getFloat("GiáBán"),
                        resultSet.getString("Màu"),
                        resultSet.getInt("SốChỗNgồi"),
                        resultSet.getString("KiểuĐộngCơ"),
                        resultSet.getString("CôngSuất"),
                        resultSet.getString("TrọngTải"));
                quanLyPTGTList.add(quanLyPTGT);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return quanLyPTGTList;
    }





    public static void Thêm(QuanLyPTGT quanLyPTGT) {
        Connection connection = null;

        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection(DB_URL, "root","quyen1234");
            String sql = "insert into quanlyptgt.quanlyptgt(HãngSX, NămSX, GiáBán, Màu, SốChỗNgồi, KiểuĐộngCơ, CôngSuất, TrọngTải) values(?,?,?,?,?,?,?,?)";
            statement = connection.prepareCall(sql);


            statement.setString(1, quanLyPTGT.getHãngSX());
            statement.setFloat(2, quanLyPTGT.getNămSX());
            statement.setFloat(3, quanLyPTGT.getGiáBán());
            statement.setString(4, quanLyPTGT.getMàu());
            statement.setInt(5, quanLyPTGT.getSốChỗNgồi());
            statement.setString(6, quanLyPTGT.getKiểuĐộngCơ());
            statement.setString(7, quanLyPTGT.getCôngSuất());
            statement.setString(8, quanLyPTGT.getTrọngTải());

            statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void Sửa(QuanLyPTGT quanLyPTGT) {
        Connection connection = null;

        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection(DB_URL, "root","quyen1234");
            String sql = "update quanlyptgt.quanlyptgt set HãngSX=?, NămSX=?, GiáBán=?, Màu=?, SốChỗNgồi=?, KiểuĐộngCơ=?, CôngSuất=?, TrọngTải=? where HãngSX=?, NămSX=?, GiáBán=?, Màu=?, SốChỗNgồi=?, KiểuĐộngCơ=?, CôngSuất=?, TrọngTải=? ";
            statement = connection.prepareCall(sql);

            statement.setInt(1,quanLyPTGT.getID());
            statement.setString(2, quanLyPTGT.getHãngSX());
            statement.setFloat(3, quanLyPTGT.getNămSX());
            statement.setFloat(4, quanLyPTGT.getGiáBán());
            statement.setString(5, quanLyPTGT.getMàu());
            statement.setInt(6, quanLyPTGT.getSốChỗNgồi());
            statement.setString(7, quanLyPTGT.getKiểuĐộngCơ());
            statement.setString(8, quanLyPTGT.getCôngSuất());
            statement.setString(9, quanLyPTGT.getTrọngTải());

            statement.execute();


        } catch (SQLException ex) {
            Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }


    }





    public static void Xóa(int ID) {
        Connection connection = null;

        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection(DB_URL, "root","quyen1234");
            String sql = "delete from quanlyptgt.quanlyptgt where ID=? ";
            statement = connection.prepareCall(sql);

            statement.setInt(1, ID);


            statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }




    public static List<QuanLyPTGT> TìmBằngHãngSX(String HãngSX) {
        List<QuanLyPTGT> quanLyPTGTList = new ArrayList<>();
        Connection connection = null;

        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection(DB_URL, "root","quyen1234");
            String sql = "Select * from quanlyptgt.quanlyptgt where HãngSX like  ?";
            statement = connection.prepareCall(sql);
            statement.setString(1,"%"+ HãngSX+"%");

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                QuanLyPTGT quanLyPTGT = new QuanLyPTGT(
                        resultSet.getInt("ID"),
                        resultSet.getString("HãngSX"),
                        resultSet.getInt("NămSX"),
                        resultSet.getFloat("GiáBán"),
                        resultSet.getString("Màu"),
                        resultSet.getInt("SốChỗNgồi"),
                        resultSet.getString("KiểuĐộngCơ"),
                        resultSet.getString("CôngSuất"),
                        resultSet.getString("TrọngTải"));
                quanLyPTGTList.add(quanLyPTGT);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return quanLyPTGTList;
    }

}