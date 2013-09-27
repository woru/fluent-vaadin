package com.github.woru.fluentvaadin;

import com.vaadin.ui.Button;
import com.vaadin.ui.VerticalLayout;
import org.junit.Test;

import static com.github.woru.fluentvaadin.VerticalLayoutBuilder.verticalLayout;
import static org.fest.assertions.Assertions.assertThat;

public class VerticalLayoutBuilderTest {

    @Test
    public void shouldAddComponent() throws Exception {
        //given
        Button button = new Button();

        //when
        VerticalLayout verticalLayout = verticalLayout()
                .addComponent(button)
                .build();

        //then
        assertThat(verticalLayout.getComponent(0)).isEqualTo(button);
    }
}
