module com.example.actividad14 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.example.actividad14 to javafx.fxml;
    exports com.example.actividad14;
}