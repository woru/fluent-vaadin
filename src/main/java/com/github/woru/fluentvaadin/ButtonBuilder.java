package com.github.woru.fluentvaadin;

import com.vaadin.ui.Button;

public class ButtonBuilder extends ComponentBuilder<ButtonBuilder, Button> {

    public ButtonBuilder() {
        super(ButtonBuilder.class, new Button());
    }

    public static ButtonBuilder button() {
        return new ButtonBuilder();
    }

    public static ButtonBuilder button(String caption) {
        return new ButtonBuilder().caption(caption);
    }
}
