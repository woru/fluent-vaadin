package com.github.woru.fluentvaadin;

import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import org.junit.Test;

import static com.github.woru.fluentvaadin.ButtonBuilder.button;
import static com.github.woru.fluentvaadin.HorizontalLayoutBuilder.horizontalLayout;
import static com.github.woru.fluentvaadin.MarginInfoBuilder.margin;
import static org.fest.assertions.Assertions.assertThat;

public class HorizontalLayoutBuilderTest {
    @Test
    public void shouldAddComponent() throws Exception {
        //given
        Button button = new Button();

        //when
        HorizontalLayout horizontalLayout = horizontalLayout()
                .addComponent(button)
                .build();

        //then
        assertThat(horizontalLayout.getComponent(0)).isEqualTo(button);
    }

    @Test
    public void shouldAddComponentWithExpandRation() throws Exception {
        //given
        Button button = new Button();

        //when
        HorizontalLayout horizontalLayout = horizontalLayout()
                .addComponentWithExpandRatio(2.0f, button)
                .build();

        //then
        assertThat(horizontalLayout.getExpandRatio(button)).isEqualTo(2.0f);
    }

    @Test
    public void shouldAddComponentWithAlignment() throws Exception {
        //given
        Button button = new Button();

        //when
        HorizontalLayout horizontalLayout = horizontalLayout()
                .addComponent(button, Alignment.BOTTOM_CENTER)
                .build();

        //then
        assertThat(horizontalLayout.getComponentAlignment(button)).isEqualTo(Alignment.BOTTOM_CENTER);
    }

    @Test
    public void shouldAddComponentBuilder() throws Exception {
        //when
        HorizontalLayout horizontalLayout = horizontalLayout()
                .addComponent(button().caption("Click me"))
                .build();

        //then
        assertThat(horizontalLayout.getComponent(0)).isInstanceOf(Button.class);
        assertThat(horizontalLayout.getComponent(0).getCaption()).isEqualTo("Click me");
    }

    @Test
    public void shouldAddComponentBuilderWithExpandRation() throws Exception {
        //when
        HorizontalLayout horizontalLayout = horizontalLayout()
                .addComponentWithExpandRatio(2.0f, button())
                .build();

        //then
        assertThat(horizontalLayout.getExpandRatio(horizontalLayout.getComponent(0))).isEqualTo(2.0f);
    }

    @Test
    public void shouldAddComponentBuilderWithAlignment() throws Exception {
        //when
        HorizontalLayout horizontalLayout = horizontalLayout()
                .addComponent(button(), Alignment.BOTTOM_CENTER)
                .build();

        //then
        assertThat(horizontalLayout.getComponentAlignment(horizontalLayout.getComponent(0))).isEqualTo(Alignment.BOTTOM_CENTER);
    }

    @Test
    public void shouldEnableSpacing() throws Exception {
        //when
        HorizontalLayout horizontalLayout = horizontalLayout()
                .spacingEnabled()
                .build();

        //then
        assertThat(horizontalLayout.isSpacing()).isTrue();
    }

    @Test
    public void shouldEnableMargin() throws Exception {
        //when
        HorizontalLayout horizontalLayout = horizontalLayout()
                .marginEnabled()
                .build();

        //then
        assertThat(horizontalLayout.getMargin()).isEqualTo(new MarginInfo(true, true, true, true));
    }

    @Test
    public void shouldSetRightMargin() throws Exception {
        //when
        HorizontalLayout horizontalLayout = horizontalLayout()
                .margin(margin().right())
                .build();

        //then
        assertThat(horizontalLayout.getMargin()).isEqualTo(new MarginInfo(false, true, false, false));
    }

    @Test
    public void shouldSetMarginInWithMethod() throws Exception {
        //when
        HorizontalLayout horizontalLayout = horizontalLayout()
                .with(margin().left().right())
                .build();

        //then
        assertThat(horizontalLayout.getMargin()).isEqualTo(new MarginInfo(false, true, false, true));
    }

}
