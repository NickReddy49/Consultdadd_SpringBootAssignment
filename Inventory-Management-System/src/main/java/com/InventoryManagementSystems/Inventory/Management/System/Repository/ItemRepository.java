package com.InventoryManagementSystems.Inventory.Management.System.Repository;

import com.InventoryManagementSystems.Inventory.Management.System.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
}
