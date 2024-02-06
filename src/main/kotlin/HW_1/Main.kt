package HW_1

fun main() {
    val exampleTest = exampleTestRunner()
    exampleTest.runTest(TestSteps(), {println("Код теста")})
}