package com.prep.springsetup.kickstart.data;

import com.prep.springsetup.kickstart.model.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
}
