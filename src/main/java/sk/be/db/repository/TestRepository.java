package sk.be.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.be.db.entity.Test;

public interface TestRepository extends JpaRepository<Test, Integer> {
}
