package com.workoutplanner.workout_planner.main.home;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.text.Text;


public class HomePage {
    public HomePage() {}

    public Scene createHomePage(){
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);

        Text Title = new Text("Workout Planner");
        Title.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(Title, 0, 0, 2, 1);
        return new  Scene(grid, 300, 275);
    }
}
