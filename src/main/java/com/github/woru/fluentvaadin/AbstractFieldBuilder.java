package com.github.woru.fluentvaadin;

import com.vaadin.ui.AbstractField;

/**
 * Base class for all FieldBuilders. You can extend it to create a new builder for an AbstractField derivative.
 */
public class AbstractFieldBuilder<S extends AbstractFieldBuilder, C extends AbstractField<T>, T> extends ComponentBuilder<S, C> {
    protected AbstractFieldBuilder(Class<S> selfType, C component) {
        super(selfType, component);
    }

    public S required() {
        component.setRequired(true);
        return myself;
    }

    public S value(T value) {
        component.setValue(value);
        return myself;
    }
}
