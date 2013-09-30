package com.github.woru.fluentvaadin;

import com.vaadin.server.Resource;
import com.vaadin.ui.Link;

/**
 * Builder for {@link com.vaadin.ui.Link}
 */
public class LinkBuilder extends ComponentBuilder<LinkBuilder, Link> {

    public LinkBuilder() {
        super(LinkBuilder.class, new Link());
    }

    public static LinkBuilder link() {
        return new LinkBuilder();
    }

    public LinkBuilder resource(Resource resource) {
        component.setResource(resource);
        return myself;
    }

    public LinkBuilder targetName(String targetName) {
        component.setTargetName(targetName);
        return myself;
    }
}