package pl.krzysztofurban.springinventoryservice.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.krzysztofurban.springinventoryservice.model.Inventory;
import pl.krzysztofurban.springinventoryservice.service.InventoryService;

@Slf4j
@RestController
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping("/api/inventory/{productId}")
    public Inventory getInventoryForProduct(@PathVariable("productId") Long productId) {
        log.info("Inventory request for product {}", productId);
        Inventory inventory = inventoryService.getInventory(productId);
        log.info("Found inventory: {}", inventory);
        return inventory;
    }
}
