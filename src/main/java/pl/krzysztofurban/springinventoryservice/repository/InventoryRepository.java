package pl.krzysztofurban.springinventoryservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.krzysztofurban.springinventoryservice.model.Inventory;

@Repository
public interface InventoryRepository extends CrudRepository<Inventory, Long> {
}
