package com.github.woru.fluentvaadin;

import com.vaadin.ui.Component;

public abstract class ComponentBuilder<S, C extends Component> {
    protected final S myself;
    protected final C component;

    protected ComponentBuilder(Class<S> selfType, C component) {
        this.myself = selfType.cast(this);
        this.component = component;
    }

    public S caption(String caption) {
        component.setCaption(caption);
        return myself;
    }

    public S styleName(String styleName) {
        component.addStyleName(styleName);
        return myself;
    }

    public S sizeUndefined() {
        component.setSizeUndefined();
        return myself;
    }

    public S sizeFull() {
        component.setSizeFull();
        return myself;
    }

    public S width(String width) {
        component.setWidth(width);
        return myself;
    }

    public S height(String height) {
        component.setHeight(height);
        return myself;
    }

    public S disabled() {
        component.setEnabled(false);
        return myself;
    }

    public S readOnly() {
        component.setReadOnly(true);
        return myself;
    }

    public S invisible() {
        component.setVisible(false);
        return myself;
    }

    public C build() {
        return component;
    }

}
