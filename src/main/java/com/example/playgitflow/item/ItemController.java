package com.example.playgitflow.item;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {
	public List<ItemDto> getItems() {
		return Collections.emptyList();
	}
}
