package com.github.woru.fluentvaadin;

import com.vaadin.ui.NativeSelect;

public class NativeSelectBuilder extends AbstractFieldBuilder<NativeSelectBuilder, NativeSelect, Object> {

    public NativeSelectBuilder() {
        super(NativeSelectBuilder.class, new NativeSelect());
    }

    public static NativeSelectBuilder nativeSelect() {
        return new NativeSelectBuilder();
    }

    public static NativeSelectBuilder nativeSelect(String caption) {
        return nativeSelect().caption(caption);
    }
}
