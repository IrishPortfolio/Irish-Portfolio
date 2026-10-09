package com.pokedex.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pokemon {
    @Id
    private Long id;
    private String name;
    private String type;
    private String ability;
    private String region;

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getAbility() { return ability; }
    public void setAbility(String ability) { this.ability = ability; }

    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }
}
