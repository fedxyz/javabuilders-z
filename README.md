# Notice

This is a fork of the original [Javabuilders](https://github.com/jacek99/javabuilders) project.

I am not going to maitain or add new features to it, I just tried to fix the `illegal reflective access`
problems related to jdk9 module system. It seems to work right now without any warning but I can't say for sure because
the project use reflection a lot.

## Gradle

The project's artifacts are published on [JitPack](https://jitpack.io/#fedxyz/javabuilders-z)

```
    repositories {
       ...
      maven { url 'https://jitpack.io' }
    }

    dependencies {
      ...

      implementation 'com.github.fedxyz.javabuilders-z:javabuilder-z-swing:1.3.1'
      implementation 'com.github.fedxyz.javabuilders-z:javabuilder-z-swing-glazedlists:1.3.1'
    }

```

You can read the [Original README](Original_README.md).
