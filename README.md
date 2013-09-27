fluent-vaadin
=============

Set of fluent builders for vaadin layouts and components
```java
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
```

