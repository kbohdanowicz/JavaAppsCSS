package dev;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class WebsiteCSS extends Application{

    public static void main(String[] args) {launch(args);}

    Stage window;

    @Override
    public void start(Stage primaryStage) {

        //HEADER////////////////////////////////////////////////////////////////////////////////////////////////////////
        Pane t1 = new Pane();
        t1.setId("t1");
        t1.setMinSize(1000,224);

        HBox t2 = new HBox();
        t2.setId("t2");
        t2.setMinSize(1000,68);
        t2.setAlignment(Pos.CENTER_LEFT);
        t2.setSpacing(23);
        t2.setPadding(new Insets(0,50,14,50));

        Label text1 = new Label("STRONA GŁÓWNA");
        Label text2 = new Label("OFERTA");
        Label text3 = new Label("CENNIK");
        Label text4 = new Label("SKLEP ONLINE");
        Label text5 = new Label("O NAS");
        Label text6 = new Label("KONTAKT");

        text1.setId("textWhiteB");
        text2.setId("textWhiteB");
        text3.setId("textWhiteB");
        text4.setId("textWhiteB");
        text5.setId("textWhiteB");
        text6.setId("textWhiteB");

        t2.getChildren().addAll(
                text1, new ImageView("/dev/grafika/images/msep.jpg"),
                text2, new ImageView("/dev/grafika/images/msep.jpg"),
                text3, new ImageView("/dev/grafika/images/msep.jpg"),
                text4, new ImageView("/dev/grafika/images/msep.jpg"),
                text5, new ImageView("/dev/grafika/images/msep.jpg"),
                text6
        );

        VBox vbHeader = new VBox();
        vbHeader.setMaxWidth(1000);
        vbHeader.getChildren().addAll(t1, t2);

        //PATH//////////////////////////////////////////////////////////////////////////////////////////////////////////
        Pane iconPath = new Pane();
        iconPath.setId("path");
        iconPath.setMinSize(16,13);

        Label text1_2 = new Label("strona główna");
        Label text2_2 = new Label("oferta");
        Label text3_2 = new Label("cennik");

        text1_2.setId("textGrayU11");
        text2_2.setId("textGrayU11");
        text3_2.setId("textGrayU11");

        HBox arrowDouble = new HBox();
        arrowDouble.setAlignment(Pos.CENTER);
        arrowDouble.setId("arrowDouble");
        arrowDouble.setMinSize(20,9);
        arrowDouble.setMaxSize(20,9);


        HBox arrowDouble2 = new HBox();
        arrowDouble2.setAlignment(Pos.CENTER);
        arrowDouble2.setId("arrowDouble");
        arrowDouble2.setMinSize(20,9);
        arrowDouble2.setMaxSize(20,9);


        HBox hbTextPath = new HBox();
        hbTextPath.setAlignment(Pos.CENTER);
        hbTextPath.getChildren().addAll( text1_2, arrowDouble, text2_2, arrowDouble2, text3_2);

        HBox hbPath = new HBox();
        hbPath.setMinWidth(1000);
        hbPath.setMaxWidth(1000);
        hbPath.setSpacing(12);
        hbPath.setPadding(new Insets(14,0,14,30));
        //hbPath.setStyle("-fx-background-color:#EEEEEE");

        hbPath.getChildren().addAll(iconPath, hbTextPath);

        //LEFT_MID//////////////////////////////////////////////////////////////////////////////////////////////////////
        /*
        HBox hbMng = new HBox();
        hbMng.getChildren().addAll(
                new ImageView("/dev/grafika/images/bg.jpg"),
                new ImageView("/dev/grafika/images/mng.jpg"),
                new ImageView("/dev/grafika/images/bg.jpg")                         TO DO
        );
        */

        Label textNav = new Label("NAWIGACJA");
        textNav.setId("textWhiteB");

        StackPane mng = new StackPane();
        mng.getChildren().addAll(new ImageView("/dev/grafika/images/mng.jpg"), textNav);

        VBox vbUpperBg = new VBox();
        vbUpperBg.setAlignment(Pos.TOP_CENTER);

        vbUpperBg.getChildren().addAll(new ImageView("/dev/grafika/images/m1.gif"), mng);
        for (int i = 0; i <= 100; i++)
            vbUpperBg.getChildren().add(new ImageView("/dev/grafika/images/m2.gif"));
        vbUpperBg.getChildren().add(new ImageView("/dev/grafika/images/m3.gif"));

        Label text1_3 = new Label("Strona główna");
        Label text2_3 = new Label("Oferta");
        Label text3_3 = new Label("Cennik");
        Label text4_3 = new Label("Sklep online");
        Label text5_3 = new Label("O nas");
        Label text6_3 = new Label("Kontakt");

        text1_3.setId("textRoyalBlue");
        text2_3.setId("textRoyalBlue");
        text3_3.setId("textRoyalBlue");
        text4_3.setId("textRoyalBlue");
        text5_3.setId("textRoyalBlue");
        text6_3.setId("textRoyalBlue");

        GridPane gpUpperText = new GridPane();
        gpUpperText.setAlignment(Pos.CENTER_LEFT);
        gpUpperText.setVgap(15);
        gpUpperText.setHgap(10);
        gpUpperText.setMaxSize(220,180);

        gpUpperText.add(new ImageView("/dev/grafika/images/arrow.jpg"),0,0,1,1);
        gpUpperText.add(text1_3,1,0,1,1);
        gpUpperText.add(new ImageView("/dev/grafika/images/arrow.jpg"),0,1,1,1);
        gpUpperText.add(text2_3,1,1,1,1);
        gpUpperText.add(new ImageView("/dev/grafika/images/arrow.jpg"),0,2,1,1);
        gpUpperText.add(text3_3,1,2,1,1);
        gpUpperText.add(new ImageView("/dev/grafika/images/arrow.jpg"),0,3,1,1);
        gpUpperText.add(text4_3,1,3,1,1);
        gpUpperText.add(new ImageView("/dev/grafika/images/arrow.jpg"),0,4,1,1);
        gpUpperText.add(text5_3,1,4,1,1);
        gpUpperText.add(new ImageView("/dev/grafika/images/arrow.jpg"),0,5,1,1);
        gpUpperText.add(text6_3,1,5,1,1);


        VBox vbUpperMain = new VBox();
        vbUpperMain.setPadding(new Insets(72,0,0,20));
        vbUpperMain.getChildren().addAll(gpUpperText);

        StackPane spUpper = new StackPane();
        spUpper.setAlignment(Pos.CENTER_LEFT);
        spUpper.getChildren().addAll(vbUpperBg, vbUpperMain);

        VBox vbLowerBg = new VBox();
        vbLowerBg.setAlignment(Pos.TOP_CENTER);

        Label textSz = new Label("Szablon zgodny z XHTML");
        textSz.setId("textWhiteB");

        StackPane mng2 = new StackPane();
        mng2.getChildren().addAll(new ImageView("/dev/grafika/images/mng.jpg"), textSz);

        vbLowerBg.getChildren().addAll(new ImageView("/dev/grafika/images/m1.gif"), mng2);
        for (int i = 0; i <= 18; i++)
            vbLowerBg.getChildren().add(new ImageView("/dev/grafika/images/m2.gif"));

        vbLowerBg.getChildren().add(new ImageView("/dev/grafika/images/m3.gif"));

        Label textXHTML = new Label("Valid XHTML 1.0 Transitional");
        textXHTML.setId("textBlue11");

        HBox vbLowerMain = new HBox();
        vbLowerMain.setAlignment(Pos.BOTTOM_CENTER);
        vbLowerMain.setPadding(new Insets(0,0,36,0));
                                                                                                    //miejsce na ikonke
        vbLowerMain.getChildren().addAll(textXHTML);

        StackPane spLower = new StackPane();
        spLower.getChildren().addAll(vbLowerBg, vbLowerMain);

        VBox vbLeftMid = new VBox();
        vbLeftMid.getChildren().addAll(spUpper, spLower);

        //RIGHT_MID/////////////////////////////////////////////////////////////////////////////////////////////////////
        VBox vbRightBg = new VBox();
        vbRightBg.setAlignment(Pos.TOP_CENTER);
        vbRightBg.getChildren().add(new ImageView("/dev/grafika/images/s1.gif"));
        for (int i = 0; i <= 420; i++)
            vbRightBg.getChildren().add(new ImageView("/dev/grafika/images/s2.gif"));

        vbRightBg.getChildren().add(new ImageView("/dev/grafika/images/s3.gif"));



        Label textRight1 = new Label("Nagłówek podstrony");
        textRight1.setId("textRight");

        HBox hbTextR1 = new HBox();
        hbTextR1.setAlignment(Pos.CENTER_LEFT);
        hbTextR1.setPadding(new Insets(0,0,12,90));
        hbTextR1.getChildren().add(textRight1);

        StackPane spRightHeader = new StackPane();
        spRightHeader.getChildren().addAll(new ImageView("/dev/grafika/images/ngbg.jpg"), hbTextR1);

        Label textRight3 = new Label("Przykładowe zdjęcia");
        textRight3.setId("textRight");

        HBox hbTextR3 = new HBox();
        hbTextR3.setAlignment(Pos.CENTER_LEFT);
        hbTextR3.setPadding(new Insets(0,0,15,90));
        hbTextR3.getChildren().add(textRight3);

        StackPane spRightExample = new StackPane();
        spRightExample.getChildren().addAll(new ImageView("/dev/grafika/images/ngbg.jpg"), hbTextR3);


        Label textRight2 = new Label("Donec hendrerit convallis felis, mollis volutpat enim semper non. Ut" +
                " lacinia est in odio posuere non ultrices dui adipiscing. \nEtiam eleifend tortor ac lorem tempor" +
                " eget porta est imperdiet. Quisque a accumsan elit. Nam ut orci risus. Curabitur id\npellentesque" +
                " mauris. Sed nulla mauris, imperdiet et sodales at, facilisis ac mauris. Lorem ipsum dolor sit" +
                " amet, consectetur\nadipiscing elit. Mauris semper, felis non volutpat pharetra, sem libero" +
                " tincidunt orci, id pulvinar tortor eros quis orci. In\nullamcorper nisl et mauris laoreet egestas." +
                " Morbi venenatis venenatis nisi, et facilisis leo pulvinar in. Nullam consectetur\nsagittis lorem."
        );

        Label textRight4 = new Label("Sed condimentum imperdiet est, a malesuada diam laoreet lacinia. Aenean" +
                " hendrerit ornare nisl quis lacinia. Integer\niaculis bibendum neque nec tristique. Class aptent" +
                " taciti sociosqu ad litora torquent per conubia nostra, per inceptos\nhimenaeos. Suspendisse cursus" +
                " iaculis elit eu suscipit. Donec enim lorem, imperdiet sed lacinia dictum, pulvinar at sem.\n" +
                "Curabitur nisi nisl, imperdiet non elementum sed, auctor cursus mauris."
        );


        HBox images = new HBox();
        images.setAlignment(Pos.BOTTOM_CENTER);
        images.setSpacing(20);
        images.setPadding(new Insets(0,0,0,0));

        images.getChildren().addAll(
                new ImageView("/dev/grafika/img1.jpg"),
                new ImageView("/dev/grafika/img2.jpg"),
                new ImageView("/dev/grafika/img3.jpg"),
                new ImageView("/dev/grafika/img4.jpg")
        );


        VBox vbRightBox = new VBox();
        vbRightBox.setAlignment(Pos.CENTER);
        vbRightBox.setSpacing(18);

        vbRightBox.getChildren().addAll(spRightHeader, textRight2, spRightExample, images, textRight4);

        StackPane spRightMid = new StackPane();
        spRightMid.getChildren().addAll(vbRightBg, vbRightBox);

        HBox hbMiddle = new HBox();
        hbMiddle.setAlignment(Pos.CENTER_LEFT);
        hbMiddle.setSpacing(7);
        hbMiddle.setMinSize(1000,465);
        hbMiddle.getChildren().addAll(vbLeftMid, spRightMid);
        //hbMiddle.setStyle("-fx-background-color:#005af4;");

        //FOOT//////////////////////////////////////////////////////////////////////////////////////////////////////////
        Pane d = new Pane();
        d.setId("d");
        d.setMinSize(1000,81);

        //MAIN
        VBox vbMain = new VBox();
        vbMain.setStyle("-fx-background-color:#EEEEEE");

        vbMain.getChildren().addAll(vbHeader, hbPath, hbMiddle, d);

        Scene scene = new Scene(vbMain,1000,880);
        scene.getStylesheets().addAll(this.getClass().getResource("GoodStyle.css").toExternalForm());

        window = primaryStage;
        window.setScene(scene);
        window.show();
    }
}