package com.github.woru.fluentvaadin;

import com.vaadin.ui.NativeSelect;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class NativeSelectBuilderTest {
    @Test
    public void shouldSetRequired() throws Exception {
        NativeSelect nativeSelect = NativeSelectBuilder.nativeSelect().required().build();

        assertThat(nativeSelect.isRequired()).isEqualTo(true);
    }

    @Test
    public void shouldSetCaptionInStaticFactory() throws Exception {
        NativeSelect nativeSelect = NativeSelectBuilder.nativeSelect("caption").build();

        assertThat(nativeSelect.getCaption()).isEqualTo("caption");
    }

    @Test
    public void shouldDisableComponent() throws Exception {
        NativeSelect nativeSelect = NativeSelectBuilder.nativeSelect().disabled().build();

        assertThat(nativeSelect.isEnabled()).isFalse();
    }

    @Test
    public void shouldSetVisibility() throws Exception {
        NativeSelect nativeSelect = NativeSelectBuilder.nativeSelect().invisible().build();

        assertThat(nativeSelect.isVisible()).isFalse();
    }
}
