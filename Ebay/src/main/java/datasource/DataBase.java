package datasource;

import database.ConnectToSqlDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataBase {
    static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

    public static void insertDataIntoDB() {
        List<String> list = getItemValue();
        connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertDataFromArrayListToSqlTable(list, "ItemList", "items");
    }

    public static List<String> getItemValue() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Cars");
        itemsList.add("Bikes");
        itemsList.add("Electronics");
        itemsList.add("Watches");
        itemsList.add("TVs");
        itemsList.add("Cell-Phomes");
        itemsList.add("Dinning-Tables");
        itemsList.add("Air-Coditioner");
        itemsList.add("Shoes");

        return itemsList;
    }

    public List<String> getItemsListFromDB() throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("ItemList", "items");
        return list;
    }

    public static void main(String[] args) throws Exception, IOException, SQLException, ClassNotFoundException {
//        insertDataIntoDB();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> list = connectToSqlDB.readDataBase("ItemList", "items");
        for (String st : list) {
            System.out.println(st);
        }
    }
}
