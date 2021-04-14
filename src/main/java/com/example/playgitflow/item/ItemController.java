package com.example.playgitflow.item;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {
	public Collection<ItemDto> getItems() {
		final ItemDto fIrstItem = new ItemDto(1L, "FIrst item");
		return List.of(fIrstItem);
	}
}
