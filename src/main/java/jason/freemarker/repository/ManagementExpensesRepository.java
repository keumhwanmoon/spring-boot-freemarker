package jason.freemarker.repository;

import jason.freemarker.entity.ManagementExpenses;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Jason on 2016-08-30.
 */
public interface ManagementExpensesRepository extends JpaRepository<ManagementExpenses, Long> {
}
