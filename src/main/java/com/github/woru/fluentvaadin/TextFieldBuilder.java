package com.github.woru.fluentvaadin;

import com.vaadin.ui.TextField;

public class TextFieldBuilder extends AbstractFieldBuilder<TextFieldBuilder, TextField, String> {

    public TextFieldBuilder() {
        super(TextFieldBuilder.class, new TextField());
    }

    public static TextFieldBuilder textField() {
        return new TextFieldBuilder();
    }

    public static TextFieldBuilder textField(String caption) {
        return new TextFieldBuilder().caption(caption);
    }

    public TextFieldBuilder nullRepresentation(String nullRepresentation) {
        component.setNullRepresentation(nullRepresentation);
        return myself;
    }

    public TextFieldBuilder inputPrompt(String inputPrompt) {
        component.setInputPrompt(inputPrompt);
        return myself;
    }

    public TextFieldBuilder maxLength(int maxLength) {
        component.setMaxLength(maxLength);
        return myself;
    }
}