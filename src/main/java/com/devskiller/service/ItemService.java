package com.devskiller.service;

import com.devskiller.dao.ItemRepository;
import com.devskiller.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    private final ItemRepository itemRepository;
    @Autowired
    ItemRepository repo;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<String> getTitlesWithAverageRatingLowerThan(Double rating) {
        //TODO
            List<Item>lista=itemRepository.findItemsWithAverageRatingLowerThan(rating);
            List<String>listaTitulos=new ArrayList<String>();
            for (int i = 0; i < lista.size(); i++) {
                listaTitulos.add(lista.get(i).getTitle());
            }
            return listaTitulos;
    }
}
