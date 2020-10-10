package sample;

import config.Configuration;
import config.Startup;
import model.FXConsole;
import iface.IConfiguration;
import iface.IFXConsole;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class FXCLITest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXCLITest app = new FXCLITest();

        IFXConsole console = new FXConsole();
        console.setOnMessageReceivedHandler(
                new Startup(app.configure(new Configuration(console)))::run
        );

        primaryStage.setScene(new Scene(console.getPane()));
        primaryStage.setWidth(650);
        primaryStage.setHeight(475);
        primaryStage.show();
    }

    public IConfiguration configure(IConfiguration config) {
        config.addControllers(new ArrayList<>() {{
            add(new TestController());
        }});
        return config;
    }

}
