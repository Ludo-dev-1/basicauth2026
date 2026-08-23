package co.simplon.basicauth.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import co.simplon.basicauth.entity.TodoEntity;
import co.simplon.basicauth.repository.TodoRepository;

@Component
public class DataInitializer implements CommandLineRunner {

    private final TodoRepository todoRepository;

    public DataInitializer(TodoRepository todoRepositoryInjected) {
        this.todoRepository = todoRepositoryInjected;
    }

    @Override
    public void run(String... args) throws Exception {
        this.todoRepository.save(new TodoEntity("Clone the project", true));
        this.todoRepository.save(new TodoEntity("Test the API", true));
        this.todoRepository.save(new TodoEntity("Add basic authentication"));
    }

}
