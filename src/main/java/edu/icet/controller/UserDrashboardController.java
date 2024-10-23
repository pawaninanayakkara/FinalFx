package edu.icet.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class UserDrashboardController {

    @FXML
    private JFXButton btnDashboard;

    @FXML
    private ComboBox<?> cmbcategory;

    @FXML
    private TableColumn<?, ?> colCategory;

    @FXML
    private TableColumn<?, ?> colItemCode;

    @FXML
    private TableColumn<?, ?> colItemName;

    @FXML
    private TableColumn<?, ?> colPrice;

    @FXML
    private TableColumn<?, ?> colQty;

    @FXML
    private TableColumn<?, ?> colSize;

    @FXML
    private Label lblProducts;

    @FXML
    private AnchorPane productspage;

    @FXML
    private TableView<?> tblViewProducts;

    @FXML
    private JFXTextField txtItemName;

    @FXML
    private JFXTextField txtItemcode;

    @FXML
    private JFXTextField txtPrice;

    @FXML
    private JFXTextField txtQty;

    @FXML
    private JFXTextField txtsize;

    @FXML
    void btnADDPageonAction(ActionEvent event) {

    }

    @FXML
    void btnDashboardPageOnAction(ActionEvent event) {

    }

    @FXML
    void btnDeletePageOnAction(ActionEvent event) {

    }

    @FXML
    void btnLogoutPageOnAction(ActionEvent event) {

    }

    @FXML
    void btnManageEmployeePageOnAction(ActionEvent event) {

    }

    @FXML
    void btnOrdersPageOnAction(ActionEvent event) {

    }

    @FXML
    void btnPlaceOrderPageOnAction(ActionEvent event) {

    }

    @FXML
    void btnProductsPageOnAction(ActionEvent event) {

    }

    @FXML
    void btnSuppliersPageOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdatepageOnAction(ActionEvent event) {

    }

}


