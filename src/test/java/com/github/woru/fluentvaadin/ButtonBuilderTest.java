package com.github.woru.fluentvaadin;

import com.vaadin.server.Sizeable;
import com.vaadin.ui.Button;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class ButtonBuilderTest {
    @Test
    public void shouldBuildButtonWithCaption() throws Exception {
        Button button = ButtonBuilder.button().caption("caption").build();

        assertThat(button.getCaption()).isEqualTo("caption");
    }

    @Test
    public void shouldSetStyle() throws Exception {
        Button button = ButtonBuilder.button().styleName("style").build();

        assertThat(button.getStyleName()).isEqualTo("style");
    }

    @Test
    public void shouldSetSizeFull() throws Exception {
        Button button = ButtonBuilder.button().sizeFull().build();

        assertThat(button.getWidth()).isEqualTo(100);
        assertThat(button.getWidthUnits()).isEqualTo(Sizeable.Unit.PERCENTAGE);
    }

    @Test
    public void shouldSetSizeUndefined() throws Exception {
        Button button = ButtonBuilder.button().sizeUndefined().build();

        assertThat(button.getWidth()).isEqualTo(-1);
        assertThat(button.getWidthUnits()).isEqualTo(Sizeable.Unit.PIXELS);

        assertThat(button.getHeight()).isEqualTo(-1);
        assertThat(button.getHeightUnits()).isEqualTo(Sizeable.Unit.PIXELS);
    }

    @Test
    public void shouldSetWidth() throws Exception {
        Button button = ButtonBuilder.button().width("100%").build();

        assertThat(button.getWidth()).isEqualTo(100);
        assertThat(button.getWidthUnits()).isEqualTo(Sizeable.Unit.PERCENTAGE);
    }

    @Test
    public void shouldSetHeight() throws Exception {
        Button button = ButtonBuilder.button().height("100%").build();

        assertThat(button.getHeight()).isEqualTo(100);
        assertThat(button.getHeightUnits()).isEqualTo(Sizeable.Unit.PERCENTAGE);
    }
}
