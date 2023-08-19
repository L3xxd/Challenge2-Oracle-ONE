module com.l3xxd.conversormulti {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.datatransfer;
    requires java.desktop;

    opens com.l3xxd.conversormulti to javafx.fxml;
    exports com.l3xxd.conversormulti;

}