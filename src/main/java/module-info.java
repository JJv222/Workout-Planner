module com.workoutplanner.workout_planner {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.workoutplanner.workout_planner to javafx.fxml;
    exports com.workoutplanner.workout_planner;
}