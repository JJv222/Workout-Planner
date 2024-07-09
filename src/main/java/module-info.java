module com.workoutplanner.workout_planner {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.workoutplanner.workout_planner.main.home to javafx.fxml;
    exports com.workoutplanner.workout_planner.main.home;
    exports com.workoutplanner.workout_planner.main;
    opens com.workoutplanner.workout_planner.main to javafx.fxml;
}