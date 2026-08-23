package co.simplon.basicauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.basicauth.entity.TodoEntity;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, String> {

}
