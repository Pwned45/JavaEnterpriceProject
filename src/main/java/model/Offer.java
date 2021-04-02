package model;

import java.sql.Time;
import java.util.UUID;

public class Offer {
    private Aircraft aircraft;
    private OfferType type;
    private Time plainedTime;
    private Time realisticTime;

    public Offer(Aircraft aircraft, OfferType type, Time plainedTime) {
        this.aircraft = aircraft;
        this.type = type;
        this.plainedTime = plainedTime;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public OfferType getType() {
        return type;
    }

    public void setType(OfferType type) {
        this.type = type;
    }

    public Time getPlainedTime() {
        return plainedTime;
    }

    public void setPlainedTime(Time plainedTime) {
        this.plainedTime = plainedTime;
    }

    public Time getRealisticTime() {
        return realisticTime;
    }

    public void setRealisticTime(Time realisticTime) {
        this.realisticTime = realisticTime;
    }

    private UUID uuid = UUID.randomUUID();

}
