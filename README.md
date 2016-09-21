# Justplay
--

Sounds at the ease of hand. Justplay is a simple wrapper to reproduce sounds easily on Android Apps.

## Key Feature

It accepts multiple sources:

* _RAW:_ Local stored raw files
* _URI:_ URI pointing to audio files, regardless of their origin.
* _URL:_ Directly stream a audio file and play it.

## Usage
Whenever you need to play a sound, you only need to call the library, with the sound source in any of the formats  and the 

```java
JustPlay.thisAudio(soundSource, this)
```
* 1. If you try to play the same sound repeatedly or different files toghether it will work as expected.
* 2. It initiates a new task per sound.

### Contact Us
For **questions** or **general comments** regarding the use of this library, please use our public
[hipchat room](http://inaka.net/hipchat).

If you find any **bugs** or have a **problem** while using this library, please [open an issue](https://github.com/inaka/galgo/issues/new) in this repo (or a pull request :)).

And you can check all of our open-source projects at [inaka.github.io](http://inaka.github.io)