package lt.eimantas.todo.controller;

import lt.eimantas.todo.model.ItemDTO;
import lt.eimantas.todo.view.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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
    public void addItem(@RequestBody ItemDTO item) {
        mainService.save(item);
    }

    @PutMapping("/edit")
    public void editItem(@RequestBody ItemDTO item) {
        mainService.save(item);
    }

    @DeleteMapping("/delete")
    public void deleteItem(@RequestParam Integer id) {
        mainService.deleteById(id);
    }
}