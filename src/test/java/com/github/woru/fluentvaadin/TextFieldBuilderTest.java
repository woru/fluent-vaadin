package com.github.woru.fluentvaadin;

import com.vaadin.ui.TextField;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class TextFieldBuilderTest {
    @Test
    public void shouldSetRequired() throws Exception {
        TextField textField = TextFieldBuilder.textField().required().build();

        assertThat(textField.isRequired()).isEqualTo(true);
    }

    @Test
    public void shouldSetReadOnly() throws Exception {
        TextField textField = TextFieldBuilder.textField().readOnly().build();

        assertThat(textField.isReadOnly()).isEqualTo(true);
    }

    @Test
    public void shouldSetValue() throws Exception {
        TextField textField = TextFieldBuilder.textField().value("1").build();

        assertThat(textField.getValue()).isEqualTo("1");
    }

    @Test
    public void shouldSetCaptionInStaticFactory() throws Exception {
        TextField textField = TextFieldBuilder.textField("caption").build();

        assertThat(textField.getCaption()).isEqualTo("caption");
    }

    @Test
    public void shouldSetNullRepresentation() throws Exception {
        TextField textField = TextFieldBuilder.textField().nullRepresentation("null").build();

        assertThat(textField.getNullRepresentation()).isEqualTo("null");
    }

    @Test
    public void shouldSetMaxLength() throws Exception {
        TextField textField = TextFieldBuilder.textField().maxLength(3).build();

        assertThat(textField.getMaxLength()).isEqualTo(3);
    }

    @Test
    public void shouldSetInputPrompt() throws Exception {
        TextField textField = TextFieldBuilder.textField().inputPrompt("Your name").build();

        assertThat(textField.getInputPrompt()).isEqualTo("Your name");
    }

}
