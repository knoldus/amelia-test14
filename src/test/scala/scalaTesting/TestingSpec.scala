
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestingSpec extends AnyFlatSpec with Matchers {
    "1" should "equal 1" in {
        
        1 shouldEqual 1

    }
}