package pl.krzysztofurban.springinventoryservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.krzysztofurban.springinventoryservice.model.Inventory;
import pl.krzysztofurban.springinventoryservice.repository.InventoryRepository;

import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    public Inventory getInventory(Long productId) {
        log.info("Inventory lookup request for productId: {}", productId);
        Optional<Inventory> inventory = inventoryRepository.findById(productId);

        return inventory.orElse(Inventory.builder()
                .inventoryId(1L)
                .productId(productId)
                .price(200D)
                .quantity(2D)
                .build());
    }
}
