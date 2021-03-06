package com.keuin.minefest.core.event;

import com.keuin.minefest.core.objects.EventObject;

import java.util.UUID;

public interface Event {
    /**
     * Get event type.
     *
     * @return the type.
     */
    EventType getType();

    /**
     * Get the subject of this event.
     *
     * @return the subject (player) 's UUID.
     */
    UUID getSubject();

    /**
     * Get the object of this event.
     *
     * @return the object, such as minecraft::stone, or a player's uuid.
     */
    EventObject getObject();

}
