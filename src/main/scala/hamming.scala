object hamming  {

  def ham(x: String, y: String): Option[Int] = {
  if (x.length == y.length) {
    Some(x.zip(y)
      .count(tuple => tuple._1 !=tuple._2))
  }
    else None
  }
}
