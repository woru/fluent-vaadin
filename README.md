fluent-vaadin
=============

Set of fluent builders for vaadin layouts and components.

#### A quick example:
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

#### A longer example.

Let's build a simple page with the following controls:

```java
        TextField filter1 = new TextField("Filter1");
        TextField filter2 = new TextField("Filter2");
        Button search = new Button("Search");
        Button clear = new Button("Clear");

        Table table = new Table();
        table.setSizeFull();

```
We want a simple layout with text fields on the left and buttons on the right side of a page.
Below them we want to have the table.
```
______________________
|filters       buttons|
|  ________________   |
| |                |  |
| |     table      |  |
| |________________|  |
 _____________________
```

The first snipped shows the traditional vaadin approach:
```java
        HorizontalLayout filters = new HorizontalLayout();
        filters.setSizeUndefined();
        filters.setSpacing(true);
        filters.addComponent(filter1);
        filters.addComponent(filter2);

        HorizontalLayout buttons = new HorizontalLayout();
        buttons.setSpacing(true);
        buttons.addComponent(search);
        buttons.addComponent(clear);

        HorizontalLayout filtersAndButtons = new HorizontalLayout();
        filtersAndButtons.setWidth("100%");
        filtersAndButtons.addComponent(filters);
        filtersAndButtons.setComponentAlignment(filters, Alignment.MIDDLE_LEFT);
        filtersAndButtons.setExpandRatio(filters, -1);
        filtersAndButtons.addComponent(buttons);
        filtersAndButtons.setComponentAlignment(buttons, Alignment.BOTTOM_RIGHT);

        VerticalLayout content = new VerticalLayout();
        content.setMargin(true);
        content.setSpacing(true);
        content.addComponent(filtersAndButtons);
        content.addComponent(table);

```

Here's exacty the same layout build with the fluent api:

```java
        VerticalLayout content = verticalLayout()
                .marginEnabled()
                .spacingEnabled()
                .addComponent(horizontalLayout()
                        .width("100%")
                        .addComponent(Alignment.MIDDLE_LEFT, expandRatio(-1), horizontalLayout()
                                .spacingEnabled()
                                .sizeUndefined()
                                .addComponent(filter1)
                                .addComponent(filter2))
                        .addComponent(Alignment.BOTTOM_RIGHT, expandRatio(-1), horizontalLayout()
                                .spacingEnabled()
                                .addComponent(search)
                                .addComponent(clear)))
                .addComponent(table)
                .build();
```
