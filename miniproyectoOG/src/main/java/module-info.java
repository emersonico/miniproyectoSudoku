module com.example.miniproyecto {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens com.example.miniproyecto.Controller to javafx.fxml;
    opens com.example.miniproyecto to javafx.fxml;
    exports com.example.miniproyecto.Main;
    opens com.example.miniproyecto.Main to javafx.fxml;
}