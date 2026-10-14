# Java Concurrency Samples

Small Java 8 examples: multithreading, JUnit 5 unit tests,
and a custom mini testing framework based on annotations and reflection.

## Contents

| Package | What it does |
|---------|--------------|
| `waitnotify` | Three threads take turns printing the letters `A`, `B`, `C` (ABCABC...), synchronized via `wait` / `notify`. Known limitation: on the last round the threads hang in `wait()` |
| `race` | Race simulation: cars start simultaneously (`CountDownLatch`, `CyclicBarrier`), at most two are allowed into the tunnel at a time (`Semaphore`), and the winner and the end of the race are announced |
| `arrays` | `ArrayUtils`: the elements after the last 4 in an array, and a check that an array consists only of 1s and 4s; covered by JUnit 5 tests |
| `testframework` | The annotations `@BeforeSuite`, `@Test(priority)`, `@AfterSuite` and the `AbleToDoTest` runner, which uses reflection to execute methods in priority order |

## Tech stack

| Area | Technologies |
|------|--------------|
| Language | Java 8 |
| Build | Maven |
| Tests | JUnit 5 |

## Build and run

```bash
mvn package
java -cp target/classes race.Main
java -cp target/classes testframework.AbleToDoTest
```
