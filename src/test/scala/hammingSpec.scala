import hamming.ham
import org.scalacheck.Gen.some
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class hammingSpec extends AnyFlatSpec {

  behavior of "hamming"

  it should "Count Hamming Distance" in {
    ham("GAGCCTACTAACGGGAT", "CATCGTAATGACGGCCT") shouldBe Some(7)
  }
}
