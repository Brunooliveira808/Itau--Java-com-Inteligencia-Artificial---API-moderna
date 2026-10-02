package dio.taskmanager.infraestructure.repository.http.request;

import dio.taskmanager.application.input.UpdateTaskInput;
import dio.taskmanager.domain.TaskStatus;

import java.util.Optional;

public record UpdateTaskRequest(
        Optional<String> title,
        Optional<String> descripttion,
        Optional<String> status
) {

    public UpdateTaskInput toInput() {
        return new UpdateTaskInput(title, descripttion, status.map(TaskStatus::valueOf));
    }
}
