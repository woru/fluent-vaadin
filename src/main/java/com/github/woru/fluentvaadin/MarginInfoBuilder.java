package com.github.woru.fluentvaadin;

import com.vaadin.shared.ui.MarginInfo;

public class MarginInfoBuilder {
    private boolean top;
    private boolean right;
    private boolean bottom;
    private boolean left;

    public MarginInfoBuilder top() {
        this.top = true;
        return this;
    }

    public MarginInfoBuilder right() {
        this.right = true;
        return this;
    }

    public MarginInfoBuilder bottom() {
        this.bottom = true;
        return this;
    }

    public MarginInfoBuilder left() {
        this.left = true;
        return this;
    }

    public MarginInfo build() {
        return new MarginInfo(top, right, bottom, left);
    }

    public static MarginInfoBuilder margin() {
        return new MarginInfoBuilder();
    }
}
