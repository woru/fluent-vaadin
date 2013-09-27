package com.github.woru.fluentvaadin;

import com.vaadin.ui.VerticalLayout;

public class VerticalLayoutBuilder extends AbstractOrderedLayoutBuilder<VerticalLayoutBuilder, VerticalLayout> {

    public VerticalLayoutBuilder() {
        super(VerticalLayoutBuilder.class, new VerticalLayout());
    }

    public static VerticalLayoutBuilder verticalLayout() {
        return new VerticalLayoutBuilder();
    }
}
