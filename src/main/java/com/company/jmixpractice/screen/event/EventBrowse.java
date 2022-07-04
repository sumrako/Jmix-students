package com.company.jmixpractice.screen.event;

import io.jmix.ui.screen.*;
import com.company.jmixpractice.entity.Event;

@UiController("Event.browse")
@UiDescriptor("event-browse.xml")
@LookupComponent("eventsTable")
public class EventBrowse extends StandardLookup<Event> {
}