package com.example.comp214_groupassignment4;


import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static java.lang.Integer.parseInt;

public class addItemsToBasketController {



    public Button addItemBtn;

    @FXML
    public TextField productID_txtfld, price_txtfld,  quantity_txtfld, basketId_txtfld,   size_txtfld, form_fld;


    public void OnSAveChangesButton(ActionEvent actionEvent) throws SQLException {
        Connection connection = DBUtil.dbConnect();
        PreparedStatement statement = connection.prepareStatement("{CALL BASKET_ADD_SP (?, ?, ?, ?, ? ,?)}");
        // PreparedStatement statement = null;
        try{

            connection.setAutoCommit(false);


            statement.setInt(1, parseInt(productID_txtfld.getText()));
            statement.setDouble(2, Double.parseDouble(price_txtfld.getText()));
            statement.setInt(3, parseInt(quantity_txtfld.getText()));
            statement.setInt(4, parseInt(basketId_txtfld.getText()));
            statement.setInt(5, parseInt(size_txtfld.getText()));
            statement.setInt(6, parseInt(form_fld.getText()));

            statement.addBatch();


            //statement.executeBatch();

        }catch (Exception e)
        {
            e.printStackTrace();
        }finally {
            if(null != statement){
                try {
                    statement.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }

        }

    }

    private void alert(String success, String s, Alert.AlertType information) {

    }


}