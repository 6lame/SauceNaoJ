## SauceNaoJ
A simple to use library for finding the source of images
## Usage
Maven
```
<dependency>
    <groupId>io.github.6lame</groupId>
    <artifactId>SauceNaoJ</artifactId>
    <version>1.0</version>
</dependency>
```
Gradle
```
implementation 'io.github.6lame:SauceNaoJ:1.0'
```
Code sample
```
SauceNao sauceNao = new SauceNao.SauceNaoBuilder()
                .apiKey("api_key")
                .numberOfResults(5)
                .build();
SauceNaoRes sauceNaoRes = sauceNao.getSource("url or file");
System.out.println(sauceNaoRes.getAllResults());
```
## Api key
You can get the api key on saucenao.com/user.php
