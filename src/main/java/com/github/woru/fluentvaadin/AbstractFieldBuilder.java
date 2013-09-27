package com.github.woru.fluentvaadin;

import com.vaadin.ui.AbstractField;

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
