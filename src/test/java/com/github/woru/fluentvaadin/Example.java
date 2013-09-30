package com.github.woru.fluentvaadin;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;

import static com.github.woru.fluentvaadin.ButtonBuilder.button;
import static com.github.woru.fluentvaadin.HorizontalLayoutBuilder.horizontalLayout;
import static com.github.woru.fluentvaadin.LinkBuilder.link;
import static com.github.woru.fluentvaadin.MarginInfoBuilder.margin;
import static com.github.woru.fluentvaadin.TextFieldBuilder.textField;
import static com.github.woru.fluentvaadin.VerticalLayoutBuilder.verticalLayout;

public class Example {
    public static void main(String[] args) {
        HorizontalLayout horizontalLayout = horizontalLayout()
                .with(margin().left().right())
                .spacingEnabled()
                .sizeFull()
                .styleName("container")
                .addComponentWithExpandRatio(2.0f, verticalLayout()
                        .marginEnabled()
                        .addComponent(button("Click me"), Alignment.TOP_LEFT))
                .addComponent(link().resource(new ExternalResource("google.com")))
                .addComponent(textField("Name")
                        .inputPrompt("Your name")
                        .nullRepresentation("")
                        .maxLength(20)
                        .value(""))
                .addComponent(textField("Disabled input").disabled())
                .build();
    }
}
