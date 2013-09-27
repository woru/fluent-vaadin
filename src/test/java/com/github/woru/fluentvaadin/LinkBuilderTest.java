package com.github.woru.fluentvaadin;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Link;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class LinkBuilderTest {
    @Test
    public void shouldCreateLinkWithCaption() throws Exception {
        Link link = LinkBuilder.link()
                .caption("caption").build();

        assertThat(link.getCaption()).isEqualTo("caption");
    }

    @Test
    public void shouldCreateLinkWithResource() throws Exception {
        //given
        ExternalResource resource = new ExternalResource("url");

        //when
        Link link = LinkBuilder.link()
                .resource(resource).build();

        //then
        assertThat(link.getResource()).isEqualTo(resource);
    }
    @Test
    public void shouldCreateLinkWithTargetName() throws Exception {
        Link link = LinkBuilder.link()
                .targetName("targetName").build();

        assertThat(link.getTargetName()).isEqualTo("targetName");
    }


}
