# jcore

[![Keep a Changelog v1.1.0 badge](https://img.shields.io/badge/changelog-Keep%20a%20Changelog%20v1.1.0-%23E05735)](CHANGELOG.md)
[![Maven Central](https://img.shields.io/maven-central/v/io.github.caffetteria/jcore.svg)](https://central.sonatype.com/artifact/io.github.caffetteria/jcore)
[![license](https://img.shields.io/badge/License-MIT%20License-teal.svg)](https://opensource.org/license/mit)
[![code of conduct](https://img.shields.io/badge/conduct-Contributor%20Covenant-purple.svg)](https://github.com/fugerit-org/fj-universe/blob/main/CODE_OF_CONDUCT.md)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=caffetteria_jcore&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=caffetteria_jcore)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=caffetteria_jcore&metric=coverage)](https://sonarcloud.io/summary/new_code?id=caffetteria_jcore)

[![Java runtime version](https://img.shields.io/badge/run%20on-java%208+-%23113366.svg?style=for-the-badge&logo=openjdk&logoColor=white)](https://universe.fugerit.org/src/docs/versions/java11.html)
[![Java build version](https://img.shields.io/badge/build%20on-java%2011+-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)](https://universe.fugerit.org/src/docs/versions/java11.html)
[![Apache Maven](https://img.shields.io/badge/Apache%20Maven-3.9.0+-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)](https://universe.fugerit.org/src/docs/versions/maven3_9.html)

## Quickstart

```xml
<dependency>
    <groupId>io.github.caffetteria</groupId>
    <artifactId>jcore</artifactId>
    <version>${jcore-version}</version>
</dependency>
```

Equivalente ad una System.loadLibrary() ma verificando che la libreria sia presente al massimo una volta : 

```java
HelperLL.ll( "test_ll_fug1" );
```
