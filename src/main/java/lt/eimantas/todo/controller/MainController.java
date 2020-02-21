package lt.eimantas.todo.controller;

import lt.eimantas.todo.model.ItemDTO;
import lt.eimantas.todo.view.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/todo")
public class MainController {

    @Autowired
    MainService mainService;

    @GetMapping("/all")
    public Iterable<ItemDTO> getAll() {
        return mainService.findAll();
    }

    @PostMapping("/add")
    public @ResponseBody ItemDTO addItem(@RequestBody ItemDTO item) {
        item.setIsDone(false);
        item = mainService.save(item);
        return item;
    }

    @PutMapping("/edit")
    public @ResponseBody ItemDTO editItem(@RequestBody ItemDTO item) {

        item = mainService.save(item);
        return item;
    }

    @DeleteMapping("/delete")
    public @ResponseBody Optional<ItemDTO> deleteItem(@RequestParam Integer id) {
        Optional<ItemDTO> result = mainService.findById(id);
        mainService.deleteById(id);
        return result;
    }
}