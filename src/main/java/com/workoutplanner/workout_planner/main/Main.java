package com.workoutplanner.workout_planner.main;

import com.workoutplanner.workout_planner.main.home.HomePage;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage mainStage) throws Exception {
        //Create Pages
        HomePage homePage= new HomePage();

        // Display Application
        mainStage.setScene(homePage.createHomePage());
        mainStage.show();
    }
}
