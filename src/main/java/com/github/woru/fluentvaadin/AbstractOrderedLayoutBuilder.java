package com.github.woru.fluentvaadin;

import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.AbstractOrderedLayout;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Component;

/**
 * Base class for all Layouts derived from AbstractOrderedLayout.
 */
public class AbstractOrderedLayoutBuilder<S extends AbstractOrderedLayoutBuilder, C extends AbstractOrderedLayout> extends ComponentBuilder<S, C> {

    protected AbstractOrderedLayoutBuilder(Class<S> selfType, C component) {
        super(selfType, component);
    }

    public S addComponent(Component component) {
        this.component.addComponent(component);
        return myself;
    }

    public S addComponent(Component component, Alignment alignment) {
        return addComponent(alignment, null, component);
    }

    public S addComponent(ExpandRatio ratio, Component component) {
        this.component.addComponent(component);
        this.component.setExpandRatio(component, ratio.getExpandRatio());
        return addComponent(null, ratio, component);
    }

    public S addComponent(Alignment alignment, ExpandRatio ratio, Component component) {
        this.component.addComponent(component);
        if (ratio != null) {
            this.component.setExpandRatio(component, ratio.getExpandRatio());
        }
        if (alignment != null) {
            this.component.setComponentAlignment(component, alignment);
        }
        return myself;
    }

    public S addComponent(ComponentBuilder<?, ?> componentBuilder) {
        return addComponent(componentBuilder.build());
    }

    public S addComponent(Alignment alignment, ComponentBuilder<?, ?> componentBuilder) {
        Component component = componentBuilder.build();
        return addComponent(alignment, null, component);
    }

    public S addComponent(ExpandRatio ratio, ComponentBuilder<?, ?> componentBuilder) {
        Component component = componentBuilder.build();
        return addComponent(null, ratio, component);
    }

    public S addComponent(Alignment alignment, ExpandRatio ratio, ComponentBuilder<?, ?> componentBuilder) {
        Component component = componentBuilder.build();
        return addComponent(alignment, ratio, component);
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

    /**
     * Specifies margins.
     * <pre>   {@code horizontalLayout()
     * .with(margin().left().right())
     * .build();
     * }</pre>
     */
    public S with(MarginInfoBuilder marginInfoBuilder) {
        return margin(marginInfoBuilder.build());
    }
}


