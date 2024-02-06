package HW_1

class exampleTestRunner: TestRunner<TestSteps> {
    override fun runTest(steps: TestSteps, test: () -> Unit) {
        steps.before()
        test.invoke()
        steps.after()
    }
}