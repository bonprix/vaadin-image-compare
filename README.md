Vaadin Image Compare
==============

A simple Image Comparison. It's based on the JavaScript Plugin [ImageComparison](https://github.com/M-Ulyanov/ImageComparison/)

![screenshot](assets/screenshot.png)

Workflow
========

Add the dependency to your pom. You don't neet to compire GWT because it's an JavaScript addon without use of GWT...

```xml
<dependency>
    <groupId>org.vaadin.addons</groupId>
    <artifactId>vaadin-image-compare</artifactId>
    <version>${vaadin-image-compare-version}</version>
</dependency>
```

Details to the addon you can find on [Vaadin](https://vaadin.com/directory/component/imagecompare)

Usage
========

Simple place the component to your Layout. It will fit within the available area. You don't need to resize images...

```java
new ImageCompare(new ImageHolder("./VAADIN/sample/cat-1.jpg", "sweet with colors"),
                new ImageHolder("./VAADIN/sample/cat-1-bw.jpg", "black white"))
```


The MIT License (MIT)
-------------------------

Copyright (c) 2017 rocketbase.io

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
