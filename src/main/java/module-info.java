module me.huypham {
    requires javafx.controls;
    requires javafx.fxml;

    opens me.huypham to javafx.fxml;
    exports me.huypham;
}
