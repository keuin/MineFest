package com.keuin.minefest.core.dispatch;

import com.keuin.minefest.core.event.Event;

/**
 * All mixins or hacked-in event hooks should extend this and use its protected method to dispatch event.
 */
public abstract class AbstractEventDriver {
    /**
     * Called by the events hacked into the Minecraft codebase (e.g. using Fabric Mixin or Spigot Events).
     *
     * @param event the event to be dispatched.
     */
    protected void dispatchEvent(Event event) {
        EventDispatcher.INSTANCE.dispatchEvent(event);
    }
}
