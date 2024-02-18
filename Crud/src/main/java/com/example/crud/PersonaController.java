package com.example.crud;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;
//import TableView<Persona> tablaPersonas;

public class PersonaController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAgregarPersona;


    private TableColumn<Persona,String> colApellidos, colDireccion, colEmail,
            colFechaNacimiento, colID, colNIT, colNombre, colTelefono, colTipoPersona;

    @FXML
    private Label lblApellidos;

    @FXML
    private Label lblDireccion;

    @FXML
    private Label lblEmail;

    @FXML
    private Label lblFechaNacimiento;

    @FXML
    private Label lblID;

    @FXML
    private Label lblNIT;

    @FXML
    private Label lblNombre;

    @FXML
    private Label lblTelefono;

    @FXML
    private Label lblTipoPersona;

    @FXML
    private TableView<Persona> tablaPersonas;

    @FXML
    private TextField txfFechaNacimiento;

    @FXML
    private TextField txfApellidos;

    @FXML
    private TextField txfDireccion;

    @FXML
    private TextField txfEmail;

    @FXML
    private TextField txfID;

    @FXML
    private TextField txfNIT;

    @FXML
    private TextField txfNombre;

    @FXML
    private TextField txfTelefono;

    @FXML
    private TextField txfTipoPersona;
    private ObservableList<Persona> personas;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        personas = FXCollections.observableArrayList();

        this.colNombre.setCellValueFactory(e-> new ReadOnlyStringWrapper(e.getValue().getNombre()));
        this.colApellidos.setCellValueFactory(e-> new ReadOnlyStringWrapper(e.getValue().getApellidos()));
        this.colID.setCellValueFactory(e-> new ReadOnlyStringWrapper(e.getValue().getId()));
        this.colDireccion.setCellValueFactory(e-> new ReadOnlyStringWrapper(e.getValue().getDireccion()));
        this.colTelefono.setCellValueFactory(e-> new ReadOnlyStringWrapper(e.getValue().getTelefono()));
        this.colTipoPersona.setCellValueFactory(e-> new ReadOnlyStringWrapper(e.getValue().getTipoPersona()));
        this.colEmail.setCellValueFactory(e-> new ReadOnlyStringWrapper(e.getValue().getEmail()));
        this.colFechaNacimiento.setCellValueFactory(e-> new ReadOnlyStringWrapper(e.getValue().getFechaNacimiento()));
        this.colNIT.setCellValueFactory(e-> new ReadOnlyStringWrapper(e.getValue().getNit()));


    }

    @FXML
    private void btnAgregarPersona (ActionEvent event){

        String nombre = this.txfNombre.getText();
        String apellidos = this.txfApellidos.getText();
        String id = this.txfID.getText();
        String direccion = this.txfDireccion.getText();
        String telefono = this.txfTelefono.getText();
        String tipoPersona = this.txfTipoPersona.getText();
        String email = this.txfEmail.getText();
        String fechaNacimiento= this.txfFechaNacimiento.getText();
        String nit = this.txfNIT.getText();

        Persona persona = new Persona (nombre, apellidos, id, direccion, telefono, tipoPersona, email, fechaNacimiento, nit);

        if (!this.personas.contains(persona)) {
            this.personas.add(persona);
            this.tablaPersonas.setItems(FXCollections.observableArrayList(personas));
            this.tablaPersonas.refresh();
        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("La persona existe");
            alert.showAndWait();
        }


    }}

