package HW_1

interface TestRunner<T> {
     fun runTest(steps: T, test: () -> Unit)
}