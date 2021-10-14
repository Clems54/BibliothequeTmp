package com.miage.bibliotheque.boundary;

import com.miage.bibliotheque.control.GestionOeuvre;
import com.miage.bibliotheque.utilities.dto.OeuvreDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@CrossOrigin
@RestController
@RequestMapping("/api/oeuvres")
@Transactional(readOnly = true)
public class IHMOeuvre {

    private final GestionOeuvre control;

    public IHMOeuvre(final GestionOeuvre control) {
        this.control = control;
    }

    @GetMapping
    public ResponseEntity<List<OeuvreDTO>> getAll() {
        return ResponseEntity.ok(control.getAll().stream().map(OeuvreDTO::fromObj).collect(Collectors.toList()));
    }

    @PostMapping
    @Transactional(readOnly = false)
    public ResponseEntity<?> create(@RequestBody final OeuvreDTO dto) {
        control.create(dto.toObj());
        final URI location = linkTo(IHMOeuvre.class).slash(dto.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping("/{id}")
    @Transactional(readOnly = false)
    public ResponseEntity<?> update(@PathVariable final String id, @RequestBody final OeuvreDTO dto) {
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
    public ResponseEntity<List<OeuvreDTO>> search(@RequestParam("name") final String name) {
        return ResponseEntity.ok(control.search(name).stream().map(OeuvreDTO::fromObj).collect(Collectors.toList()));
    }
}
