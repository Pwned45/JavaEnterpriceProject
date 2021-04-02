package model;

import java.util.UUID;

public class Aircraft {
    private String name;
    private Integer number;
    private StateAircraft state;
    private AircraftType type;

    private UUID uuid = UUID.randomUUID();

    public Aircraft(String name, Integer number, StateAircraft state, AircraftType type) {
        this.name = name;
        this.number = number;
        this.state = state;
        this.type = type;
    }
    public Aircraft() {
    }
    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public StateAircraft getState() {
        return state;
    }

    public void setState(StateAircraft state) {
        this.state = state;
    }

    public AircraftType getType() {
        return type;
    }

    public void setType(AircraftType type) {
        this.type = type;
    }
}
