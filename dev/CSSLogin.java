package dev;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CSSLogin extends Application{

    public class PeselValidator {

        private byte PESEL[] = new byte[11];
        private boolean valid = false;

        public PeselValidator(String PESELNumber) {
            if (PESELNumber.length() != 11){
                valid = false;
            }
            else {
                for (int i = 0; i < 11; i++){
                    PESEL[i] = Byte.parseByte(PESELNumber.substring(i, i+1));
                }
                if (checkSum() && checkMonth() && checkDay()) {
                    valid = true;
                }
                else {
                    valid = false;
                }
            }
        }

        public boolean isValid() {
            return valid;
        }

        public int getBirthYear() {
            int year;
            int month;
            year = 10 * PESEL[0];
            year += PESEL[1];
            month = 10 * PESEL[2];
            month += PESEL[3];
            if (month > 80 && month < 93) {
                year += 1800;
            }
            else if (month > 0 && month < 13) {
                year += 1900;
            }
            else if (month > 20 && month < 33) {
                year += 2000;
            }
            else if (month > 40 && month < 53) {
                year += 2100;
            }
            else if (month > 60 && month < 73) {
                year += 2200;
            }
            return year;
        }

        public int getBirthMonth() {
            int month;
            month = 10 * PESEL[2];
            month += PESEL[3];
            if (month > 80 && month < 93) {
                month -= 80;
            }
            else if (month > 20 && month < 33) {
                month -= 20;
            }
            else if (month > 40 && month < 53) {
                month -= 40;
            }
            else if (month > 60 && month < 73) {
                month -= 60;
            }
            return month;
        }


        public int getBirthDay() {
            int day;
            day = 10 * PESEL[4];
            day += PESEL[5];
            return day;
        }

        public String getSex() {
            if (valid) {
                if (PESEL[9] % 2 == 1) {
                    return "Mezczyzna";
                }
                else {
                    return "Kobieta";
                }
            }
            else {
                return "---";
            }
        }

        private boolean checkSum() {
            int sum = 1 * PESEL[0] +
                    3 * PESEL[1] +
                    7 * PESEL[2] +
                    9 * PESEL[3] +
                    1 * PESEL[4] +
                    3 * PESEL[5] +
                    7 * PESEL[6] +
                    9 * PESEL[7] +
                    1 * PESEL[8] +
                    3 * PESEL[9];
            sum %= 10;
            sum = 10 - sum;
            sum %= 10;

            if (sum == PESEL[10]) {
                return true;
            }
            else {
                return false;
            }
        }

        private boolean checkMonth() {
            int month = getBirthMonth();
            int day = getBirthDay();
            if (month > 0 && month < 13) {
                return true;
            }
            else {
                return false;
            }
        }

        private boolean checkDay() {
            int year = getBirthYear();
            int month = getBirthMonth();
            int day = getBirthDay();
            if ((day >0 && day < 32) &&
                    (month == 1 || month == 3 || month == 5 ||
                            month == 7 || month == 8 || month == 10 ||
                            month == 12)) {
                return true;
            }
            else if ((day >0 && day < 31) &&
                    (month == 4 || month == 6 || month == 9 ||
                            month == 11)) {
                return true;
            }
            else if ((day >0 && day < 30 && leapYear(year)) ||
                    (day >0 && day < 29 && !leapYear(year))) {
                return true;
            }
            else {
                return false;
            }
        }

        private boolean leapYear(int year) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                return true;
            else
                return false;
        }
    }

    public static void main(String[] args) {launch(args);}

    Stage window;

    @Override
    public void start(Stage primaryStage) {

        //HEADER
        HBox imLogo = new HBox();
        imLogo.setId("imlogo");
        imLogo.setMinSize(90,94);
        imLogo.setMaxSize(90,94);

        HBox imNaglowek = new HBox();
        imNaglowek.setId("imNaglowek");
        imNaglowek.setMinSize(663,94);

        HBox hbHeader = new HBox();
        hbHeader.getChildren().addAll(imLogo,imNaglowek);

        //MENU_POZ
        HBox imMenuPoz = new HBox();
        imMenuPoz.setId("imMenuPoz");
        imMenuPoz.setMinSize(753,197);
        imMenuPoz.setMaxSize(753,197);

        //MIDDLE
        GridPane gpMiddle = new GridPane();
        gpMiddle.setMaxWidth(753);
        gpMiddle.setMinHeight(267);
        gpMiddle.setVgap(20);
        //gpMiddle.setStyle("-fx-background-color:#228B22;");
        //gpMiddle.setGridLinesVisible(true);

        //BUTTONS
        Button btnSave = new Button("Zapisz");

        Button btnP1 = new Button();
        btnP1.setId("btnP1");
        btnP1.setMinSize(159,38);

        Button btnP2 = new Button();
        btnP2.setId("btnP2");
        btnP2.setMinSize(159,38);

        //INPUT
        TextField peselInput = new TextField("");
        peselInput.setMinWidth(280);
        peselInput.setMaxWidth(280);
        TextField miastoInput = new TextField("");
        miastoInput.setMaxWidth(280);

        //BOXES
        VBox vbButtons = new VBox();
        vbButtons.setAlignment(Pos.TOP_CENTER);
        vbButtons.setMinWidth(280);
        vbButtons.setSpacing(20);
        vbButtons.getChildren().addAll(btnP1, btnP2);

        VBox vbInput = new VBox(20);
        vbInput.setAlignment(Pos.TOP_CENTER);
        vbInput.setMinWidth(430);
        //vbInput.setStyle("-fx-background-color:#6b0951;");
        vbInput.getChildren().addAll(peselInput, miastoInput, btnSave);

        VBox vbText = new VBox(30);
        vbText.setAlignment(Pos.TOP_LEFT);
        //vbText.setStyle("-fx-background-color:#00546b;");
        vbText.getChildren().addAll(new Label("PESEL"), new Label("Miasto"));

        VBox vbStardust = new VBox(30);
        vbStardust.setAlignment(Pos.TOP_CENTER);
        vbStardust.setMinWidth(340);
        //vbStardust.setStyle("-fx-background-color:#8b8681;");
        vbStardust.getChildren().addAll(new Label("*************"), new Label("*************"));

        VBox vbValidation = new VBox();
        vbValidation.setAlignment(Pos.TOP_LEFT);
        vbValidation.setMinWidth(90);
        vbValidation.setSpacing(35);
        //vbValidation.setStyle("-fx-background-color:#6b0006;");
        vbValidation.getChildren().addAll(new Label("Błąd"), new Label("Błąd"));

        HBox hbStarVal = new HBox();
        hbStarVal.getChildren().addAll(vbStardust, vbValidation);

        StackPane spRight = new StackPane();
        spRight.getChildren().addAll(hbStarVal, vbInput);

        //SET_ON_ACTION
        peselInput.setOnKeyTyped(e ->{
            int maxCharacters = 11;
            if (peselInput.getText().length() >= maxCharacters)
                e.consume();
            if(!e.getCharacter().matches("[0-9]"))
                e.consume();
        });

        miastoInput.setOnKeyTyped(e ->{
            if(!e.getCharacter().matches("[A-z0-9-]"))
                e.consume();
        });

        btnSave.setOnAction(e -> {
            vbValidation.getChildren().clear();
            PeselValidator pV = new PeselValidator(peselInput.getText());
            if (!pV.isValid())
                vbValidation.getChildren().add(new Label("Błąd"));
            else
                vbValidation.getChildren().add(new Label("Dane poprawne"));

            if(!miastoInput.getText().matches("[A-z]+"))
                vbValidation.getChildren().add(new Label("Błąd"));
            else
                vbValidation.getChildren().add(new Label("Dane poprawne"));
        });

        btnP1.setOnAction(e -> {
            vbStardust.setVisible(false);
            vbValidation.setVisible(false);
            vbInput.setVisible(true);
        });

        btnP2.setOnAction(e -> {
            vbStardust.setVisible(true);
            vbValidation.setVisible(true);
            vbInput.setVisible(false);
        });

        gpMiddle.add(vbButtons,2,1,1,1);
        gpMiddle.add(vbText,5,1,1,1);
        gpMiddle.add(spRight,6,1,1,1);

        HBox hbMiddle = new HBox();
        hbMiddle.setAlignment(Pos.CENTER_LEFT);
        hbMiddle.getChildren().add(gpMiddle);

        //MIDDLE_INITIAL_VISIBILITY
        vbValidation.setVisible(false);
        vbStardust.setVisible(false);

        //FOOT
        HBox imStopka = new HBox();
        imStopka.setId("imStopka");
        imStopka.setMinSize(753,40);
        imStopka.setMaxSize(753,40);

        VBox vbMain = new VBox();
        vbMain.getChildren().addAll(hbHeader, imMenuPoz, hbMiddle, imStopka);

        Scene scene = new Scene(vbMain,753,600);
        scene.getStylesheets().addAll(this.getClass().getResource("GoodStyle.css").toExternalForm());

        window = primaryStage;
        window.setScene(scene);
        window.show();
    }
}