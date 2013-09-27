package com.github.woru.fluentvaadin;

import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.AbstractOrderedLayout;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Component;

public class AbstractOrderedLayoutBuilder<S extends AbstractOrderedLayoutBuilder, C extends AbstractOrderedLayout> extends ComponentBuilder<S, C> {

    protected AbstractOrderedLayoutBuilder(Class<S> selfType, C component) {
        super(selfType, component);
    }

    public S addComponent(Component component) {
        this.component.addComponent(component);
        return myself;
    }

    public S addComponent(Component component, Alignment alignment) {
        this.component.addComponent(component);
        this.component.setComponentAlignment(component, alignment);
        return myself;
    }

    public S addComponentWithExpandRatio(float ratio, Component component) {
        this.component.addComponent(component);
        this.component.setExpandRatio(component, ratio);
        return myself;
    }

    public S addComponent(ComponentBuilder<?, ?> componentBuilder) {
        return addComponent(componentBuilder.build());
    }

    public S addComponent(ComponentBuilder<?, ?> componentBuilder, Alignment alignment) {
        Component component = componentBuilder.build();
        return addComponent(component, alignment);
    }

    public S addComponentWithExpandRatio(float ratio, ComponentBuilder<?, ?> componentBuilder) {
        Component component = componentBuilder.build();
        return addComponentWithExpandRatio(ratio, component);
    }

    public S spacingEnabled() {
        this.component.setSpacing(true);
        return myself;
    }

    public S marginEnabled() {
        this.component.setMargin(true);
        return myself;
    }

    public S margin(MarginInfoBuilder marginInfoBuilder) {
        return margin(marginInfoBuilder.build());
    }

    public S margin(MarginInfo marginInfo) {
        this.component.setMargin(marginInfo);
        return myself;
    }

    public S with(MarginInfoBuilder marginInfoBuilder) {
        return margin(marginInfoBuilder.build());
    }
}


