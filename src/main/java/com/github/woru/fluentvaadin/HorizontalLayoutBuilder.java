package com.github.woru.fluentvaadin;

import com.vaadin.ui.HorizontalLayout;

/**
 * Builder for {@link com.vaadin.ui.HorizontalLayout}
 */
public class HorizontalLayoutBuilder extends AbstractOrderedLayoutBuilder<HorizontalLayoutBuilder, HorizontalLayout> {

    public HorizontalLayoutBuilder() {
        super(HorizontalLayoutBuilder.class, new HorizontalLayout());
    }

    public static HorizontalLayoutBuilder horizontalLayout() {
        return new HorizontalLayoutBuilder();
    }
}
