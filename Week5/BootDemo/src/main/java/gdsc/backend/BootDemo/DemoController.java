package gdsc.backend.BootDemo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/demo")
public class DemoController {
    private final DemoService demoService;

    @GetMapping("/demoEntities")
    public ResponseEntity<List<DemoDto>> getDemoEntities() {
        return ResponseEntity.ok().body(demoService.getDemoEntities());
    }

    @PostMapping("/demoEntities")
    public void getDemoEntities(@RequestBody DemoDto demoDto) {
        demoService.addDemoEntity(demoDto);
    }

    @GetMapping("/demoEntities/{id}")
    public ResponseEntity<DemoDto> getDemoEntity(@PathVariable Long id) {
        return ResponseEntity.ok().body(demoService.getDemoEntity(id));
    }
}
