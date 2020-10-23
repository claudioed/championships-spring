package tech.claudioed.matches;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/championships")
public class ChampionshipsResource {

    @GetMapping("/{id}")
    public ResponseEntity<Championship> championships(@PathVariable("id")String id){
        final var championship = Championship.builder().name("UEFA Champions League").title("Champions League").country("World").build();
        return ResponseEntity.ok(championship);
    }

}
