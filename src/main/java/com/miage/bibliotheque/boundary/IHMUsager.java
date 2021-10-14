package com.miage.bibliotheque.boundary;

import com.miage.bibliotheque.control.GestionUsager;
import com.miage.bibliotheque.utilities.dto.UsagerDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@CrossOrigin
@RestController
@RequestMapping("/api/usagers")
@Transactional(readOnly = true)
public class IHMUsager {

    private final GestionUsager control;

    public IHMUsager(final GestionUsager control) {
        this.control = control;
    }

    @GetMapping
    public ResponseEntity<List<UsagerDTO>> getAll() {
        return ResponseEntity.ok(control.getAll().stream().map(UsagerDTO::fromObj).collect(Collectors.toList()));
    }

    @PostMapping
    @Transactional(readOnly = false)
    public ResponseEntity<?> create(@RequestBody final UsagerDTO dto) {
        control.create(dto.toObj());
        final URI location = linkTo(IHMUsager.class).slash(dto.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping("/{id}")
    @Transactional(readOnly = false)
    public ResponseEntity<?> update(@PathVariable final String id, @RequestBody final UsagerDTO dto) {
        control.update(id, dto.toObj());
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    @Transactional(readOnly = false)
    public ResponseEntity<?> delete(@PathVariable final String id) {
        control.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/search")
    public ResponseEntity<List<UsagerDTO>> search(@RequestParam("name") final String name) {
        return ResponseEntity.ok(control.search(name).stream().map(UsagerDTO::fromObj).collect(Collectors.toList()));
    }
}
