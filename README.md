fluent-vaadin
=============

Set of fluent builders for vaadin layouts and components
```java
 HorizontalLayout horizontalLayout = horizontalLayout()
                .with(margin().left().right())
                .spacingEnabled()
                .sizeFull()
                .styleName("container")
                .addComponent(expandRatio(2.0f), verticalLayout()
                        .marginEnabled()
                        .addComponent(Alignment.TOP_LEFT, button("Click me")))
                .addComponent(link().resource(new ExternalResource("google.com")))
                .addComponent(textField("Name")
                        .inputPrompt("Your name")
                        .nullRepresentation("")
                        .maxLength(20)
                        .value(""))
                .addComponent(textField("Disabled input").disabled())
                .build();
```

